package CS2011.Lecture18.Practise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DemoBorderPane extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		// Nodes
		Button btnTop = new Button("Top");
		Button btnBottom = new Button("Bottom");
		Button btnLeft = new Button("Left");
		Button btnRight = new Button("Right");
		Button btnCenter = new Button("Center");
		
		// Pane
		BorderPane bp = new BorderPane();
		bp.setTop(btnTop);
		bp.setBottom(btnBottom);
		bp.setLeft(btnLeft);
		bp.setRight(btnRight);
		bp.setCenter(btnCenter);
		
		// Scene
		Scene sc = new Scene(bp, 300, 300);
		
		// Stage
		primaryStage.setTitle("Demo Border Pane");
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}