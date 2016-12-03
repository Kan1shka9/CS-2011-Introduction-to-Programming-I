package CS2011.Lecture15.equals;

public class Student {
	
	private String name;
	private Double gpa;

	public Student(String nameIn, Double gpaIn) {
		name = nameIn;
		gpa = gpaIn;
	}

	public String toString() {
		return "Name: " + name + "; GPA: " + gpa;
	}

	@Override
    public boolean equals(Object obj) {
		if (obj == this) 
			return true;
		if (obj == null || obj.getClass() != this.getClass()) 
			return false;
       	Student otherStudent = (Student) obj;
		if (name.equals(otherStudent.name) && gpa.equals(otherStudent.gpa)) 
			return true;
		return false;
   	}

}

// equals cannot be invoked on primitive datatypes