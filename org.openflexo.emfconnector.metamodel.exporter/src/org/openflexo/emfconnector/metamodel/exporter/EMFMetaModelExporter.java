package org.openflexo.emfconnector.metamodel.exporter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.BundleSpecification;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class EMFMetaModelExporter {

	/** Plugin org.eclipse.core.runtime. */
	protected static String ORG_ECLIPSE_CORE_RUNTIME_PLUGIN_ID = "org.eclipse.core.runtime";
	/** Plugin org.eclipse.emf.ecore. */
	protected static String ORG_ECLIPSE_EMF_ECORE_PLUGIN_ID = "org.eclipse.emf.ecore";

	public static void exportMetaModels(List<EMFMetaModel> emfMetaModels,
			String exportPath) {
		for (EMFMetaModel emfMetaModel : emfMetaModels) {
			exportMetaModel(emfMetaModel, exportPath);
		}
	}

	public static void exportMetaModel(EMFMetaModel emfMetaModel,
			String exportPath) {
		exportMetaModel(exportPath,
				FrameworkUtil.getBundle(emfMetaModel.ePackage.getClass())
						.getSymbolicName(),
				FrameworkUtil
						.getBundle(emfMetaModel.resourceFactory.getClass())
						.getSymbolicName(), emfMetaModel.ePackageUri,
				emfMetaModel.fileExtension, emfMetaModel.ePackage.getClass()
						.getInterfaces()[0].getCanonicalName(),
				emfMetaModel.resourceFactory.getClass().getCanonicalName());
	}

	protected static void exportMetaModel(String exportPath,
			String ePackageBundleName, String resourceFactoryBundleName,
			String metaModelUri, String extension, String ePackage,
			String resourceFactory) {
		File bundleNameFile = new File(exportPath + File.separator
				+ ePackageBundleName);
		bundleNameFile.mkdirs();
		Set<File> bundleFiles = new HashSet<File>();
		Set<String> exportedBundleSymbolicNames = new HashSet<String>();

		// Compute Bundle Files
		exportBundle(ePackageBundleName, bundleNameFile.getAbsolutePath(),
				bundleFiles, exportedBundleSymbolicNames);
		exportBundle(resourceFactoryBundleName,
				bundleNameFile.getAbsolutePath(), bundleFiles,
				exportedBundleSymbolicNames);

		// Copy Bundle Files
		for (File bundleFile : bundleFiles) {
			File destFile = new File(bundleNameFile.getAbsoluteFile()
					+ File.separator + bundleFile.getName());
			copyFile(bundleFile, destFile);
		}

		// Write emf.properties file.
		File emfPropertiesFile = new File((exportPath + File.separator
				+ ePackageBundleName + File.separator + "emf.properties"));
		try {
			Properties properties = new Properties();
			properties.put("URI", metaModelUri);
			properties.put("EXTENSION", extension);
			properties.put("PACKAGE", ePackage);
			properties.put("RESOURCE_FACTORY", resourceFactory);
			FileOutputStream fos = new FileOutputStream(emfPropertiesFile);
			properties.store(fos, "");
			fos.close();
		} catch (Exception e) {
			System.out.println("Error while writing emf.properties file : "
					+ emfPropertiesFile.getAbsolutePath());
		}
	}

	protected static boolean canExportBundle(String bundleSymbolicName,
			Set<String> exportedBundleSymbolicNames) {
		boolean result = true;
		if (bundleSymbolicName
				.equalsIgnoreCase(ORG_ECLIPSE_CORE_RUNTIME_PLUGIN_ID)
				|| bundleSymbolicName
						.equalsIgnoreCase(ORG_ECLIPSE_EMF_ECORE_PLUGIN_ID)
				|| exportedBundleSymbolicNames.contains(bundleSymbolicName)) {
			result = false;
		}
		return result;
	}

	protected static void exportBundle(String bundleSymbolicName,
			String exportPath, Set<File> bundleFiles,
			Set<String> exportedBundleSymbolicNames) {
		try {
			if (canExportBundle(bundleSymbolicName, exportedBundleSymbolicNames)) {
				exportedBundleSymbolicNames.add(bundleSymbolicName);

				BundleDescription bundleDescription = Platform
						.getPlatformAdmin().getState()
						.getBundle(bundleSymbolicName, null);
				if (bundleDescription != null) {
					Bundle bundle = Platform.getBundle(bundleDescription
							.getSymbolicName());
					if (bundle != null) {
						File bundleFile = FileLocator.getBundleFile(bundle);
						if (bundleFile != null) {
							bundleFiles.add(bundleFile);
							for (BundleSpecification bundleRequirement : bundleDescription
									.getRequiredBundles()) {
								exportBundle(bundleRequirement.getName(),
										exportPath, bundleFiles,
										exportedBundleSymbolicNames);
							}
						} else {
							throw new Exception();
						}
					} else {
						throw new Exception();
					}
				} else {
					throw new Exception();
				}
			}
		} catch (Exception e) {
			System.out.println("Error while exporting bundle : "
					+ bundleSymbolicName);
		}
	}

	protected static void copyFile(File srcFile, File destFile) {
		try {
			InputStream in = new FileInputStream(srcFile);
			OutputStream out = new FileOutputStream(destFile);

			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			System.out.println("Couldn't copy : " + srcFile.getAbsolutePath());
		}
	}
}
