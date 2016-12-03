package CS2011.Lecture15.compareObjects;

public class Student implements Comparable<Student> {
	
	private String name;
	private Double gpa;

	public Student(String nameIn, Double gpaIn) {
		name = nameIn;
		gpa = gpaIn;
	}

	public String toString(){
		return "Name: " + name + "; GPA: " + gpa;
	}

	@Override
	public int compareTo(Student otherStudent) {
		return this.gpa.compareTo(otherStudent.gpa);
	}

}