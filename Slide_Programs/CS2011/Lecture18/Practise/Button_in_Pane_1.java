package CS2011.Lecture18.Practise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Button_in_Pane_1 extends Application {
	
	@Override
	public void start (Stage primaryStage) {
		
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("Fine"));
		
		Scene sc = new Scene(pane,200,50);
		
		primaryStage.setTitle("All used");
		primaryStage.setScene(sc);
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}