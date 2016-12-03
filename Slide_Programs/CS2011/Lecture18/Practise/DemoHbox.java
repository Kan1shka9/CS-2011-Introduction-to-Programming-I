package CS2011.Lecture18.Practise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DemoHbox extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		
		// Node
		TextField textfield = new TextField("New Textfield");
		Button button = new Button("New Button");
		Label label = new Label("New Label");
		
		// Pane
		HBox hbox = new HBox();
		hbox.getChildren().add(textfield);
		hbox.getChildren().add(label);
		hbox.getChildren().add(button);
		
		// Scene
		Scene sc = new Scene(hbox, 300, 300);
		
		// Stage
		primaryStage.setTitle("Hbox_Demo");
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
}