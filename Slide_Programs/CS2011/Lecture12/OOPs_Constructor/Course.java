package CS2011.Lecture12.OOPs_Constructor;

public class Course {
	
	// private variables
	private int courseNum;
	private String instructorName;
	
	// public methods(constructor)
	public Course(int courseNumIn, String instructorNameIn){
		courseNum = courseNumIn;
		instructorName = instructorNameIn;
	}

	public int getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String toString(){
		return courseNum + "; Instructor: " + instructorName;
	}	
	
}