package CS2011.Lecture15.CopyConstructor_Wrong;

import java.util.ArrayList;
import java.util.List;

public class MadScientist {
	
	private String name;
	List<RobotSoldier> army = new ArrayList<RobotSoldier>();

	public MadScientist(String name) {
		this.name = name;
	}

	public void createArmy(RobotSoldier r, int armySize) {
		for (int counter = 0; counter < armySize; counter++) {
			RobotSoldier n = new RobotSoldier(r);
			n.changeSerialNumber("Chi", counter);
			army.add(n);
		}
	}

	public void addSoldier(RobotSoldier r) {
		army.add(r);
	}

	public void mountPutsch() {
		for (RobotSoldier r : army)
			r.rampage();
	}
	
}