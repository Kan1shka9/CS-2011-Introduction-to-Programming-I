package CS2011.SampleMidTerm_revised;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		
		List<Building> buildings = new ArrayList<Building>();
		Building B1 = new House(1d, false, "AAA");
		Building B2 = new House(2d, true, "BBB");
		Building B3 = new House(3d, false, "CCC");
		Building B4 = new House(4d, true, "DDD");
		Building A1 = new Asylum(5d, true, "FGH");
		Building A2 = new Asylum(6d, true, "DGK");
		
		buildings.add(B1);
		buildings.add(B2);
		buildings.add(B3);
		buildings.add(B4);
		buildings.add(A1);
		buildings.add(A2);
		
		System.out.println("Let's go for a stroll on  Maple Street!");
		for (int i = 0; i < buildings.size(); i++) {
			buildings.get(i).explore();
		}
		
		int sum = 0;
		
		for (int i = 0; i < buildings.size(); i++ ) {
			if (buildings.get(i).getisHaunted() == true){
				sum++;
			}
		}
		
		System.out.println(sum + " of the buildings on Maple Street are haunted.");
		
	}

}