package CS2011.Lecture18;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Pane_Group extends Application{
	
	@Override
	public void start(Stage primaryStage) {
	
		// Node
		Rectangle r = new Rectangle();
		r.setWidth(200);
		r.setHeight(100);
		r.setFill(Color.RED);
		r.setX(50);
		r.setY(50);
		
		Circle c = new Circle();
		c.setRadius(100);
		c.setFill(Color.GREEN);
		c.setCenterX(300);
		c.setCenterY(300);
		
		// Pane
		Group g = new Group();
		g.getChildren().add(r);
		g.getChildren().add(c);
		
		// Scene
		Scene sc = new Scene(g, 500, 500);
		
		// Stage
		primaryStage.setScene(sc);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}