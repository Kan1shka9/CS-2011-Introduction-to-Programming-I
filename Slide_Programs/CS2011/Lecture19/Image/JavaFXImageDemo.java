package CS2011.Lecture19.Image;

import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class JavaFXImageDemo extends Application {

	VBox vb;
	ScrollPane scrollPane;
	StackPane stackPane;
	
	@Override
	public void start(Stage primaryStage) {
		
		vb = new VBox();
		scrollPane = new ScrollPane();
		stackPane = new StackPane();
		
		// Node
		MenuBar menuBar = setUpMenuBar(primaryStage);
		
		// Pane
		scrollPane.setPrefHeight(1500);
		scrollPane.setContent(stackPane);
		
		StackPane.setAlignment(scrollPane, Pos.BASELINE_CENTER);
		
		vb.getChildren().add(menuBar);
		vb.getChildren().add(scrollPane);
		
		// Scene
		Scene scene = new Scene(vb, 500,500);
		scene.getStylesheets().add("styles/application_image.css");
		
		// Stage
		primaryStage.setTitle("FX Image Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	private MenuBar setUpMenuBar(Stage primaryStage) {
		
		MenuBar menuBar = new MenuBar();
		
		Menu fileMenu = setUpFileMenu(primaryStage);
		Menu helpMenu = setUpHelpMenu(primaryStage);
		
		menuBar.getMenus().add(fileMenu);
		menuBar.getMenus().add(helpMenu);
		
		return menuBar;
		
	}

	private Menu setUpFileMenu(Stage primaryStage) {
		
		Menu fileMenu = new Menu("File");
		
		MenuItem quitItem = new MenuItem("Quit");
		quitItem.setOnAction(e -> { System.exit(0); });
		quitItem.setAccelerator(new KeyCodeCombination(KeyCode.Q, KeyCombination.CONTROL_DOWN));
		
		MenuItem openItem = new MenuItem("Open");
		openItem.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				
				FileChooser fileChooser = new FileChooser();
				File file = fileChooser.showOpenDialog(primaryStage);
				
				if (file != null) {
					Image i;
					
					try {
						String imageFileURI = file.toURI().toURL().toExternalForm();
						i = new Image(imageFileURI);
						ImageView iv = new ImageView(i);
						
						stackPane.getChildren().clear();
						stackPane.getChildren().add(iv);
						stackPane.autosize();
					} 
					
					catch (Exception e) {
						e.printStackTrace();
					}
					
				}
				
			}
			
		});

		openItem.setAccelerator(new KeyCodeCombination(KeyCode.O, KeyCombination.CONTROL_DOWN));
		
		fileMenu.getItems().add(openItem);
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
				Button okButton = new Button("OK");
				Popup popup = new Popup();				
				
				// Pane
				VBox v = new VBox();
				v.getStyleClass().add("about");
				v.getChildren().addAll(t, okButton);
				
				okButton.setOnAction(e -> { popup.hide(); });

				popup.getContent().addAll(v);
				popup.show(primaryStage);
				
			}

		});

		aboutItem.setAccelerator(new KeyCodeCombination(KeyCode.A, KeyCombination.CONTROL_DOWN));
		helpMenu.getItems().add(aboutItem);
		return helpMenu;
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
}