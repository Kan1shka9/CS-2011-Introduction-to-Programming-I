package CS2011.Lecture14.Abstract;

public class Motorcycle extends MotorVehicle {
	
	private double volumeInDecibels;

	public Motorcycle(double weightInKgIn, String manufacturerIn, double displacementIn, double volumeInDecibelsIn) {
		super();
		// note the difference between these assignments and the way the same task is done in the Car constructor.
		// This way is simpler, but might miss or require duplication of initialization logic in the superclass constructors.
		manufacturer = manufacturerIn;
		weightInKg = weightInKgIn;
		engineDisplacementInCc = displacementIn;
		fuelType = "gasoline";
		speedInKmPerHr = 0;
		volumeInDecibels = volumeInDecibelsIn;
	}

	public double getVolumeInDecibels() {
		return volumeInDecibels;
	}

	public void setVolumeInDecibels(double volumeInDecibels) {
		this.volumeInDecibels = volumeInDecibels;
	}

	public String toString() {
		return manufacturer + " motorcycle with a " + engineDisplacementInCc + " cc " + fuelType + " engine weighs " + weightInKg + " kg and is going " + speedInKmPerHr + " KPH " + direction.toString() + " making noise at " + volumeInDecibels + " db";
	}
	
	/**
	 * Abstract Methods
	 * public abstract void steer(double bearing, double z);
	 * public abstract void accelerate(double speedIncrement);
	 */

	@Override
	public void steer(double bearing, double z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accelerate(double speedIncrement) {
		// TODO Auto-generated method stub
		
	}

}