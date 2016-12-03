package CS2011.Lecture14.Abstract;

public abstract class MotorVehicle extends Vehicle {

	protected String manufacturer;
	protected double engineDisplacementInCc;
	protected String fuelType;
	
	public MotorVehicle() {
	}

	// weightInKg from the Vehicle class is passed to the constructor MotorVehicle
	public MotorVehicle(double weightInKgIn, String manufacturerIn, double displacementIn, String fuelTypeIn) {
		super(weightInKgIn); // Value assigned from super class
		manufacturer = manufacturerIn;
		engineDisplacementInCc = displacementIn;
		fuelType = fuelTypeIn;		
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public double getEngineDisplacementInCc() {
		return engineDisplacementInCc;
	}

	public String getFuelType() {
		return fuelType;
	}	

	// this method is unique to MotorVehicles, not common to all vehicles
	public void register() {
		System.out.println("Registered " + manufacturer + " vehicle with DMV");
	}

	public String toString() {
		return "manufacturer: " + manufacturer + "engine displacement: " + engineDisplacementInCc + ": fuelType: " + fuelType  + ": " + super.toString();
	}

}