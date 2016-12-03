package CS2011.Lecture15.StudyThis_ObjectClone;

public class Employee implements Cloneable { // Step 1
	
	String name;
	String id;
	
	public Employee(String name, String id) {
		this.name = name;
		this.id = id;		
	}
	
	public String toString() {
		return "name= " + name + " id= " + id; 	
	}
	
	public Employee clone() throws CloneNotSupportedException { // Step 2
		return (Employee)super.clone();
	}
	
}