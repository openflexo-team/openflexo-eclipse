package org.openflexo.emfconnector.metamodel.exporter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;

public class EMFMetaModelUtility {
	public static List<EMFMetaModel> getEMFMetaModels() {
		List<EMFMetaModel> result = new ArrayList<EMFMetaModel>();
		for (Entry<String, Object> ePackageEntry : EPackage.Registry.INSTANCE
				.entrySet()) {
			try {
				String ePackageUri = ePackageEntry.getKey();
				EPackage ePackage = null;
				if (ePackageEntry.getValue() instanceof EPackage.Descriptor) {
					ePackage = ((EPackage.Descriptor) ePackageEntry.getValue())
							.getEPackage();
				} else {
					ePackage = (EPackage) ePackageEntry.getValue();
				}
				if (ePackage != null) {
					URI genModelLocation = EcorePlugin
							.getEPackageNsURIToGenModelLocationMap().get(
									ePackageUri);
					if (genModelLocation != null) {
						Resource.Factory genModelFactory = Resource.Factory.Registry.INSTANCE
								.getFactory(genModelLocation);
						if (genModelFactory != null) {
							Resource genModelResource = genModelFactory
									.createResource(genModelLocation);
							genModelResource.load(null);
							EList<EObject> genModelContents = genModelResource
									.getContents();
							if (genModelContents.size() == 1
									&& genModelContents.get(0) instanceof GenModel) {
								GenModel genModel = (GenModel) genModelContents
										.get(0);
								if (genModel != null) {
									EList<GenPackage> genPackages = genModel
											.getGenPackages();
									if (genPackages.size() == 1) {
										GenPackage genPackage = genPackages
												.get(0);
										String fileExtension = genPackage
												.getFileExtension();
										Object resourceFactoryObject = Resource.Factory.Registry.INSTANCE
												.getExtensionToFactoryMap()
												.get(fileExtension);
										if (resourceFactoryObject == null) {
											resourceFactoryObject = Resource.Factory.Registry.INSTANCE
													.getExtensionToFactoryMap()
													.get("*");
										}
										Resource.Factory resourceFactory = null;
										if (resourceFactoryObject instanceof Resource.Factory.Descriptor) {
											resourceFactory = ((Resource.Factory.Descriptor) resourceFactoryObject)
													.createFactory();
										} else {
											resourceFactory = (Resource.Factory) resourceFactoryObject;
										}

										Class<?>[] interfaces = ePackage
												.getClass().getInterfaces();
										if (interfaces.length == 1
												&& interfaces[0].isInterface()
												&& EPackage.class
														.isAssignableFrom(interfaces[0])) {
											EMFMetaModel emfMetaModel = new EMFMetaModel(
													fileExtension, ePackageUri,
													ePackage, resourceFactory);
											result.add(emfMetaModel);
										}
									}
								}
							}
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
