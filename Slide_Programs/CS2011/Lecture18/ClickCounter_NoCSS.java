package CS2011.Lecture18;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ClickCounter_NoCSS extends Application{
	
	int numClicked = 0;
	int rowCounter;
	int columnCounter;
	
	public void start(Stage primaryStage) {
		
		Label l1 = new Label("Buttons Clicked");
		
		Label l2 = new Label("0");
		
		HBox hb = new HBox();
		hb.getChildren().add(l1);
		hb.getChildren().add(l2);
		
		BorderPane bp = new BorderPane();
		
		GridPane gp = new GridPane();
		
		Scene sc = new Scene(bp);
		
		for (rowCounter = 0; rowCounter< 10; rowCounter++) {
			for (columnCounter = 0; columnCounter< 10 ; columnCounter++) {
				
				Button b = new Button("Unclicked");
				b.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
					
					boolean isClicked = false;

					public void handle(Event event) {
						if (isClicked == false) {
							isClicked = true;
							b.setText("Clicked");
							numClicked++;
						}
						else {
							isClicked = false;
							b.setText("UnClicked");
							numClicked--;
						}
						l2.setText(String.valueOf(numClicked));
					}
				});
				gp.add(b, columnCounter, rowCounter);
			}
		}
		bp.setTop(hb);
		bp.setBottom(gp);
		
		primaryStage.setScene(sc);
		primaryStage.show();
	
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}