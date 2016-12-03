package CS2011.Lecture18;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Styling_1 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		Label l = new Label("Hello");
		l.getStyleClass().add("arthur");
		l.getStyleClass().add("beatrice");
		
		StackPane pane = new StackPane();
		pane.getChildren().add(l);
		
		Scene sc = new Scene(pane, 300, 300);
		sc.getStylesheets().add("styles/style.css"); 
		
		primaryStage.setScene(sc);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}