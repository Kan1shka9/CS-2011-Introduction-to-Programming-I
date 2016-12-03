package CS2011.Lecture18;

import java.time.LocalDateTime;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Styling_2 extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		
		Label l = new Label("Hello");
		
		boolean am = getAm();			
		if(am) 
			l.getStyleClass().add("amstyle");
		else 
			l.getStyleClass().add("pmstyle");	
		
		StackPane pane = new StackPane();
		pane.getChildren().add(l);
		
		Scene sc = new Scene(pane, 300, 300);
		sc.getStylesheets().add("styles/style_2.css"); 
		
		primaryStage.setScene(sc);
		primaryStage.show();
	}
	
	private boolean getAm(){
		LocalDateTime d = LocalDateTime.now();
		if(d.getHour() < 12) 
			return true;
		else 
			return false;		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}