/**
 * 
 * Copyright (c) 2013, Openflexo
 * 
 * This file is part of ./org.openflexo.emfconnector.metamodel.exporter.application.dialog/src/org/openflexo/emfconnector/metamodel/exporter/application/dialog/EMFMetaModelExporterApplicationDialog.java, a component of the software infrastructure 
 * developed at Openflexo.
 * 
 * 
 * Openflexo is dual-licensed under the European Union Public License (EUPL, either 
 * version 1.1 of the License, or any later version ), which is available at 
 * https://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 * and the GNU General Public License (GPL, either version 3 of the License, or any 
 * later version), which is available at http://www.gnu.org/licenses/gpl.html .
 * 
 * You can redistribute it and/or modify under the terms of either of these licenses
 * 
 * If you choose to redistribute it and/or modify under the terms of the GNU GPL, you
 * must include the following additional permission.
 *
 *          Additional permission under GNU GPL version 3 section 7
 *
 *          If you modify this Program, or any covered work, by linking or 
 *          combining it with software containing parts covered by the terms 
 *          of EPL 1.0, the licensors of this Program grant you additional permission
 *          to convey the resulting work. * 
 * 
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE. 
 *
 * See http://www.openflexo.org/license.html for details.
 * 
 * 
 * Please contact Openflexo (openflexo-contacts@openflexo.org)
 * or visit www.openflexo.org if you need additional information.
 * 
 */

package org.openflexo.emfconnector.metamodel.exporter.application.dialog;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.openflexo.emfconnector.metamodel.exporter.ui.EMFMetaModelExportWizard;

public class EMFMetaModelExporterApplicationDialog implements IApplication {

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
		this.context = null;
	}
}
