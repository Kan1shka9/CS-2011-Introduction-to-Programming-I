package CS2011.Lecture14.Abstract;

public class Car extends MotorVehicle {

	private String licensePlateNumber;
	
	// weightInKg from Vehicle; manufacturerIn, displacementIn, fuelTypeIn from MotorVehicle
	public Car(double weightInKgIn, String manufacturerIn, double displacementIn, String fuelTypeIn, String licensePlateNumberIn) {
		super(weightInKgIn, manufacturerIn, displacementIn, fuelTypeIn); // Value assigned form super class
		licensePlateNumber = licensePlateNumberIn;			
	}
	
	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}

	public String toString() {
		return  manufacturer + " car with plate " + licensePlateNumber + " and engine displacement " + engineDisplacementInCc + " cc " + fuelType + " engine weighs " + weightInKg + " kg and is going " + speedInKmPerHr +" KPH "  + direction.toString();
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