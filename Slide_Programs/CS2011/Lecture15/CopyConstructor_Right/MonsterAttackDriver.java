package CS2011.Lecture15.CopyConstructor_Right;

public class MonsterAttackDriver {
	
	public static void main(String[] args) {

		RobotSoldier r = new RobotSoldier("Chicago", new SerialNumber("CHI", 1));
		MadScientist m = new MadScientist("Dr. Evil");
		m.createArmy(r, 5);
		m.mountPutsch();
		
		r.changeSerialNumber("CHI", 2);
		System.out.println(r.getSerialNumber());
		m.mountPutsch();		
	}
	
}