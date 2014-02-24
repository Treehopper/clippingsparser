package eu.hohenegger.clippingsparser.gui;

import java.text.ParseException;
import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import eu.hohenegger.clippingsparser.model.Clipping;

final class DateSortListener implements Listener {
	private final Table table;

	public DateSortListener(Table table) {
		this.table = table;
	}

	@Override
	public void handleEvent(Event event) {
		TableItem[] items = table.getItems();
		TableColumn column = (TableColumn) event.widget;
		int index = 3;
		for (int i = 1; i < items.length; i++) {
			Date value1 = null;
			try {
				value1 = Clipping.getDateOutputFormatter().parse(
						items[i].getText(index));
			} catch (ParseException e) {
				MessageBox dialog = new MessageBox(Display.getCurrent().getActiveShell(), SWT.ICON_ERROR
						| SWT.OK | SWT.CANCEL);
				dialog.setText("Error");
				dialog.setMessage(e.getLocalizedMessage());
				
				e.printStackTrace(); //TODO
			}
			for (int j = 0; j < i; j++) {
				Date value2 = null;
				try {
					value2 = Clipping.getDateOutputFormatter().parse(
							items[j].getText(index));
				} catch (ParseException e) {
					MessageBox dialog = new MessageBox(Display.getCurrent().getActiveShell(), SWT.ICON_ERROR
							| SWT.OK | SWT.CANCEL);
					dialog.setText("Error");
					dialog.setMessage(e.getLocalizedMessage());
					
					e.printStackTrace(); //TODO
				}
				if (value1.compareTo(value2) > 0) {
					String[] values = { items[i].getText(0),
							items[i].getText(1), items[i].getText(2),
							items[i].getText(3), items[i].getText(4),
							items[i].getText(5) };
					items[i].dispose();
					TableItem item = new TableItem(table, SWT.NONE, j);
					item.setText(values);
					items = table.getItems();
					break;
				}
			}
		}
		table.setSortColumn(column);
	}
}