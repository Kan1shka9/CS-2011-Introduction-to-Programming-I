package Homework1.Lab10;

public class Cowboy extends Character {
	
	private static int numberOfCowboys = 1;
	
	public Cowboy(double accuracy) {
		this.name = "Cowboy # " + String.valueOf(numberOfCowboys);
		numberOfCowboys++;
		this.accuracy = accuracy;
	}

	@Override
	public void shoot(Character c) {
		System.out.println(this.getName() + " attempts to shoot the " + c.getName() + " in the back like a coward");
		double value = r.nextDouble();
		if(value < this.getAccuracy()) {
			c.receiveInjury(value);
		}
		else {
			System.out.println("The shot misses!");
		}
	}

}