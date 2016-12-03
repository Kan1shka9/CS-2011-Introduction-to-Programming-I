package CS2011.Lecture15.compareObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeBook {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();

		String[] names = {"Skipper", "Gilligan", "Mary Anne", "Ginger", "Mr. Howell", "Mrs. Howell", "The Professor"};
		double[] gpas = {2.7, 2.1, 3.9, 3.5, 3.4, 3.2, 4.0};
		
		for(int counter = 0; counter < names.length; counter++){
			students.add(new Student(names[counter], gpas[counter]));
		}

		// output the data
		System.out.println("Unsorted:");
		
		/*for(Student s: students)
			System.out.println(s);*/
		
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}

		Collections.sort(students);

		System.out.println("\nSorted:");
		
		/*for(Student s: students)
			System.out.println(s);*/
		
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
	}

}