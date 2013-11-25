package org.openflexo.emfconnector.metamodel.exporter.application.dialog;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.openflexo.emfconnector.metamodel.exporter.EMFMetaModelExportWizard;

public class EMFMetaModelExporterApplicationDialog  implements IApplication {

	  protected IApplicationContext context = null;
	  
	public EMFMetaModelExporterApplicationDialog() {
	}
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		this.context = context;
		Display display = PlatformUI.createDisplay();
		try {
			Shell shell = new Shell(display);
			EMFMetaModelExportWizard wizard = new EMFMetaModelExportWizard();
			WizardDialog dialog = new WizardDialog(shell, wizard);
			dialog.open();
		} finally {
			display.dispose();
		}
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
	}
}
