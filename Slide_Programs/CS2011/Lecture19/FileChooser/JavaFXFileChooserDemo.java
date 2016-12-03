package CS2011.Lecture19.FileChooser;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class JavaFXFileChooserDemo extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		
		// Node
		Text text = new Text();
		MenuBar menuBar = setUpMenuBar(primaryStage, text);
		
		// Pane
		VBox vb = new VBox();
		vb.getChildren().add(menuBar);
		vb.getChildren().add(text);
		
		// Scene
		Scene scene = new Scene(vb, 300, 300);
		scene.getStylesheets().add("styles/application_filechooser.css");

		// Stage
		primaryStage.setTitle("File Chooser Sample");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	private MenuBar setUpMenuBar(Stage stage, Text text) {
		
		MenuBar menuBar = new MenuBar();
		
		Menu fileMenu = setUpFileMenu(stage, text);
		Menu helpMenu = setUpHelpMenu(stage);
		
		menuBar.getMenus().add(fileMenu);
		menuBar.getMenus().add(helpMenu);
		
		return menuBar;
		
	}
	
	
	private Menu setUpFileMenu(Stage stage, Text text) {
		
		Menu fileMenu = new Menu("File");
		MenuItem openItem = new MenuItem("Open");
		
		openItem.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				
				FileChooser fileChooser = new FileChooser();
				File file = fileChooser.showOpenDialog(stage);
				
				if (file != null) {
					text.setText(getFileContents(file));
				}
				
			}
			
		});
		
		openItem.setAccelerator(new KeyCodeCombination(KeyCode.O, KeyCombination.CONTROL_DOWN));
		fileMenu.getItems().add(openItem);
		MenuItem quitItem = new MenuItem("Quit");
		
		quitItem.setOnAction(e -> { System.exit(0); });

		quitItem.setAccelerator(new KeyCodeCombination(KeyCode.Q, KeyCombination.CONTROL_DOWN));
		fileMenu.getItems().add(quitItem);
		return fileMenu;
	}

	private Menu setUpHelpMenu(Stage primaryStage) {
		
		Menu helpMenu = new Menu("Help");
		MenuItem aboutItem = new MenuItem("About");
		
		aboutItem.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				
				// Node
				Text t = new Text("Copyright 2014 by John Hurley");
				t.getStyleClass().add("text");
				
				Button okButton = new Button("OK");
				
				Popup popup = new Popup();
				
				// Pane
				VBox v = new VBox();
				v.getStyleClass().add("about");
				v.getChildren().addAll(t, okButton);
				
				okButton.setOnAction(e -> {
					popup.hide();
				});

				popup.getContent().addAll(v);
				popup.show(primaryStage);
				
			}

		});

		aboutItem.setAccelerator(new KeyCodeCombination(KeyCode.A, KeyCombination.CONTROL_DOWN));		
		helpMenu.getItems().add(aboutItem);		
		return helpMenu;
		
	}
	
	private String getFileContents(File file) {
		
		StringBuilder sb = new StringBuilder();
		
		try {
			Scanner reader;
			reader = new Scanner(file);
			// ... Loop as long as there are input lines.
			String line = null;
			while (reader.hasNextLine()) {
				if(!(sb.length()==0)) 
					sb.append("\n");
				line = reader.nextLine();
				sb.append(line);
				
			}
			reader.close();
		} 
		catch (IOException ex) {
			ex.printStackTrace();
		}
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}