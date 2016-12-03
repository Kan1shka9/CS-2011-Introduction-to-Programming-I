/**
 * Create a simple JavaFX GUI that offers a way to enter a String and to run each of these methods on it and show the result.
 */
package Homework1.Lab12;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class GUI_Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		RecursiveProbs prob = new RecursiveProbs();
		
		TextField text = new TextField();
		text.setPadding(new Insets(10, 10, 10, 10));

		Label label2 = new Label("Enter the character");
		label2.setPadding(new Insets(10, 10, 10, 10));

		TextField text2 = new TextField();
		text2.setPadding(new Insets(10, 10, 10, 10));

		Button button = new Button("Enter");

		Label label3 = new Label("Reverse String is:");
		label3.setPadding(new Insets(10, 10, 10, 10));

		Label label8 = new Label("All characters Same:");
		label8.setPadding(new Insets(10, 10, 10, 10));

		Label label9 = new Label("String Contains the Characters");
		label9.setPadding(new Insets(10, 10, 10, 10));

		Label label10 = new Label("Characters Count:");
		label10.setPadding(new Insets(10, 10, 10, 10));

		BorderPane bp = new BorderPane();
		Label label1 = new Label("Enter the String");
		label1.setPadding(new Insets(10, 10, 10, 10));

		GridPane gp = new GridPane();
		gp.add(label1, 1, 1);
		gp.add(text, 2, 1);
		gp.add(label2, 1, 3);
		gp.add(text2, 2, 3);
		gp.add(button, 2, 5);
		gp.add(label3, 1, 10);
		gp.add(label8, 1, 12);
		gp.add(label9, 1, 14);
		gp.add(label10, 1, 16);

		button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {

			@Override
			public void handle(Event event) {

				String reverse = prob.recursiveReverse(text.getText());
				Label label4 = new Label(reverse);
				label4.setPadding(new Insets(10, 10, 10, 10));

				boolean charSame = prob.recursiveAllCharactersSame(text.getText());
				Label label5 = new Label(String.valueOf(charSame));
				label5.setPadding(new Insets(10, 10, 10, 10));

				boolean charContain = prob.recursiveContains(text2.getText().charAt(0), text.getText());
				Label label6 = new Label(String.valueOf(charContain));
				label6.setPadding(new Insets(10, 10, 10, 10));

				int count = prob.recursiveCount(text2.getText().charAt(0), text.getText());
				Label label7 = new Label(String.valueOf(count));
				label7.setPadding(new Insets(10, 10, 10, 10));

				gp.getChildren().removeAll(label4, label5, label6, label7);
				gp.add(label4, 2, 10);
				gp.add(label5, 2, 12);
				gp.add(label6, 2, 14);
				gp.add(label7, 2, 16);

			}

		});

		bp.setCenter(gp);

		Scene scene = new Scene(bp, 400, 400);
	

		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
}