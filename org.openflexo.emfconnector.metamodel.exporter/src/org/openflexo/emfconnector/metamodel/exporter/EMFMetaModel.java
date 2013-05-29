package org.openflexo.emfconnector.metamodel.exporter;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

public class EMFMetaModel {
	public final String fileExtension;
	public final String ePackageUri;
	public final EPackage ePackage;
	public final Resource.Factory resourceFactory;

	public EMFMetaModel(String fileExtension, String ePackageUri,
			EPackage ePackage, Resource.Factory resourceFactory) {
		this.fileExtension = fileExtension;
		this.ePackageUri = ePackageUri;
		this.ePackage = ePackage;
		this.resourceFactory = resourceFactory;
	}
}
