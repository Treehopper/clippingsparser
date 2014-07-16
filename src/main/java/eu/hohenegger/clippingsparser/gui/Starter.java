package eu.hohenegger.clippingsparser.gui;



import javafx.application.Application;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToolBar;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.antlr.runtime.RecognitionException;
import org.controlsfx.dialog.Dialogs;

import eu.hohenegger.clippingsparser.model.Clipping;

@SuppressWarnings("restriction")
public class Starter extends Application {

	private static double initialY = 450;
	private static double initialX = 800;
	private static final int CONTENT_HEIGHT = 60;
	private TableView<Clipping> table = new TableView<Clipping>();
	private Text contentBox;

	private final class OpenHandler implements EventHandler<MouseEvent> {
		@Override
		public void handle(MouseEvent event) {
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

	public static void main(String... args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		//		stage.initStyle(StageStyle.UNDECORATED);

		stage.setTitle("MyClippingsViewer");
		final Group rootGroup = new Group();
		Scene scene = new Scene(rootGroup, initialX, initialY, Color.WHITE);

		// TODO: how can css be deployed?
		// scene.getStylesheets().add(this.getClass().
		// getResource("/css/base.css").toExternalForm());

		Button openButton = new Button("Open");
		openButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new OpenHandler());

		Button exitButton = new Button("Exit");
		exitButton.addEventHandler(MouseEvent.MOUSE_CLICKED,
				event -> System.exit(0));

		ToolBar toolBar = new ToolBar(openButton, exitButton);

		final VBox vbox = new VBox();
		vbox.setSpacing(0);
		vbox.setPadding(new Insets(0, 0, 0, 0));
		rootGroup.getChildren().add(vbox);

		StackPane upperPane = new StackPane();
		StackPane lowerPane = new StackPane();
		SplitPane.setResizableWithParent(upperPane, true);
		SplitPane.setResizableWithParent(lowerPane, false);
		SplitPane splitPane = new SplitPane();
		splitPane.getItems().addAll(upperPane, lowerPane);
		splitPane.setDividerPositions(new double[] { 0.7, 0.3 });
		splitPane.setOrientation(Orientation.VERTICAL);

		upperPane.getChildren().add(buildTable(stage.widthProperty()));
		contentBox = new Text();
		contentBox.setTextAlignment(TextAlignment.LEFT);

		stage.heightProperty()
		.addListener(
				(observableValue, oldValue, newValue) -> splitPane
				.setPrefHeight(newValue.doubleValue()
						- CONTENT_HEIGHT));

		stage.widthProperty().addListener(
				(observableValue, oldValue, newValue) -> contentBox
				.setWrappingWidth(newValue.doubleValue() - 20));

		lowerPane.getChildren().add(contentBox);

		vbox.getChildren().addAll(toolBar, splitPane);

		vbox.prefHeightProperty().bind(stage.heightProperty());

		stage.setScene(scene);
		stage.show();
	}

	private void showErrorDialog() {
		Stage dialogStage = new Stage();
		dialogStage.initModality(Modality.WINDOW_MODAL);
		VBox vBox = new VBox();
		vBox.getChildren().addAll(new Text("Error"), new Button("Ok."));
		vBox.setAlignment(Pos.CENTER);
		vBox.setPadding(new Insets(5));

		dialogStage.setScene(new Scene(vBox));
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
		columns.add(title);
		columns.add(content);
		columns.add(type);
		columns.add(fromLocation);
		columns.add(toLocation);

		table.prefWidthProperty().bind(readOnlyDoubleProperty);

		return table;
	}


	private static void fillTable(TableView<Clipping> table2,
			List<Clipping> clippings) {
		table2.setItems(FXCollections.observableArrayList(clippings));
	}
}
