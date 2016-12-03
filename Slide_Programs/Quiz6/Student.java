package Quiz6;

public class Student {
	
	private int cin;
	private double gpa;
	 
	public Student(int cin, double gpa) {
	  super();
	  this.cin = cin;
	  this.gpa = gpa;
	}
	 
	public String toString(){
	  return "Student # " + cin + " has GPA of " + gpa;
	} 

}