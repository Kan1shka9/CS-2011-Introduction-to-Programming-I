package CS2011.Lecture15.Interface;

import java.util.ArrayList;
import java.util.List;

public class MonsterAttackDriver2 {

	public static void main(String[] args) {
		
		List<Monster> monsters = new ArrayList<Monster>();
		Monster m1 = new UniqueMonster("Godzilla", "radioactive breath of fire", "Tokyo", "ancient sea monster awakened from millennia of sleep by radioactive fallout after World War II");
		monsters.add(m1);
		
		// here is a more concise way to create and object and add it to the list
		monsters.add(new UniqueMonster("Jersey Devil", "claws", "Princeton", "giant " + "batlike creature born to a cursed farmer in the 1700s"));

		Monster m = new Zombie("New Orleans");
		monsters.add(m);

		for (int counter = 0; counter < 3; counter++) {
			m = new Zombie("London"); // reuse the Monster variable from a few lines back
			monsters.add(m);
		}

		for (Monster z : monsters) {
			System.out.println(z.getName() + " is a(n) " + z.getOriginStory());
			z.rampage();
			System.out.println();
		}

	}

}