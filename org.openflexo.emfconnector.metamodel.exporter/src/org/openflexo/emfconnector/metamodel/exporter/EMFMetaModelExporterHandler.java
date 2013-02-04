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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.window.Window;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.BundleSpecification;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class EMFMetaModelExporterHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		EMFMetaModelExporterDialog dialog = new EMFMetaModelExporterDialog(
				new Shell(SWT.H_SCROLL | SWT.V_SCROLL | SWT.RESIZE));
		dialog.setUriToPackage(EPackage.Registry.INSTANCE);
		if (dialog.open() == Window.OK) {
			try {
				URI genModelLocation = EcorePlugin.INSTANCE
						.getEPackageNsURIToGenModelLocationMap().get(
								dialog.getUri());
				Resource.Factory genModelFactory = Resource.Factory.Registry.INSTANCE
						.getFactory(genModelLocation);
				Resource genModelResource = genModelFactory
						.createResource(genModelLocation);
				genModelResource.load(null);
				EList<EObject> genModelContents = genModelResource
						.getContents();
				if (genModelContents.size() == 1
						&& genModelContents.get(0) instanceof GenModel) {
					GenModel genModel = (GenModel) genModelContents.get(0);
					EList<GenPackage> genPackages = genModel.getGenPackages();
					if (genPackages.size() == 1) {
						GenPackage genPackage = genPackages.get(0);
						String fileExtension = genPackage.getFileExtension();
						Object resourceFactoryObject = Resource.Factory.Registry.INSTANCE
								.getExtensionToFactoryMap().get(fileExtension);
						if (resourceFactoryObject == null) {
							resourceFactoryObject = Resource.Factory.Registry.INSTANCE
									.getExtensionToFactoryMap().get("*");
						}
						Resource.Factory resourceFactory = null;
						if (resourceFactoryObject instanceof Resource.Factory.Descriptor) {
							resourceFactory = ((Resource.Factory.Descriptor) resourceFactoryObject)
									.createFactory();
						} else {
							resourceFactory = (Resource.Factory) resourceFactoryObject;
						}

						Class<?>[] interfaces = dialog.getEPackage().getClass()
								.getInterfaces();
						if (interfaces.length == 1
								&& interfaces[0].isInterface()
								&& EPackage.class
										.isAssignableFrom(interfaces[0])) {
							exportModel(dialog.getExportPath(), FrameworkUtil
									.getBundle(dialog.getEPackage().getClass())
									.getSymbolicName(), FrameworkUtil
									.getBundle(resourceFactory.getClass())
									.getSymbolicName(), fileExtension,
									interfaces[0].getCanonicalName(),
									resourceFactory.getClass()
											.getCanonicalName());
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	protected void exportModel(String exportPath, String ePackageBundleName,
			String resourceFactoryBundleName, String extension,
			String ePackage, String resourceFactory) {
		File bundleNameFile = new File(exportPath + File.separator
				+ ePackageBundleName);
		bundleNameFile.mkdirs();
		Set<File> bundleFiles = new HashSet<File>();
		Set<String> bundleIdToAvoid = new HashSet<String>();
		exportBundle(ePackageBundleName, bundleNameFile.getAbsolutePath(),
				bundleFiles, bundleIdToAvoid);
		exportBundle(resourceFactoryBundleName,
				bundleNameFile.getAbsolutePath(), bundleFiles, bundleIdToAvoid);
		for (File bundleFile : bundleFiles) {
			File destFile = new File(bundleNameFile.getAbsoluteFile()
					+ File.separator + bundleFile.getName());
			copyFile(bundleFile, destFile);
		}
		try {
			Properties properties = new Properties();
			properties.put("EXTENSION", extension);
			properties.put("PACKAGE", ePackage);
			properties.put("RESOURCE_FACTORY", resourceFactory);
			FileOutputStream fos = new FileOutputStream(new File(
					(exportPath + File.separator + ePackageBundleName
							+ File.separator + "emf.properties")));
			properties.store(fos, "");
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void exportBundle(String bundleSymbolicName, String exportPath,
			Set<File> bundleFiles, Set<String> bundleToAvoid) {
		try {
			if (!bundleToAvoid.contains(bundleSymbolicName)) {
				bundleToAvoid.add(bundleSymbolicName);
				BundleDescription bundleDescription = Platform
						.getPlatformAdmin().getState()
						.getBundle(bundleSymbolicName, null);
				Bundle bundle = Platform.getBundle(bundleDescription
						.getSymbolicName());
				File bundleFile = FileLocator.getBundleFile(bundle);
				bundleFiles.add(bundleFile);
				for (BundleSpecification bundleRequirement : bundleDescription
						.getRequiredBundles()) {
					exportBundle(bundleRequirement.getName(), exportPath,
							bundleFiles, bundleToAvoid);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

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
