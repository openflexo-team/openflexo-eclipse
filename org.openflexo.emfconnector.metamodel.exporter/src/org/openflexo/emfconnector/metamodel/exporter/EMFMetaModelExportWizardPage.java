/**
 * 
 */
package org.openflexo.emfconnector.metamodel.exporter;

import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.osgi.service.prefs.Preferences;

/**
 * @author ASUS
 * 
 */
public class EMFMetaModelExportWizardPage extends WizardPage {

	protected final Preferences preferences;
	protected String exportPath = null;
	protected String uri = null;
	protected EPackage ePackage = null;

	protected EMFMetaModelExportWizardPage(Preferences preferences) {
		super("EMF Meta Model");
		setTitle(getName());
		this.preferences = preferences;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets
	 * .Composite)
	 */
	@Override
	public void createControl(final Composite parent) {
		GridLayout gridLayout1 = new GridLayout();
		parent.setLayout(gridLayout1);

		Composite container = new Composite(parent, SWT.NONE);
		GridLayout gridLayout3 = new GridLayout(3, false);
		container.setLayout(gridLayout3);
		GridData containerGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		container.setLayoutData(containerGridData);

		// Export folder
		final String exportPathPreference = "exportpath";
		Label exportPathLabel = new Label(container, SWT.NONE);
		final Text exportPathText = new Text(container, SWT.BORDER);
		Button exportPathButton = new Button(container, SWT.PUSH);
		exportPathLabel.setText("Export Path :");
		exportPathLabel.setToolTipText("Export path");
		exportPathText.setText(preferences.get(exportPathPreference, ""));
		exportPathText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				exportPath = ((Text) e.widget).getText();
				preferences.put(exportPathPreference, exportPath);
				setPageComplete(checkPageComplete());
			}
		});
		exportPathButton.setText("...");
		exportPathButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				widgetDefaultSelected(e);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				DirectoryDialog dialog = new DirectoryDialog(parent.getShell(), SWT.SINGLE);
				// Default value preference.
				String preferenceValue = preferences.get(exportPathPreference, "");
				dialog.setFilterPath(preferenceValue);
				String path = dialog.open();
				if (path != null) {
					exportPathText.setText(path);
					preferences.put(exportPathPreference, path);
					exportPath = path;
				}
				setPageComplete(checkPageComplete());
			}
		});

		// MetaModel List
		ListViewer packageUriListViewer = new ListViewer(container, SWT.SINGLE | SWT.V_SCROLL);
		GridData packageUriListGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		packageUriListGridData.horizontalSpan = 3;
		packageUriListViewer.getList().setLayoutData(packageUriListGridData);
		packageUriListViewer.setContentProvider(new IStructuredContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			}

			@Override
			public void dispose() {
			}

			@Override
			public Object[] getElements(Object inputElement) {
				return ((Set<String>) inputElement).toArray();
			}
		});
		packageUriListViewer.setSorter(new ViewerSorter());
		packageUriListViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				if (selection.toList().size() > 0) {
					String objectSelected = (String) selection.getFirstElement();
					uri = objectSelected;
					EPackage thePackage = null;
					Object packageFromUri = EPackage.Registry.INSTANCE.get(uri);
					if (packageFromUri instanceof EPackage.Descriptor) {
						thePackage = ((EPackage.Descriptor) packageFromUri).getEPackage();
					} else {
						thePackage = (EPackage) packageFromUri;
					}
					if (thePackage != null) {
						ePackage = thePackage;
					} else {
						uri = null;
						ePackage = null;
					}
				} else {
					uri = null;
					ePackage = null;
				}
				setPageComplete(checkPageComplete());
			}
		});
		packageUriListViewer.setInput(EPackage.Registry.INSTANCE.keySet());

		// Required to avoid an error in the system
		setControl(parent);
		setPageComplete(false);
	}

	protected boolean checkPageComplete() {
		return getMetaModelUri() != null && getMetaModelEPackage() != null && getExportPath() != null;
	}

	public String getMetaModelUri() {
		return uri;
	}

	public EPackage getMetaModelEPackage() {
		return ePackage;
	}

	public String getExportPath() {
		return exportPath;
	}
}
