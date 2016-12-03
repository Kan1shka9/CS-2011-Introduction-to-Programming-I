package CS2011.Lecture22.Recursion.StudyThis;

import java.util.Scanner;

public class TowersOfHanoi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of disks :- ");
		int numOfDisks = sc.nextInt();
		
		System.out.println("The moves are :- ");
		moveDisks(numOfDisks, 'A', 'B', 'C');

	}
	
	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
		
		if (n == 1) {
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
		}
		else {
			moveDisks(n-1, fromTower, auxTower, toTower);
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
			moveDisks(n-1, auxTower, toTower, fromTower);
		}
	}

}

/*
F T A
F A T
A T F
*/