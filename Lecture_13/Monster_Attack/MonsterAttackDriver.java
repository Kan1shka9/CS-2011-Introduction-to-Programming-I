/**
 * CS-2010 Lab 6
 * Start with your code from Lab 5.
 * Important notes:
 * Use JOptionPane I/O, not Scanners and System.out, for this lab.
 * Do not hard code data file paths or filenames; ask the user for them.
 * Complete the Monster Attack project by doing the following:
 * Add a method to AttackMonitor that saves the list of attacks to a comma separated values file. Iterate through the list, and for each attack, get each field using the getters from MonsterAttack. Write each value to the file, following each one except the last with a comma. Save the date as a single String in the format MM/DD/YYYY. After you have written out all the data for one attack, write out a newline. Add an item to the main menu that calls this method.
 * Add a method that clears the list of monster attacks, then reads data from a .csv file, uses it to instantiate MonsterAttack objects, and adds the attacks to the list. This method must be able to read the files you write out in the method described above. You will need to use String's split() method here. Add an item to the main menu that calls this method. Make sure you can input attack data, save to a file, quit the program, start the program again, read your output file, and show the data from the file.
 * Create an executable .jar file of your application. Test it by taking it to a different computer (one that has a JVM) on a usb drive and seeing if it works there. I will not grade this assignment unless the .jar works.
 */

package Homework1.Lab6;

// Instantiates an AttackMonitor

public class MonsterAttackDriver {

	public static void main(String[] args) {
		AttackMonitor obj = new AttackMonitor();
		obj.monitor();
	}
}