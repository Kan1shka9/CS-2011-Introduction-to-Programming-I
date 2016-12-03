package CS2011.SampleMidTerm1;

import java.util.ArrayList;

public class Driver {
	
	public static void main(String args[]) {
		
		ArrayList<Building> buildings = new ArrayList<Building>();
		// public House(double size, boolean isHaunted, String description)
		Building H1 = new House(165.4, true, "updated kitchen");
		Building H2 = new House(171.5, false, "charming fireplace");
		Building H3 = new House(187.2, true, "capacious septic tank");
		Building H4 = new House(256.3, false, "charming fireplace");
		// public Asylum(double size, boolean isHaunted, String name)
		Building A1 = new Asylum(35000.25 , true, "The California Home For Clowns");
		Building A2 = new Asylum(56000.78 , false, "The Everything For Nothing");
		
		System.out.println("Let's go for a stroll on  Maple Street!");
		H1.explore();
		H2.explore();
		H3.explore();
		H4.explore();
		A1.explore();
		A2.explore();
		
		int totalCount = H1.getCount() + H2.getCount() + H3.getCount() + H4.getCount() + A1.getCount() + A2.getCount();
		System.out.println("\n" + totalCount + " of the buildings on Maple Street are haunted.");
	
	}

}