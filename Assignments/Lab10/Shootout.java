package Homework1.Lab10;

import java.util.Random;

public class Shootout {
	
	Random r = new Random();
	Marshall marshall = new Marshall();
	Cowboy[] cowboy = new Cowboy[5];

	public static void main(String[] args) {

		Shootout so = new Shootout();
		so.battle();

	}
	
	public void battle() {
		
		Marshall marshall = new Marshall("Wyatt Earp", 0.9);
		
		cowboy[0] = new Cowboy(r.nextDouble());
		cowboy[1] = new Cowboy(r.nextDouble());
		cowboy[2] = new Cowboy(r.nextDouble());
		cowboy[3] = new Cowboy(r.nextDouble());
		cowboy[4] = new Cowboy(r.nextDouble());
		
		int cowboyNum = 0;
		int cowboysKilled = 0;
		boolean allCowboysKilled = false;
		
		do {
			if ( cowboy[cowboyNum].health != 0 ) {
				cowboy[cowboyNum].shoot(marshall);
				if (marshall.health != 0) {
					marshall.shoot(cowboy[cowboyNum]);
					if (cowboyNum <= 3) {
						cowboyNum += 1;
					}
				}
				else {
					break;
				}
			}
			
			else {
				cowboysKilled += 1;
				if (cowboyNum <= 3) {
					cowboyNum += 1;
				}
			}
			
			if (cowboysKilled == 5) {
				allCowboysKilled = true;
			}	
			
		} while(marshall.health != 0 || !allCowboysKilled);
		
		
		if (marshall.health == 0) {
			System.out.println("Cowboy won!");
		}
		else if (allCowboysKilled) {
			System.out.println("Earp won!");
		}	
		
	}

}