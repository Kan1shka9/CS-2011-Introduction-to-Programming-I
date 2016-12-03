package CS2011.Lecture18.EventHandlerSeparate;

import javax.swing.JOptionPane;

import javafx.event.Event;
import javafx.event.EventHandler;

// EventHandler is an interface
// After implements it is EventHandler<Event> and not EventHandler<Event>()
public class MyClickHandler<ActionEvent> implements EventHandler<Event>{
	
	@Override
	public void handle(Event event) {
		JOptionPane.showMessageDialog(null, "Thanks!");
	}
	
}