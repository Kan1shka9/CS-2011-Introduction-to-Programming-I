package CS2011.Lecture18;

// https://www.eclipse.org/efxclipse/install.html#for-the-lazy

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class Pane_StackPane_1 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		Text txt = new Text("Hello");
		
		StackPane pane = new StackPane();
        pane.getChildren().add(txt);
		
        Scene sc = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(sc);
        primaryStage.show();
        
    }
		
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}