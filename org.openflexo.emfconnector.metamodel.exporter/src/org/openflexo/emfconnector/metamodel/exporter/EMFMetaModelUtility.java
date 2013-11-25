/** Copyright (c) 2013, THALES SYSTEMES AEROPORTES - All Rights Reserved
 * Author : Gilles Besançon
 *
 * This file is part of OpenFlexo.
 *
 * OpenFlexo is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OpenFlexo is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OpenFlexo. If not, see <http://www.gnu.org/licenses/>.
 *
 * Additional permission under GNU GPL version 3 section 7
 *
 * If you modify this Program, or any covered work, by linking or 
 * combining it with eclipse EMF (or a modified version of that library), 
 * containing parts covered by the terms of EPL 1.0, the licensors of this 
 * Program grant you additional permission to convey the resulting work.
 *
 * Contributors :
 *
 */
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
