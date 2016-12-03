package CS2011.Lecture14.ReferenceVariableTrivia;

public class MotorVehicle extends Vehicle {
	
	protected double engineDisplacementInCc;
	protected String fuelType;
	protected String manufacturer;
	
	public MotorVehicle(){}

	public MotorVehicle(double weightInKgIn, String manufacturerIn, double displacementIn, String fuelTypeIn) {
		super(weightInKgIn);
		manufacturer = manufacturerIn;
		engineDisplacementInCc = displacementIn;
		fuelType = fuelTypeIn;		
	}

	public double getEngineDisplacementInCc() {
		return engineDisplacementInCc;
	}

	public String getFuelType() {
		return fuelType;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	// this method is unique to MotorVehicles, not common to all vehicles
	public void register() {
		System.out.println("Registered " + manufacturer + " vehicle with DMV");
	}

	public String toString() {
		return "manufacturer: " + manufacturer + "engine displacement: " + engineDisplacementInCc + ": fuelType: " + fuelType  + ": " + super.toString();
	}
	
	@Override
	public void steer(double bearing, double z) {
		// supply code to steer like a motor vehicle		
	}
	// accelerate() is still abstract here

}