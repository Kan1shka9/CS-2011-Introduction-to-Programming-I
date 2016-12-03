package CS2011.Lecture18.Practise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class DemoMenu extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		 // Menu 1
		 Menu menu1 = new Menu("File");
		 
		 MenuItem newMenuItem = new MenuItem("New");
		 newMenuItem.setAccelerator(new KeyCodeCombination(KeyCode.N, KeyCombination.CONTROL_DOWN));
		 
		 MenuItem saveMenuItem = new MenuItem("Save");
		 saveMenuItem.setAccelerator(new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_DOWN));
		 
		 menu1.getItems().add(newMenuItem);
		 menu1.getItems().add(saveMenuItem);
		 
		 // Menu 2
		 Menu menu2 = new Menu("Quit");
		 
		 MenuItem exitMenuItem = new MenuItem("Exit");
		 exitMenuItem.setAccelerator(new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_DOWN));
		 
		 menu2.getItems().add(exitMenuItem);
		 
		 menu2.setOnAction(e -> { 
				System.exit(0); 
		 });
		 
		 // Menubar
		 MenuBar menubar = new MenuBar();
		 menubar.getMenus().add(menu1);
		 menubar.getMenus().add(menu2);
		 
		 // Scene
		 Scene sc = new Scene(menubar, 300, 300);
		 
		 // Stage
		 primaryStage.setTitle("Menus");
		 primaryStage.setScene(sc);
		 primaryStage.show();
		 
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}