package Homework1.Lab10;

import java.util.Random;

public abstract class Character {
	
	protected Random r = new Random();
	protected boolean alive = true;
	protected String name;
	protected double accuracy;
	protected double health = 1d;

	public boolean isAlive() {
		return alive;
	}

	public double getAccuracy() {
		return accuracy;
	}

	public String getName() {
		return name;
	}

	public void receiveInjury(double damageDone) {
		if (damageDone < health) {
			health -= damageDone;
			System.out.println(name + " is hit and receives " + damageDone + " damage; current health is " + health);
		} else {
			health = 0;
			alive = false;
			System.out.println(name + " is killed!");
		}
	}

	public abstract void shoot(Character c);

}