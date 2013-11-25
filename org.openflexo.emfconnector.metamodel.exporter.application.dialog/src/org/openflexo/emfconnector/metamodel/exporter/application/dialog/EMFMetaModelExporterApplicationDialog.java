package org.openflexo.emfconnector.metamodel.exporter.application.dialog;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.openflexo.emfconnector.metamodel.exporter.EMFMetaModelExportWizard;

public class EMFMetaModelExporterApplicationDialog extends AGraphicalApplication {

	public EMFMetaModelExporterApplicationDialog(String application) {
		super(application);
	}

	@Override
	protected void createShellContent(Shell shell) {
		EMFMetaModelExportWizard wizard = new EMFMetaModelExportWizard();
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.open();
	}
}
