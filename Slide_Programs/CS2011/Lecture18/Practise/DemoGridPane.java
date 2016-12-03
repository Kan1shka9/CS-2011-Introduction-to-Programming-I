package CS2011.Lecture18.Practise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DemoGridPane extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		
		// Nodes
		Label fname = new Label("First Name");
		TextField fnameField = new TextField();
		 
		Label lname = new Label("Last Name");
		TextField lnameField = new TextField();
		
		// Pane
		GridPane gp = new GridPane();
		gp.add(fname, 0, 0);
		gp.add(lname, 0, 1);
		gp.add(fnameField, 1, 0);
		gp.add(lnameField, 1, 1);
		
		// Scene
		Scene sc = new Scene(gp, 300, 300);
		
		// Stage
		primaryStage.setTitle("Login Form");
		primaryStage.setScene(sc);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}