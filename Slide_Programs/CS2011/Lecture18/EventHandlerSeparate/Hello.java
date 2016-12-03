package CS2011.Lecture18.EventHandlerSeparate;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Hello extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		Button b = new Button("Click Me!");
		
		EventHandler<Event> handler = new MyClickHandler<Event>();
		b.addEventHandler(MouseEvent.MOUSE_CLICKED, handler);
		
		StackPane pane = new StackPane();
		pane.getChildren().add(b);
		
		Scene sc = new Scene(pane, 300, 300);
		
		primaryStage.setScene(sc);
		primaryStage.show();
	} 
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}