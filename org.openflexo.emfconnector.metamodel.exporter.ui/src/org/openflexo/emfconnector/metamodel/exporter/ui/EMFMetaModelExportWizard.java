package org.openflexo.emfconnector.metamodel.exporter.ui;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.openflexo.emfconnector.metamodel.exporter.EMFMetaModelExporter;
import org.osgi.service.prefs.Preferences;

public class EMFMetaModelExportWizard extends Wizard implements IExportWizard {

	/** Export Page. */
	protected final EMFMetaModelExportWizardPage page;

	/** Preferences. */
	protected Preferences preferences = ConfigurationScope.INSTANCE
			.getNode(Activator.PLUGIN_ID);

	public EMFMetaModelExportWizard() {
		page = new EMFMetaModelExportWizardPage(preferences);
		addPage(page);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	@Override
	public boolean performFinish() {
		EMFMetaModelExporter.exportMetaModels(page.getEMFMetaModel(),
				page.getExportPath());
		return true;
	}

}
