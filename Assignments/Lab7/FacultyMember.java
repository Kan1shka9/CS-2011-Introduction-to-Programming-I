package Homework1.Lab7;

import java.util.ArrayList;

public class FacultyMember extends Person {
	
	/**
	 * FacultyMember is also subclass of Person. 
	 * A FacultyMember has an employee id number and a teaching schedule, which is an ArrayList of Courses. 
	 * Provide a way to assign a FacultyMember to teach an existing Course.
	 **/
	
	private int employeeId;
	private ArrayList<Course> course = new ArrayList<Course>();
	
	public FacultyMember (String personNameIn, int streetNumberIn, String streetNameIn, String cityIn, String stateIn, String countryIn, int employeeIdIn) {
		this.setPersonName(personNameIn);
		this.setAddress(new Address(streetNumberIn, streetNameIn, cityIn, stateIn, countryIn));
		employeeId = employeeIdIn;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public ArrayList<Course> getCourse() {
		return course;
	}
	
	public void addCourse(String courseTitle, String courseIdentifier) {
		course.add(new Course(courseTitle, courseIdentifier));
	}
	
	public void deleteCourse(int courseIdentifier) {
		course.remove(courseIdentifier);		
	}
	
	public String toString() {
		return "Employee ID :- " + employeeId + "\nFaculty Name :- " + getPersonName() + getAddress() + getCourse() + "\n";
	}
	 
}