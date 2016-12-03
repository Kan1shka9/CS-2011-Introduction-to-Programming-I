package Homework1.Lab7;

public class Course {
	
	/**
	 * A course has a course identifier (eg, EE-132) and a course title (Intro to Electrical Engineering).
	 **/
	
	private String courseTitle;
	private String courseIdentifier;
	
	public Course() {	
	}
	
	public Course(String courseTitle, String courseIdentifier) {
		this.courseTitle = courseTitle;
		this.courseIdentifier = courseIdentifier;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getCourseIdentifier() {
		return courseIdentifier;
	}

	public void setCourseIdentifier(String courseIdentifier) {
		this.courseIdentifier = courseIdentifier;
	}
	
	public String toString() {
		return "\nCourse ID :- " + courseIdentifier + "\nCourse Title :- " + courseTitle;
	}
	
}