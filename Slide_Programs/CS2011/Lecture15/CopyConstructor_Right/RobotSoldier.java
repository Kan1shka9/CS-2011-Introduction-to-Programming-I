package CS2011.Lecture15.CopyConstructor_Right;

public class RobotSoldier implements Monster{
	
	private String location;
	private SerialNumber serialNumber;
	private String name;
	
	public RobotSoldier(String location, SerialNumber serialNumber){
		this.name = "RobotSoldier " + serialNumber;
		this.location = location;		
		this.serialNumber = serialNumber;
	}
	
	public RobotSoldier(RobotSoldier r){
		this.location = r.location;		
		// make a deep copy of serialNumber using its copy constructor!
		this.serialNumber = new SerialNumber(r.serialNumber);
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getName(){
		return name;
	}
	
	@Override
	public void setLocation(String location) {
		this.location = location;	
	}
	
	public SerialNumber getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(SerialNumber serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public void changeSerialNumber(String prefix, int number){
		serialNumber.setPrefix(prefix);
		serialNumber.setNumber(number);
	}
	
	@Override
	public void rampage() {
		System.out.println("Robot Soldier " + serialNumber + " joins an army of robot soldiers to seize power in " + location+ " as part of a plot to take over the world");
	}

	@Override
	public String getOriginStory() {
		return "evil robot soldier created by a mad scientist";
	}

}