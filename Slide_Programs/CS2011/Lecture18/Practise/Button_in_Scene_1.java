package CS2011.Lecture18.Practise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Button_in_Scene_1 extends Application {
	
	@Override
	public void start (Stage primaryStage){
		
		Button b1 = new Button("Have FUN");
		
		Scene sc = new Scene(b1,200,300);
		
		primaryStage.setTitle("MyJavaFx");
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
