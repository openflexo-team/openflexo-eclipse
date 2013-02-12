/**
 * 
 */
package org.openflexo.emfconnector.metamodel.exporter;

import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @author ASUS
 * 
 */
public class EMFMetaModelExportWizardPage extends WizardPage {

	protected String exportPath = null;
	protected String uri = null;
	protected EPackage ePackage = null;

	protected EMFMetaModelExportWizardPage() {
		super("EMF Meta Model");
		setTitle(getName());
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

		Label exportPathLabel = new Label(container, SWT.NONE);
		exportPathLabel.setText("Export Path :");
		final Text exportPathText = new Text(container, SWT.NONE);
		exportPathText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				exportPath = ((Text) e.widget).getText();
				setPageComplete(checkPageComplete());
			}
		});
		Button exportPathButton = new Button(container, SWT.PUSH);
		exportPathButton.setText("...");
		exportPathButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog directoryDialog = new DirectoryDialog(parent
						.getShell());
				if (exportPathText.getText() != null) {
					directoryDialog.setFilterPath(exportPathText.getText());
				}
				String value = directoryDialog.open();
				if (value != null) {
					exportPathText.setText(value);
					exportPath = value;
				}
				setPageComplete(checkPageComplete());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});

		TableViewer uriToPackageTableViewer = new TableViewer(container,
				SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION
						| SWT.BORDER);
		uriToPackageTableViewer.getTable().setHeaderVisible(true);
		uriToPackageTableViewer
				.setContentProvider(new IStructuredContentProvider() {

					@Override
					public void inputChanged(Viewer viewer, Object oldInput,
							Object newInput) {
					}

					@Override
					public void dispose() {
					}

					@Override
					public Object[] getElements(Object inputElement) {
						return ((Set<Entry<String, Object>>) inputElement)
								.toArray();
					}
				});
		TableViewerColumn uriColumn = new TableViewerColumn(
				uriToPackageTableViewer, SWT.NONE);
		uriColumn.getColumn().setWidth(200);
		uriColumn.getColumn().setText("URI");
		uriColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((Entry<String, Object>) element).getKey();
			}
		});
		uriToPackageTableViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						IStructuredSelection selection = (IStructuredSelection) event
								.getSelection();
						if (selection.toList().size() > 0) {
							Entry<String, Object> objectSelected = (Entry<String, Object>) selection
									.getFirstElement();
							uri = objectSelected.getKey();
							EPackage thePackage = null;
							if (objectSelected.getValue() instanceof EPackage.Descriptor) {
								thePackage = ((EPackage.Descriptor) objectSelected
										.getValue()).getEPackage();
							} else {
								thePackage = (EPackage) objectSelected
										.getValue();
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
		uriToPackageTableViewer.setInput(EPackage.Registry.INSTANCE.entrySet());

		// Required to avoid an error in the system
		setControl(parent);
		setPageComplete(false);
	}

	protected boolean checkPageComplete() {
		return getMetaModelUri() != null && getMetaModelEPackage() != null
				&& getExportPath() != null;
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
