package org.openflexo.emfconnector.metamodel.exporter.application.dialog;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class EMFMetaModelExporterApplicationDialog implements IApplication {

	public Object start(IApplicationContext context) throws Exception {
		System.out.println("Hi");
		return IApplication.EXIT_OK;
	}

	public void stop() {
	}
}
