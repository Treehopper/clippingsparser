package eu.hohenegger.clippingsparser.gui;

import java.io.IOException;
import java.util.List;

import org.antlr.runtime.RecognitionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import eu.hohenegger.clippingsparser.model.Clipping;

class OpenListener extends SelectionAdapter {
	private Table table;

	public OpenListener(Table table, List<Clipping> clippings) {
		this.table = table;

		fillTable(table, clippings);
	}

	@Override
	public void widgetSelected(SelectionEvent event) {
		Shell shell = Display.getCurrent().getActiveShell();
		FileDialog fd = new FileDialog(shell, SWT.OPEN);
		fd.setText("Open");
		fd.setFilterPath("C:/");
		String[] filterExt = { "*.txt" };
		fd.setFilterExtensions(filterExt);
		String selected = fd.open();

		if (selected != null) {
			table.removeAll();
			try {
				fillTable(table, ParserHelper.parse(selected));
			} catch (IOException | RecognitionException e) {
				MessageBox dialog = new MessageBox(Display.getCurrent().getActiveShell(), SWT.ICON_ERROR
						| SWT.OK | SWT.CANCEL);
				dialog.setText("Error");
				dialog.setMessage(e.getLocalizedMessage());
				
				e.printStackTrace(); //TODO
			}

			// contentColumn.setWidth(240);
			TableColumn[] columns = table.getColumns();
			for (TableColumn tableColumn : columns) {
				tableColumn.pack();
			}
			table.pack();

			Point shellSize = new Point(table.getSize().x + 20, 500);
			shell.setSize(shellSize);
		}
	}

	private static void fillTable(Table table, List<Clipping> clippings) {
		TableItem item;
		for (Clipping clipping : clippings) {
			item = new TableItem(table, 0);

			item.setData(clipping);

			item.setText(0, clipping.getTitle());
			if (clipping.getContent() != null) {
				item.setText(1, clipping.getContent());
			}
			item.setText(2, clipping.getType().toString());
			item.setText(3, clipping.getDateString());
			item.setText(4, clipping.getFromLocation());

			if (clipping.getToLocation() != null) {
				item.setText(5, clipping.getToLocation());
			}
		}
	}
}