package eu.hohenegger.clippingsparser.gui;

import java.text.Collator;
import java.util.Locale;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

final class TitleSortListener implements Listener {
	private final Table table;

	public TitleSortListener(Table table) {
		this.table = table;
	}

	@Override
	public void handleEvent(Event event) {
		TableItem[] items = table.getItems();
		Collator collator = Collator.getInstance(Locale.getDefault());
		TableColumn column = (TableColumn) event.widget;
		int index = 0;
		for (int i = 1; i < items.length; i++) {
			String value1 = items[i].getText(index);
			for (int j = 0; j < i; j++) {
				String value2 = items[j].getText(index);
				if (collator.compare(value1, value2) < 0) {
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