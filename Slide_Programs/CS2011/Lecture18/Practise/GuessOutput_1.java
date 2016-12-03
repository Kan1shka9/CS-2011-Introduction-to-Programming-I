package CS2011.Lecture18.Practise;

import javafx.application.Application;
import javafx.stage.Stage;

public class GuessOutput_1 extends Application {
	
	public GuessOutput_1() {
		System.out.println("Test constructor is invoked");
	}
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
	System.out.println("start method is invoked");
	}
	
	public static void main(String[] args) {
		System.out.println("launch application");
		Application.launch(args);
	}
	
}
