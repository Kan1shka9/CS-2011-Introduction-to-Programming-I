package CS2011.Lecture19.CelsiusConverter;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CelsiusConverter extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		
		Label lblFahr = new Label("Fahrenheit Value: ");
		TextField tfFahr = new TextField();	
		
		Label lblCels = new Label("Celsius Value:");
		Label lblCelsAns = new Label();
		
		Button btnCalc = new Button("Convert");	
		btnCalc.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>(){
			@Override
			public void handle(Event event) {
				double cels = (Double.parseDouble(tfFahr.getText())-32)*5/9;
				lblCelsAns.setText(String.valueOf(cels));
			}			
		});	
		
		GridPane gp = new GridPane();
		gp.getStyleClass().add("pane");
		gp.add(lblFahr, 0, 0);
		gp.add(tfFahr, 2, 0);
		gp.add(lblCels, 0, 1);
		gp.add(lblCelsAns, 2, 1);
		gp.add(btnCalc, 1, 2);
		
		Scene sc = new Scene(gp);
		sc.getStylesheets().add("styles/style_4.css"); 
		
		primaryStage.setScene(sc);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}