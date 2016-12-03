/**
 * CS-2010 Lab 7 - Inheritance And Composition 
 * Write an application that models courses, students, and faculty members in a university.
 * General Directions
 * 1.) Use proper Java naming conventions.
 * 2.) All input and output in this lab must use JOptionPane (except where otherwise noted).
 * 3.) From now on it will be assumed that each class you create will have private instance variables and any necessary getters and setters. I will no longer explictly ask you to create these.
 * 4.) Be sure to implement toString() for each class.
 * 5.) Think carefully about how to organize the input/output for this lab *before* you begin coding.
 * 
 * The Address Class
 * An address has a street number, street name, city, state or province, and country.
 *
 * The Person Class
 * A Person has a name and an Address (represented by an object of class Address, not a String). Note that the subclasses of Person inherit the fields and methods of Person. You may need to override some of the methods in the subclasses.
 *
 * The Student Class
 * Student is a subclass of Person. In addition to the data inherited from Person, a student has CIN number and a course schedule represented by an ArrayList of Courses (objects of class Course). You must provide ways for a Student to add an existing Course.
 *
 * The FacultyMember Class
 * FacultyMember is also subclass of Person. A FacultyMember has an employee id number and a teaching schedule, which is an ArrayList of Courses. Provide a way to assign a FacultyMember to teach an existing Course.
 * 
 * The Course Class
 * A course has a course identifier (eg, EE-132) and a course title (Intro to Electrical Engineering).
 *
 * Driver Class
 * Write a Driver class that maintains lists of Students, Courses, and FacultyMembers and has a menu that provides ways to list them and to create them and add them to the list. Provide ways to delete Students and FacultyMembers and for Students and FacultyMembers to add and delete Courses from their course schedules. However, you do not need to provide a way to delete a Course from the list of Courses.
 * Include a method that can be called from main that will use your methods to add and delete some hard-coded test data (several students, several faculty members, and several courses.) This will let you code the lists and test the methods to add and delete items without using the user input functions.
 * Do not create a new Course when a Student adds or when a faculty member is assigned to teach; let the user choose a Course from the list.
 * 
 * Turn in your .java files and an executable .jar on CSNS. Make sure the executable .jar works correctly.
 * */
package Homework1.Lab7;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Driver {

	static List<Student> student = new ArrayList<Student>();
	static List<FacultyMember> facultymember = new ArrayList<FacultyMember>();
	static List<Course> course = new ArrayList<Course>();

	public static void main(String[] args) {

		Driver dry = new Driver();

		// Adding courses
		course.add(new Course("Physics", "1"));
		course.add(new Course("Chemistry", "2"));
		course.add(new Course("Maths", "3"));
		
		// Adding students
		student.add(new Student("James", 123, "Adams Boulevard", "LA", "CA", "USA", 1));
		student.add(new Student("John", 456, "Alameda Street", "LA", "CA", "USA", 2));
		student.add(new Student("Doe", 789, "Altadena Drive", "LA", "CA", "USA", 3));
		
		// Adding faculty
		facultymember.add(new FacultyMember("Noah", 753, "Firestone Boulevard", "LA", "CA", "USA", 1));
		facultymember.add(new FacultyMember("Liam", 159, "East Fork Road", "LA", "CA", "USA", 2));
		facultymember.add(new FacultyMember("Elijah", 852, "Crenshaw Boulevard", "LA", "CA", "USA", 3));		

		String[] choices = { "Quit", "List Students", "List Faculty Members", "List Courses", "Add Student",
				"Add Faculty Member", "Delete Student", "Delete Faculty Member", "Add Course for Student",
				"Delete Course for Student", "Add Course for Faculty Member", "Delete Course for Faculty Member" };

		int choice;
		do {
			choice = JOptionPane.showOptionDialog(null, "Main Menu", "Main Menu", 0, JOptionPane.QUESTION_MESSAGE, null, choices, "null");
			switch (choice) {
			case 0:
				break;
			case 1:
				if (!(student.isEmpty()))
					dry.listStudents();
				break;
			case 2:
				if (!(facultymember.isEmpty()))
					dry.listFacultyMembers();
				break;
			case 3:
				if (!(course.isEmpty()))
					dry.listCourses();
				break;
			case 4:
				dry.addStudent();
				break;
			case 5:
				dry.addFacultyMember();
				break;
			case 6:
				if (!(student.isEmpty()))
					dry.deleteStudent();
				break;
			case 7:
				if (!(facultymember.isEmpty()))
					dry.deleteFacultyMemeber();
				break;
			case 8:
				if (!(student.isEmpty()))
					dry.addCourse_Student();
				break;
			case 9:
				if (!(student.isEmpty()))
					dry.deleteCourse_Student();
				break;
			case 10:
				if (!(facultymember.isEmpty()))
					dry.addCourse_FacultyMember();
				break;
			case 11: 
				if (!(facultymember.isEmpty()))
					dry.deleteCourse_FacultyMember();
				break;
			} // end switch
		} while (choice != 0); // end do
	}

	public void listStudents() {
		StringBuilder sb = new StringBuilder();
		if (!(student.isEmpty())) {
			for (Student s : student)
				sb.append(s + "\n");
			JOptionPane.showMessageDialog(null, sb);
		} else {
			JOptionPane.showMessageDialog(null, "There are no students. Kindly go back and add students.");
		}
	}

	public void listFacultyMembers() {
		StringBuilder sb = new StringBuilder();
		if (!(facultymember.isEmpty())) {
			for (FacultyMember f : facultymember)
				sb.append(f + "\n");
			JOptionPane.showMessageDialog(null, sb);
		} else {
			JOptionPane.showMessageDialog(null, "There are no faculty members. Kindly go back and add faculty members.");
		}
	}

	public void listCourses() {
		StringBuilder sb = new StringBuilder();
		if (!(course.isEmpty())) {
			for (Course c : course)
				sb.append(c + "\n");
			JOptionPane.showMessageDialog(null, sb);
		} else {
			JOptionPane.showMessageDialog(null, "There are no courses. Kindly go back and add courses.");
		}
	}

	public void addStudent() {
		String personName = JOptionPane.showInputDialog("Please enter the student name ");
		int streetNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter street number"));
		String streetName = JOptionPane.showInputDialog("Please enter the street name ");
		String city = JOptionPane.showInputDialog("Please enter your city");
		String state = JOptionPane.showInputDialog("Please enter your state");
		String country = JOptionPane.showInputDialog("Please enter your country");
		int cin = Integer.parseInt(JOptionPane.showInputDialog("Please your CIN"));
		student.add(new Student(personName, streetNumber, streetName, city, state, country, cin));
		listStudents();
	}

	public void addFacultyMember() {
		String personName = JOptionPane.showInputDialog("Please enter the faculty name ");
		int streetNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter street number"));
		String streetName = JOptionPane.showInputDialog("Please enter the street name ");
		String city = JOptionPane.showInputDialog("Please enter your city");
		String state = JOptionPane.showInputDialog("Please enter your state");
		String country = JOptionPane.showInputDialog("Please enter your country");
		int employeeId = Integer.parseInt(JOptionPane.showInputDialog("Please your Employee Id"));
		facultymember.add(new FacultyMember(personName, streetNumber, streetName, city, state, country, employeeId));
		listFacultyMembers();
	}

	public void deleteStudent() {
		listStudents();
		int studentToDelete = Integer.parseInt(JOptionPane.showInputDialog("Please enter the row number of the student (1....n)"));
		for (int i = 0; i <= student.size() - 1; i++) {
			if (studentToDelete == student.get(i).getCin()) {
				student.remove(i);
				break;
			} if ( i == student.size() -1 && !(studentToDelete == student.get(i).getCin()) ) {
				JOptionPane.showMessageDialog(null, "Invalid row entered.");
			}
		}
		listStudents();
	}

	public void deleteFacultyMemeber() {
		listFacultyMembers();
		int facultyToDelete = Integer.parseInt(JOptionPane.showInputDialog("Please enter the row number of the faculty (1....n)"));
		for (int i = 0; i <= facultymember.size() - 1; i++) {
			if (facultyToDelete == facultymember.get(i).getEmployeeId()) {
				facultymember.remove(i);
				break;
			} if ( i == facultymember.size() -1 && !(facultyToDelete == facultymember.get(i).getEmployeeId()) ) {
				JOptionPane.showMessageDialog(null, "Invalid row entered.");
			}
		}
		listFacultyMembers();
	}

	public void addCourse_Student() {
		listStudents();
		int studentSelect = Integer.parseInt(JOptionPane.showInputDialog("Please enter the student index (0....n)"));
		listCourses();
		String courseToAdd = JOptionPane.showInputDialog("Please enter the course id of the course to be added (1....n)");		
		
		for (int c = 0; c < course.size(); c++) {
			if (courseToAdd.equals(course.get(c).getCourseIdentifier())) {
				student.get(studentSelect).addCourse(course.get(c).getCourseTitle(), courseToAdd);
				break;
			}
			if (  c == course.size() && !(courseToAdd.equals(course.get(c).getCourseIdentifier()) )) {
				JOptionPane.showMessageDialog(null, "Invalid course. Course does not exist.");
			}	
		}	
		
		listStudents();
	}

	public void deleteCourse_Student() {
		listStudents();
		int studentSelect = Integer.parseInt(JOptionPane.showInputDialog("Please enter the student index (0....n)"));
		listCourses();
		String courseToDelete = JOptionPane.showInputDialog("Please enter the course index (0....n) in the student object");
		
		for (int c = 0; c < course.size(); c++) {
			if (courseToDelete.equals(course.get(c).getCourseIdentifier())) {
				student.get(studentSelect).deleteCourse(c);
				break;
			}
			if (  c == course.size() && !(courseToDelete.equals(course.get(c).getCourseIdentifier()) )) {
				JOptionPane.showMessageDialog(null, "Invalid course. Course does not exist.");
			}	
		}
		
		listStudents();
	}

	public void addCourse_FacultyMember() {
		listFacultyMembers();
		int facultySelect = Integer.parseInt(JOptionPane.showInputDialog("Please enter the faculty index (0....n)"));
		listCourses();
		String courseToAdd = JOptionPane.showInputDialog("Please enter the course id of the course to be added (1....n)");		
		
		for (int c = 0; c < course.size(); c++) {
			if (courseToAdd.equals(course.get(c).getCourseIdentifier())) {
				facultymember.get(facultySelect).addCourse(course.get(c).getCourseTitle(), courseToAdd);
				break;
			}
			if (  c == course.size() && !(courseToAdd.equals(course.get(c).getCourseIdentifier()) )) {
				JOptionPane.showMessageDialog(null, "Invalid course. Course does not exist.");
			}	
		}	
		
		listFacultyMembers();
	}

	public void deleteCourse_FacultyMember() {
		listFacultyMembers();
		int facultySelect = Integer.parseInt(JOptionPane.showInputDialog("Please enter the faculty index (0....n)"));
		listCourses();
		String courseToDelete = JOptionPane.showInputDialog("Please enter the course index (0....n) in the faculty object");
		
		for (int c = 0; c < course.size(); c++) {
			if (courseToDelete.equals(course.get(c).getCourseIdentifier())) {
				facultymember.get(facultySelect).deleteCourse(c);
				break;
			}
			if (  c == course.size() && !(courseToDelete.equals(course.get(c).getCourseIdentifier()) )) {
				JOptionPane.showMessageDialog(null, "Invalid course. Course does not exist.");
			}	
		}
		
		listFacultyMembers();
	}

}