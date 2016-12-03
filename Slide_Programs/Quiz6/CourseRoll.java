package Quiz6;

import java.util.ArrayList;

public class CourseRoll {
	
	private int nextCin = 0;
	private double[] gpa;
	
	ArrayList<Student> student = new ArrayList<Student>();

	Simulator sim = new Simulator();
	
	public void OfferClass() {
		gpa = sim.getGaussianData(3.5, 0.5, 30, 2, 4);
		for (int i = 0; i < gpa.length; i++) {
			Student student1 = (new Student(++nextCin, gpa[i]));
			System.out.println(student1.toString());
		}	

	}
	
}