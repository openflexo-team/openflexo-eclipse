package org.openflexo.emfconnector.metamodel.exporter;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class EMFMetaModelExporterDialog extends Dialog {

	protected Map<String, Object> uriToPackage = null;
	protected Map<String, Object> extensionToResourceFactory = null;

	protected String exportPath = null;
	protected String uri = null;
	protected EPackage ePackage = null;

	public EMFMetaModelExporterDialog(IShellProvider parentShell) {
		super(parentShell);
	}

	protected EMFMetaModelExporterDialog(Shell parentShell) {
		super(parentShell);
	}

	public void setUriToPackage(Map<String, Object> uriToPackage) {
		this.uriToPackage = uriToPackage;
	}

	public void setExtensionToResourceFactory(
			Map<String, Object> extensionToResourceFactory) {
		this.extensionToResourceFactory = extensionToResourceFactory;
	}

	public String getExportPath() {
		return exportPath;
	}

	public String getUri() {
		return uri;
	}

	public EPackage getEPackage() {
		return ePackage;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		GridLayout gridLayout = new GridLayout(3, false);
		parent.setLayout(gridLayout);

		Label exportPathLabel = new Label(parent, SWT.NONE);
		exportPathLabel.setText("Export Path :");
		final Text exportPathText = new Text(parent, SWT.NONE);
		exportPathText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				exportPath = ((Text) e.widget).getText();
			}
		});
		Button exportPathButton = new Button(parent, SWT.PUSH);
		exportPathButton.setText("...");
		exportPathButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog directoryDialog = new DirectoryDialog(
						getParentShell());
				if (exportPathText.getText() != null) {
					directoryDialog.setFilterPath(exportPathText.getText());
				}
				String value = directoryDialog.open();
				if (value != null) {
					exportPathText.setText(value);
					exportPath = value;
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});

		TableViewer uriToPackageTableViewer = new TableViewer(parent,
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

					}
				});
		uriToPackageTableViewer.setInput(uriToPackage.entrySet());

		return parent;
	}

	@Override
	protected void okPressed() {
		if (exportPath != null && uri != null && ePackage != null) {
			super.okPressed();
		}
	}
}
