package CS2011.Lecture19.Menu;

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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class JavaFXMenuDemo extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		// Node
		MenuBar menuBar = setUpMenuBar(primaryStage);
		
		// Pane
		GridPane gp = new GridPane();
		gp.getChildren().add(menuBar);
		
		// Scene
		Scene scene = new Scene(gp, 300, 300);
		scene.getStylesheets().add("styles/application.css");
			
		// Stage
		primaryStage.setTitle("Menu Sample");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	private MenuBar setUpMenuBar(Stage primaryStage) {
		
		MenuBar menuBar = new MenuBar();
		
		Menu fileMenu = setUpFileMenu();
		Menu helpMenu = setUpHelpMenu(primaryStage);
		
		menuBar.getMenus().add(fileMenu);
		menuBar.getMenus().add(helpMenu);
		
		return menuBar;
		
	}

	private Menu setUpFileMenu() {
		
		Menu fileMenu = new Menu("File");
		
		MenuItem quitItem = new MenuItem("Quit");
		quitItem.setOnAction( e -> { System.exit(0); } );
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
				Button okButton = new Button("OK");
				Popup popup = new Popup();
				
				// Pane
				VBox v = new VBox();
				v.getChildren().addAll(t, okButton);
				v.getStyleClass().add("about");				
				
				okButton.setOnAction( e -> { popup.hide(); } );
								
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