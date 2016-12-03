package Quiz5;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		List<Vessel> vessel = new ArrayList<Vessel>();
		
		Vessel cup1 = new Cup(5);
		Vessel cup2 = new Cup(7);
		
		Vessel glass1 = new Glass(2, 5);
		Vessel glass2 = new Glass(3, 5);
		
		vessel.add(cup1);
		vessel.add(cup2);
		vessel.add(glass1);
		vessel.add(glass2);
		
		for (int i = 0; i < vessel.size(); i++) {
			System.out.println(vessel.get(i).getVolumeInML() + " is the volume of the vessel");
			vessel.get(i).pourIn(200);
			System.out.println("The amount in the vessel is " + vessel.get(i).getAmountPouredIn());
			vessel.get(i).consume(300);
			System.out.println("The amount in the vessel is " + vessel.get(i).getAmountPouredIn());
			
			System.out.println();
			
			System.out.println(vessel.get(i).getVolumeInML() + " is the volume of the vessel");
			vessel.get(i).pourIn(300);
			System.out.println("The amount in the vessel is " + vessel.get(i).getAmountPouredIn());
			vessel.get(i).consume(200);
			System.out.println("The amount in the vessel is " + vessel.get(i).getAmountPouredIn());
			
			System.out.println();
		}
		
		Vessel cup3 = new Cup(-4);
		System.out.println(cup3.getVolumeInML() + " is the volume of the vessel");

	}

}