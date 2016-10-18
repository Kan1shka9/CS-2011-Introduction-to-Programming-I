package CS2011.Lecture13.CSVFileParse;

public class Lect4Student {
	private String name;
	private double grade;

	public Lect4Student(String nameIn, double gradeIn){
		name = nameIn;
		grade = gradeIn;
	}

	public String getName(){
		return name;
	}

	public double getGrade(){
		return grade;
	}

	public String toString(){
		return(name + " received grade: " + grade);
	}
}
