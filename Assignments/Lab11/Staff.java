package Homework1.Lab11;

import java.util.Date;

public class Staff extends Person {
	
	private double annualSalary;
	private int experience;

	public Staff(String firstName, Date birthdate, double annualSalary, int experience) {
		super(firstName, birthdate);
		this.annualSalary = annualSalary;
		this.experience = experience;
	}

	@Override
	public Double getSalary() {
		return annualSalary + (annualSalary * (30.0 - experience) / 60.0);
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public int getExperience() {
		return experience;
	}
	
	public String toString() {
		return getName() + " was born on " + getBirthdate() + ": " +  getExperience() + " Salary: " + getSalary();
	}

}