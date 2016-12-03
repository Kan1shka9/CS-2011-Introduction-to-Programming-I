package CS2011.Lecture18;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Pane_StackPane_2 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
				
		Text txt = new Text("Hello World");
		Button b = new Button("Click me!");
		
		StackPane pane = new StackPane();
		// StackPane stacks components in “back to front” order -> First text and then the button
		pane.getChildren().add(txt);
		pane.getChildren().add(b);
		
		Scene sc = new Scene(pane, 300, 250);
		
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(sc);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}