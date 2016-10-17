package CS2011.Lecture12.OOPs_Constructor;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String deptName;

	// Declare list
	private List<Course> courses;

	public Department(String deptNameIn) {
		// Initialize list
		courses = new ArrayList<Course>();
		deptName = deptNameIn;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptNameIn) {
		this.deptName = deptNameIn;
	}

	public List<Course> getCourses() {
		return courses;
	}
	
	// setCourse is removed instead addCourse and dropCourse has been added manually

	public void addCourse(Course course) {
		courses.add(course);
	}

	public void dropCourse(Course course) {
		courses.remove(course);
	}

	public String toString() {
		return deptName;
	}
	
}