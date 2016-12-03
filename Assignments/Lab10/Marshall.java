package Homework1.Lab10;

public class Marshall extends Character {
	
	public Marshall() {
	}

	public Marshall(String name, double accuracy) {
		super();
		this.name = name;
		this.accuracy = accuracy;
	}

	@Override
	public void shoot(Character c) {
		System.out.println(this.getName() + " steadfastly stands up to " + c.getName() + " and draws!");
		double value = r.nextDouble();
		if(value < this.getAccuracy()) {
			c.receiveInjury(value);
		}
		else {
			System.out.println("The shot misses!");
		}
	}
	
}