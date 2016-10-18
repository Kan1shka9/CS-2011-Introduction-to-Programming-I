package CS2011.Lecture13.CSVFileParse;

import java.io.*;
import java.util.*;

public class StudentParser {
	private List<Lect4Student> students;

	public StudentParser() {
		students = new ArrayList<Lect4Student>();
	}

	public void showGrades() {
		for (Lect4Student s : students) {
			System.out.println(s.toString());
		}
		showAverage();
	}

	public void showAverage() {
		double total = 0;
		for (Lect4Student stu : students)
			total += stu.getGrade();
		System.out.println("Class Average: " + total / students.size());
	}

	public void readFile() throws IOException {
		try {
			// Take the file from the user
			System.out.println("Enter a filepath to read from ");
			Scanner in = new Scanner(System.in);
			String file_name = in.next();
			
			// Pass the file name to the file object
			File inFile = new File(file_name);
			
			// File object is passed to scanner for reading
			Scanner freader = new Scanner(inFile);
			
			// skip the header
			freader.nextLine(); 

			String line;
			String[] fields;
			String name;
			double grade;
			
			// Read data from file
			while (freader.hasNextLine()) {
				line = freader.nextLine();
				fields = line.split(",");
				name = fields[0];
				grade = Double.parseDouble(fields[1]);
				students.add(new Lect4Student(name, grade));
			}
			
			// Close the scanners
			freader.close(); 
			in.close();
		} 
		catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
	}
}
