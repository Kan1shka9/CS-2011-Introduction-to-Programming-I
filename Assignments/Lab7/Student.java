package Homework1.Lab7;

import java.util.ArrayList;

public class Student extends Person{
	
	/**
	 * Student is a subclass of Person. 
	 * In addition to the data inherited from Person, a student has CIN number and a course schedule represented by an ArrayList of Courses (objects of class Course). 
	 * You must provide ways for a Student to add an existing Course.
	 **/
	
	private int cin;
	private ArrayList<Course> course = new ArrayList<Course>();
	
	public Student(String personNameIn, int streetNumberIn, String streetNameIn, String cityIn, String stateIn, String countryIn, int cinIn) {
		this.setPersonName(personNameIn);
		this.setAddress(new Address(streetNumberIn, streetNameIn, cityIn, stateIn, countryIn));
		cin = cinIn;		
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
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
		return "Student ID :- " + cin + "\nStudent Name :- " + getPersonName() + getAddress() + getCourse() + "\n";
	}
	
}