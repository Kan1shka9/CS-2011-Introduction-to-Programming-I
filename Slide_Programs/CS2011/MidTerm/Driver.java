package CS2011.MidTerm;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<Animal>();
		
		Animal cat1 = new Cats("Lucy", 50d);
		Animal cat2 = new Cats("Timmy", 30d);
		Animal mice1 = new Mice("Jerry", 20d);
		Animal mice2 = new Mice("Jacky", 15d);
		
		animals.add(cat1);
		animals.add(cat2);
		animals.add(mice1);
		animals.add(mice2);
		
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
	}

}