package CS2011.Lecture17.TopDown;

import java.util.ArrayList;
import java.util.List;

public class Store {
	
	private String name;

	private List<Salesperson> staff; 
	// we must stub out the Salesperson class for this to work, but it doesn’t need anything beyond a class signature and one set of curly braces.
 	
	public Store(){
		staff = new ArrayList<Salesperson>();
	}

	public void setName(String nameIn) {
		name = nameIn;
	}

	public void hireStaffPerson() {
		// We can't make this work until Salesperson is working, so we just write a stub
		System.out.println("hireStaffPerson not implemented yet");
	}

	public void fireStaffPerson(){
		//See note above
	}

	public String toString() {
		return name;
	}

	public String listStaff() {
		// can't make this work until after we get Salesperson working
		return "listStaff not implemented yet";
	}

}