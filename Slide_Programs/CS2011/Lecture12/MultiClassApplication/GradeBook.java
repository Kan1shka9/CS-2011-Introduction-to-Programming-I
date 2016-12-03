package CS2011.Lecture12.MultiClassApplication;

public class GradeBook {

	public static void main(String[] args) {
		
		// create an array of Students
		Student[] students = new Student[4];

		// create Students
		for(int counter = 0; counter < students.length; counter++)
			students[counter] = new Student();
				
		// supply data for the Students
		students[0].setName("Fred");
		students[0].setGrade(82.0);
				
		students[1].setName("Wilma");
		students[1].setGrade(86.5);
				
		students[2].setName("Barney");
		students[2].setGrade(63.0);
				
		students[3].setName("Betty");
		students[3].setGrade(96.5);
				
		// output the data
		// for (classname i: object)
		System.out.println("Using enhanced for loop");
		for(Student s: students)
			System.out.println(s.getName() + ": " + s.getGrade());
		
		// Access array elements as arrvar[i].methodname() and arraylist elements as arrayobj.get(i).methodname()
		System.out.println("\nUsing normal for loop");		
		for (int i = 0 ; i < students.length; i++) {
			System.out.println(students[i].getName() + ": " + students[i].getGrade());
		}

	}

}