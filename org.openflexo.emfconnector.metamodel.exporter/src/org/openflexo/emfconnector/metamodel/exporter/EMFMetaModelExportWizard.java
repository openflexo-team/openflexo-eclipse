/**
 * 
 */
package org.openflexo.emfconnector.metamodel.exporter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.BundleSpecification;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.prefs.Preferences;

/**
 * @author ASUS
 * 
 */
public class EMFMetaModelExportWizard extends Wizard implements IExportWizard {

	/** Export Page. */
	protected final EMFMetaModelExportWizardPage page;

	/** Plugin org.eclipse.core.runtime. */
	protected String ORG_ECLIPSE_CORE_RUNTIME_PLUGIN_ID = "org.eclipse.core.runtime";
	/** Plugin org.eclipse.emf.ecore. */
	protected String ORG_ECLIPSE_EMF_ECORE_PLUGIN_ID = "org.eclipse.emf.ecore";

	protected Preferences preferences = ConfigurationScope.INSTANCE.getNode(Activator.PLUGIN_ID);

	/**
	 * 
	 * Constructor.
	 */
	public EMFMetaModelExportWizard() {
		page = new EMFMetaModelExportWizardPage(preferences);
		addPage(page);
	}

	/**
	 * 
	 * Follow the link.
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	/**
	 * 
	 * Follow the link.
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		exportMetaModel(page.getMetaModelUri(), page.getMetaModelEPackage(), page.getExportPath());
		return true;
	}

	/**
	 * Export MetaModel.
	 * 
	 * @param metaModelUri
	 * @param metaModelPackage
	 * @param exportPath
	 */
	protected void exportMetaModel(String metaModelUri, EPackage metaModelPackage, String exportPath) {
		try {
			URI genModelLocation = EcorePlugin.getEPackageNsURIToGenModelLocationMap().get(metaModelUri);
			if (genModelLocation != null) {
				Resource.Factory genModelFactory = Resource.Factory.Registry.INSTANCE.getFactory(genModelLocation);
				Resource genModelResource = genModelFactory.createResource(genModelLocation);
				genModelResource.load(null);
				EList<EObject> genModelContents = genModelResource.getContents();
				if (genModelContents.size() == 1 && genModelContents.get(0) instanceof GenModel) {
					GenModel genModel = (GenModel) genModelContents.get(0);
					EList<GenPackage> genPackages = genModel.getGenPackages();
					if (genPackages.size() == 1) {
						GenPackage genPackage = genPackages.get(0);
						String fileExtension = genPackage.getFileExtension();
						Object resourceFactoryObject = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(fileExtension);
						if (resourceFactoryObject == null) {
							resourceFactoryObject = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get("*");
						}
						Resource.Factory resourceFactory = null;
						if (resourceFactoryObject instanceof Resource.Factory.Descriptor) {
							resourceFactory = ((Resource.Factory.Descriptor) resourceFactoryObject).createFactory();
						} else {
							resourceFactory = (Resource.Factory) resourceFactoryObject;
						}

						Class<?>[] interfaces = metaModelPackage.getClass().getInterfaces();
						if (interfaces.length == 1 && interfaces[0].isInterface() && EPackage.class.isAssignableFrom(interfaces[0])) {
							exportMetaModel(exportPath, FrameworkUtil.getBundle(metaModelPackage.getClass()).getSymbolicName(),
									FrameworkUtil.getBundle(resourceFactory.getClass()).getSymbolicName(), metaModelUri, fileExtension,
									interfaces[0].getCanonicalName(), resourceFactory.getClass().getCanonicalName());
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Export Meta Model.
	 * 
	 * @param exportPath
	 * @param ePackageBundleName
	 * @param resourceFactoryBundleName
	 * @param metaModelUri
	 * @param extension
	 * @param ePackage
	 * @param resourceFactory
	 */
	protected void exportMetaModel(String exportPath, String ePackageBundleName, String resourceFactoryBundleName, String metaModelUri,
			String extension, String ePackage, String resourceFactory) {
		File bundleNameFile = new File(exportPath + File.separator + ePackageBundleName);
		bundleNameFile.mkdirs();
		Set<File> bundleFiles = new HashSet<File>();
		Set<String> bundleIdToAvoid = new HashSet<String>();
		// Default Bundle not to follow up.
		bundleIdToAvoid.add(ORG_ECLIPSE_CORE_RUNTIME_PLUGIN_ID);
		bundleIdToAvoid.add(ORG_ECLIPSE_EMF_ECORE_PLUGIN_ID);
		exportBundle(ePackageBundleName, bundleNameFile.getAbsolutePath(), bundleFiles, bundleIdToAvoid);
		exportBundle(resourceFactoryBundleName, bundleNameFile.getAbsolutePath(), bundleFiles, bundleIdToAvoid);
		for (File bundleFile : bundleFiles) {
			File destFile = new File(bundleNameFile.getAbsoluteFile() + File.separator + bundleFile.getName());
			copyFile(bundleFile, destFile);
		}
		try {
			Properties properties = new Properties();
			properties.put("URI", metaModelUri);
			properties.put("EXTENSION", extension);
			properties.put("PACKAGE", ePackage);
			properties.put("RESOURCE_FACTORY", resourceFactory);
			FileOutputStream fos = new FileOutputStream(new File(
					(exportPath + File.separator + ePackageBundleName + File.separator + "emf.properties")));
			properties.store(fos, "");
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Export Bundle.
	 * 
	 * @param bundleSymbolicName
	 * @param exportPath
	 * @param bundleFiles
	 * @param bundleToAvoid
	 */
	protected void exportBundle(String bundleSymbolicName, String exportPath, Set<File> bundleFiles, Set<String> bundleToAvoid) {
		try {
			if (!bundleToAvoid.contains(bundleSymbolicName)) {
				bundleToAvoid.add(bundleSymbolicName);
				BundleDescription bundleDescription = Platform.getPlatformAdmin().getState().getBundle(bundleSymbolicName, null);
				Bundle bundle = Platform.getBundle(bundleDescription.getSymbolicName());
				File bundleFile = FileLocator.getBundleFile(bundle);
				bundleFiles.add(bundleFile);
				for (BundleSpecification bundleRequirement : bundleDescription.getRequiredBundles()) {
					exportBundle(bundleRequirement.getName(), exportPath, bundleFiles, bundleToAvoid);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Copy File.
	 * 
	 * @param srsFile
	 * @param destFile
	 */
	protected void copyFile(File srsFile, File destFile) {
		try {
			InputStream in = new FileInputStream(srsFile);
			OutputStream out = new FileOutputStream(destFile);

			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
