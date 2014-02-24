package eu.hohenegger.clippingsparser.gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.RecognitionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import eu.hohenegger.clippingsparser.model.Clipping;

public class Starter {

	private static void runGui(List<Clipping> clippings) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("MyClippingsViewer");

		SashForm sashForm = createLayout(shell);

		Table table = createTable(sashForm);
		Text contentField = createContentViewer(sashForm);

		sashForm.setWeights(new int[] { 3, 1 });

		createTable(table);
		enableSelection(table, contentField);

		OpenListener openListener = new OpenListener(table, clippings);
		Menu menu = createMenu(shell, openListener);
		shell.setMenuBar(menu);

		Point shellSize = new Point(table.getSize().x + 20, 500);
		shell.setSize(shellSize);
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	private static void createTable(Table table) {
		TableColumn titleColumn = createTitleColumn(table);
		TableColumn contentColumn = createContentColumn(table);
		createTypeColumn(table);
		TableColumn dateColumn = createDateColumn(table);
		createFromColumn(table);
		createToColumn(table);

		enableSorting(table, titleColumn, dateColumn);
		pack(table, contentColumn);
	}

	private static void createToColumn(Table table) {
		TableColumn toLocationColumn = new TableColumn(table, SWT.NONE, 5);
		toLocationColumn.setText("To");
	}

	private static void createFromColumn(Table table) {
		TableColumn fromLocationColumn = new TableColumn(table, SWT.NONE, 4);
		fromLocationColumn.setText("From");
	}

	private static TableColumn createDateColumn(Table table) {
		TableColumn dateColumn = new TableColumn(table, SWT.NONE, 3);
		dateColumn.setText("Date");
		return dateColumn;
	}

	private static void createTypeColumn(Table table) {
		TableColumn typeColumn = new TableColumn(table, SWT.NONE, 2);
		typeColumn.setText("Type");
	}

	private static TableColumn createContentColumn(Table table) {
		TableColumn contentColumn = new TableColumn(table, SWT.NONE, 1);
		contentColumn.setText("Content");
		return contentColumn;
	}

	private static TableColumn createTitleColumn(Table table) {
		TableColumn titleColumn = new TableColumn(table, SWT.NONE, 0);
		titleColumn.setText("Title");
		return titleColumn;
	}

	private static Text createContentViewer(SashForm sashForm) {
		final Text contentField = new Text(sashForm, SWT.MULTI | SWT.BORDER
				| SWT.H_SCROLL | SWT.V_SCROLL | SWT.READ_ONLY | SWT.WRAP);
		return contentField;
	}

	private static Table createTable(SashForm sashForm) {
		Table table = new Table(sashForm, SWT.BORDER | SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);
		table.setHeaderVisible(true);
		return table;
	}

	private static SashForm createLayout(final Shell shell) {
		shell.setLayout(new FillLayout());
		SashForm sashForm = new SashForm(shell, SWT.VERTICAL);
		return sashForm;
	}

	private static void enableSelection(final Table table,
			final Text contentField) {
		Listener itemSelectionListener = new Listener() {
			public void handleEvent(Event event) {
				TableItem item = (TableItem) event.item;
				contentField.setText(item.getText(1));
			}
		};

		table.addListener(SWT.Selection, itemSelectionListener);
	}

	private static void enableSorting(final Table table,
			final TableColumn titleColumn, final TableColumn dateColumn) {
		Listener titleSortListener = new TitleSortListener(table);

		Listener dateSortListener = new DateSortListener(table);
		titleColumn.addListener(SWT.Selection, titleSortListener);
		dateColumn.addListener(SWT.Selection, dateSortListener);
		table.setSortColumn(dateColumn);
		table.setSortDirection(SWT.DOWN);
		Event sortEvent = new Event();
		sortEvent.widget = dateColumn;
		dateSortListener.handleEvent(sortEvent);
	}

	private static Menu createMenu(final Shell shell, OpenListener openListener) {
		Menu menu = new Menu(shell, SWT.BAR);
		final Menu filemenu = createFileMenu(menu, shell);
		final MenuItem openItem = createOpen(filemenu);
		openItem.addSelectionListener(openListener);

		createExit(filemenu);
		return menu;
	}

	private static void pack(final Table table, final TableColumn contentColumn) {
		TableColumn[] columns = table.getColumns();
		for (TableColumn tableColumn : columns) {
			tableColumn.pack();
		}
		contentColumn.setWidth(240);
	}

	private static Menu createFileMenu(Menu m, Shell shell) {
		final MenuItem file = new MenuItem(m, SWT.CASCADE);
		file.setText("&File");
		final Menu filemenu = new Menu(shell, SWT.DROP_DOWN);
		file.setMenu(filemenu);
		return filemenu;
	}

	private static MenuItem createOpen(final Menu filemenu) {
		final MenuItem openItem = new MenuItem(filemenu, SWT.PUSH);
		openItem.setText("&Open\tCTRL+O");
		openItem.setAccelerator(SWT.CTRL + 'O');
		return openItem;
	}

	private static MenuItem createExit(final Menu filemenu) {
		final MenuItem exitItem = new MenuItem(filemenu, SWT.PUSH);
		exitItem.setText("E&xit");
		exitItem.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				System.exit(0);
			}
		});
		return exitItem;
	}

	public static void main(String[] args) throws IOException,
			RecognitionException {
		List<Clipping> clippings = new ArrayList<Clipping>();

		if (!(args.length == 0)) {
			clippings = ParserHelper.parse(args[0]);
		}

		runGui(clippings);
		System.exit(0);
	}
}
