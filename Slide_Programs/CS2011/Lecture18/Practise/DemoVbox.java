package CS2011.Lecture18.Practise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoVbox extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		// Node
		TextField textfield = new TextField("New Textfield");
		Button button = new Button("New Button");
		Label label = new Label("New Label");
				
		// Pane
		VBox vbox = new VBox();
		vbox.getChildren().add(textfield);
		vbox.getChildren().add(label);
		vbox.getChildren().add(button);
				
		// Scene
		Scene sc = new Scene(vbox, 300, 300);
				
		// Stage
		primaryStage.setTitle("Hbox_Demo");
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}