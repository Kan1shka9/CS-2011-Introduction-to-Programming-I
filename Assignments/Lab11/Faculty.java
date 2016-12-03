package Homework1.Lab11;

import java.util.Date;

public class Faculty extends Person {
	
	private double monthlySalary;
	private String status;

	public Faculty(String firstName, Date birthdate, double monthlySalary, String status) {
		super(firstName, birthdate);
		this.monthlySalary = monthlySalary;
		this.status = status;
	}
	
	@Override
	public Double getSalary() {
		return monthlySalary * 9.0;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public String getStatus() {
		return status;
	}
	
	public String toString() {
		return getName() + " was born on " + getBirthdate() + ": " +  getStatus() + " Salary: " + getSalary();
	}
	
}