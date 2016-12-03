package Homework1.Lab11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Person[] ps = new Person[5];
		
		ps[0] = new Faculty("Andy", new Date("11/12/1980"), 4000.0, "full-time");
		ps[1] = new Faculty("Barry", new Date("1/2/1973"), 6000.0, "part-time");
		ps[2] = new Staff("Cathy", new Date("8/19/1968"), 2000.0, (int) 3.0);
        ps[3] = new Staff("Don", new Date("4/17/1969"), 4000.0, (int) 2.0);
        ps[4] = new Staff("Edith", new Date("10/28/1979"), 5000.0, (int) 1.0);

        // output the data
     	System.out.println("Unsorted:");
     	
     	for (int i = 0; i < ps.length; i++) {
			System.out.println(ps[i]);
		}
     	
     	/*
     	 * Ascending order sort
     	 * Arrays.sort(ps);
     	 */

     	// Descending order sort
		Arrays.sort(ps, Collections.reverseOrder());
     	
		System.out.println("\nSorted:");
		
		for (int i = 0; i < ps.length; i++) {
			System.out.println(ps[i]);
		}
		
		System.out.println("\nPrinting the objects of Staff using instanceOf:");
		
		for (int i = 0; i < ps.length; i++) {
			if (ps[i] instanceof Staff) {
				System.out.println(ps[i].getName() + " : " + ps[i].getSalary());
			}
		}
		
		System.out.println("\nPrinting the objects of Faculty using instanceOf:");
		
		for (int i = 0; i < ps.length; i++) {
			if (ps[i] instanceof Faculty) {
				System.out.println(ps[i].getName() + " : " + ps[i].getSalary());
			}
		}
		
	}

}