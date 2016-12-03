package CS2011.Lecture15.StudyThis_CopyConstructor;

public class Employee {
	
	String name;
	String id;
	
	// Constructor 1
	public Employee(String name, String id) {
		this.name = name;
		this.id = id;		
	}
	
	public String toString() {
		return "name= " + name + " id= " + id; 	
	}
	
	// Copy Constructor
	// otheremployee is an object
	public Employee(Employee otheremployee) {
		this.id = otheremployee.id;
		this.name = otheremployee.name;
	}
	
}