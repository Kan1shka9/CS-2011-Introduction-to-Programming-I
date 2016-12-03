package CS2011.Lecture18.Practise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Multiple_Stage_Demo_1 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		Button b1 = new Button("My first button");
		
		Scene sc1 = new Scene(b1,200,300);
		
		primaryStage.setTitle("Scene1");
		primaryStage.setScene(sc1);
		primaryStage.show();
		
		Stage stage = new Stage();
		stage.setTitle("My Stage");
		stage.setScene(new Scene(new Button("My second button"),100,150));
		stage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}