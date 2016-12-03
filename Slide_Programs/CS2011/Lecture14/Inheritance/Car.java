package CS2011.Lecture14.Inheritance;

public class Car extends MotorVehicle {

	private String licensePlateNumber;
	
	public Car(double weightInKgIn, String manufacturerIn, double displacementIn, String fuelTypeIn, String licensePlateNumberIn) {
		super(weightInKgIn, manufacturerIn, displacementIn, fuelTypeIn);
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
	
	@Override
	public void accelerate(double speedIncrement) {
		// supply code to accelerate like a car
		
	}

}