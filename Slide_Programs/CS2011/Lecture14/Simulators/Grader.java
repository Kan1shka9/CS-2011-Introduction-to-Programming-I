package CS2011.Lecture14.Simulators;

import java.util.Arrays;

public class Grader {

	private double average;
	private double std;
	private int count;
	private double[] grades;
	private final double MINGRADE = 0;
	private final double MAXGRADE = 100;

	public enum GradingType {
		LINEAR, GAUSSIAN
	};

	public Grader(double avgIn, double stdIn, int countIn) {
		average = avgIn;
		std = stdIn;
		count = countIn;
	}
	
	private void grade(GradingType type) {
		
		Simulator sim = new Simulator();
		
		if (type == GradingType.LINEAR)
			grades = sim.getLinearData(count, MINGRADE, MAXGRADE);
		if (type == GradingType.GAUSSIAN)
			grades = sim.getGaussianData(average, std, count, MINGRADE, MAXGRADE);
		
		System.out.println("\nData using distribution type: " + type + "\n");
		
		for (int i = 0; i < grades.length; i++) {
			System.out.print("Student #" + i + " received a grade of ");
			System.out.printf("%3.1f\n", grades[i]);
		}
		
		Arrays.sort(grades);
		
		System.out.println("Here are the sorted values from the simulator:");
		for (double d : grades)
			System.out.printf("%3.1f\n",d);
		
	}

	public static void main(String[] args) {
		Grader grd = new Grader(80d, 10d, 20);
		grd.grade(GradingType.LINEAR);
		grd.grade(GradingType.GAUSSIAN);
	}
	
}