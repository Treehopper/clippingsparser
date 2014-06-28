package eu.hohenegger.clippingsparser.gui;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MenuItemBuilder;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.control.SplitPaneBuilder;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.VBoxBuilder;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.antlr.runtime.RecognitionException;
import org.controlsfx.dialog.Dialogs;

import eu.hohenegger.clippingsparser.model.Clipping;

@SuppressWarnings("restriction")
public class Starter extends Application {

	private static final int CONTENT_HEIGHT = 60;
	TableView<Clipping> table = new TableView<Clipping>();
	private Text contentBox;

	private final class OpenHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			FileChooser fileChooser = new FileChooser();

			FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter(
					"My Clippings.txt)", "*.txt");
			fileChooser.getExtensionFilters().add(extFilter);

			File file = fileChooser.showOpenDialog(null);

			if (file == null) {
				return;
			}
			String selected = file.getPath();

			try {
				fillTable(table, ParserHelper.parse(selected));
			} catch (IOException | RecognitionException e) {
				Dialogs.create().owner(null).title("Error")
						.message(e.getLocalizedMessage()).showError();
				showErrorDialog();
			}

		}
	}

	public static void main(String[] args) throws IOException,
			RecognitionException {
		launch(args);

		System.exit(0);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("MyClippingsViewer");
		final Group rootGroup = new Group();
		final Scene scene = new Scene(rootGroup, 800, 450, Color.WHITE);
		final MenuBar menuBar = buildMenuBarWithMenus(stage.widthProperty());

		final VBox vbox = new VBox();
		vbox.setSpacing(0);
		vbox.setPadding(new Insets(0, 0, 0, 0));
		rootGroup.getChildren().add(vbox);

		StackPane upperPane = new StackPane();
		StackPane lowerPane = new StackPane();
		SplitPane.setResizableWithParent(upperPane, true);
		SplitPane.setResizableWithParent(lowerPane, false);
		final SplitPane splitPane = SplitPaneBuilder.create()
				.items(upperPane, lowerPane)
				// Environment A
				.dividerPositions(new double[] { 0.7, 0.3 })
				.orientation(Orientation.VERTICAL).build();

		upperPane.getChildren().add(buildTable(stage.widthProperty()));
		contentBox = new Text();
		contentBox.setTextAlignment(TextAlignment.LEFT);
		
		


		stage.heightProperty().addListener((ChangeListener<Number>) (arg0, oldValue, newValue) -> splitPane.setPrefHeight(newValue.doubleValue() - CONTENT_HEIGHT));
		
		

		stage.widthProperty().addListener((ChangeListener<Number>) (arg0, oldValue, newValue) -> contentBox.setWrappingWidth(newValue.doubleValue() - 20));
		
		lowerPane.getChildren().add(contentBox);

		vbox.getChildren().addAll(menuBar, splitPane);

		vbox.prefHeightProperty().bind(stage.heightProperty());

		stage.setScene(scene);
		stage.show();
	}

	private void showErrorDialog() {
		Stage dialogStage = new Stage();
		dialogStage.initModality(javafx.stage.Modality.WINDOW_MODAL);
		dialogStage.setScene(new Scene(VBoxBuilder.create()
				.children(new Text("Error"), new Button("Ok."))
				.alignment(javafx.geometry.Pos.CENTER).padding(new Insets(5))
				.build()));
		dialogStage.show();
	}

	private TableView<Clipping> buildTable(
			ReadOnlyDoubleProperty readOnlyDoubleProperty) {
		table.setEditable(true);

		// Add change listener
		table.getSelectionModel()
				.selectedItemProperty()
				.addListener(
						(ChangeListener<Clipping>) (observableValue, oldValue,
								newValue) -> {
							// Check whether item is selected and set value of
							// selected item to Label
							if (table.getSelectionModel().getSelectedItem() != null) {
								Clipping tableProps = newValue;
								contentBox.setText(tableProps.getContent());
							}
						});

		TableColumn<Clipping, String> title = new TableColumn<Clipping, String>(
				"Title");
		title.setMinWidth(100);
		title.setCellValueFactory(new PropertyValueFactory<Clipping, String>(
				"title"));

		TableColumn<Clipping, String> content = new TableColumn<Clipping, String>(
				"Content");
		content.setMinWidth(300);
		content.setCellValueFactory(new PropertyValueFactory<Clipping, String>(
				"content"));

		TableColumn<Clipping, String> type = new TableColumn<Clipping, String>(
				"Type");
		type.setMinWidth(100);
		type.setCellValueFactory(new PropertyValueFactory<Clipping, String>(
				"type"));

		TableColumn<Clipping, String> fromLocation = new TableColumn<Clipping, String>(
				"From");
		fromLocation.setMinWidth(100);
		fromLocation
				.setCellValueFactory(new PropertyValueFactory<Clipping, String>(
						"fromLocation"));

		TableColumn<Clipping, String> toLocation = new TableColumn<Clipping, String>(
				"To");
		toLocation.setMinWidth(100);
		toLocation
				.setCellValueFactory(new PropertyValueFactory<Clipping, String>(
						"toLocation"));

		ObservableList<TableColumn<Clipping, ?>> columns = table.getColumns();
		columns.addAll(title, content, type, fromLocation, toLocation);

		table.prefWidthProperty().bind(readOnlyDoubleProperty);

		return table;
	}

	private MenuBar buildMenuBarWithMenus(
			final ReadOnlyDoubleProperty menuWidthProperty) {
		final MenuBar menuBar = new MenuBar();

		// Prepare left-most "File" drop-down menu

		// Prepare "Examples" drop-down menu

		// Prepare "Help" drop-down menu
		final Menu fileMenu = new Menu("File");
		final MenuItem fileOpenItem = MenuItemBuilder
				.create()
				.text("Open File")
				.onAction(new OpenHandler())
				.accelerator(
						new KeyCodeCombination(KeyCode.O,
								KeyCombination.CONTROL_DOWN)).build();
		fileMenu.getItems().add(fileOpenItem);
		fileMenu.getItems().add(new SeparatorMenuItem());
		final MenuItem exitItem = MenuItemBuilder
				.create()
				.text("Exit")
				.onAction(actionEvent -> System.exit(0))
				.accelerator(
						new KeyCodeCombination(KeyCode.X,
								KeyCombination.CONTROL_DOWN)).build();

		fileMenu.getItems().add(exitItem);

		menuBar.getMenus().add(fileMenu);

		// bind width of menu bar to width of associated stage
		menuBar.prefWidthProperty().bind(menuWidthProperty);

		return menuBar;
	}

	private static void fillTable(TableView<Clipping> table2,
			List<Clipping> clippings) {
		table2.setItems(FXCollections.observableArrayList(clippings));
	}
}
