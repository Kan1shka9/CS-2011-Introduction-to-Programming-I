package CS2011.Lecture15.Interface;

import java.util.ArrayList;
import java.util.List;

public class MonsterAttackDriver {

	public static void main(String[] args) {
		
		List<Monster> monsters = new ArrayList<Monster>();
		
		monsters.add(new UniqueMonster("Godzilla", "radioactive breath of fire", "Tokyo", "ancient sea monster awakened from millennia of sleep by radioactive fallout after World War II"));		
		monsters.add(new UniqueMonster("Jersey Devil", "claws", "Princeton", "giant " + "batlike creature born to a cursed farmer in the 1700s"));

		monsters.add(new Zombie("New Orleans"));

		for (int counter = 0; counter < 3; counter++) {
			monsters.add(new Zombie("London"));
		}

		for (Monster z : monsters) {
			System.out.println(z.getName() + " is a(n) " + z.getOriginStory());
			z.rampage();
			System.out.println();
		}

	}

}