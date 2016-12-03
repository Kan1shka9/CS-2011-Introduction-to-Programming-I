package CS2011.Lecture15.equals;

import java.util.ArrayList;
import java.util.List;

public class GradeBook {
	
	public static void testStudentsForEquality(Student s1, Student s2){
		if(s1.equals(s2)) 
			System.out.println(s1 + " = " + s2);
		else 
			System.out.println(s1 + " != " + s2);
	}
	
	public static void main(String[] args) {
		// create an array list of Students
		List<Student> students = new ArrayList<Student>();

		String[] names = {"Skipper", "Gilligan", "Mary Anne", "Ginger", "Mr. Howell", "Mrs. Howell", "The Professor", "Mary Anne"};
		double[] gpas = {2.7, 2.1, 3.9, 3.5, 3.4, 3.2, 4.0, 3.9};

		Student currStudent;
		for(int counter = 0; counter < names.length; counter++){
			currStudent = new Student(names[counter], gpas[counter]);
			students.add(currStudent);
		}

		testStudentsForEquality(students.get(0), students.get(4));
		testStudentsForEquality(students.get(2), students.get(7));
		testStudentsForEquality(students.get(3), students.get(3));
	}

}