/**
 * CS-2010 Lab 5
 * Write an application that tracks information about monster attacks.
 * Important: use JOptionPane I/O, not Scanners and System.out, for this lab.
 * 
 * For this lab you will create a MonsterAttack class that represents one monster attack, an AttackMonitor class that aggregates data about attacks, and an MonsterAttackDriver class that instantiates an AttackMonitor. One of the key functions of AttackMonitor is to read and write data using a text file, but you will complete this part in a future lab. Note that nearly all the methods in AttackMonitor and MonsterAttack will be instance, not static, methods.
 * 
 * Part I - MonsterAttack class
 * Each object of this class represents information about a single attack. The data on each attack includes an integer id, three ints representing the day of the month, the month, and the year of the attack, the name of the monster involved (assume that each attack involves only one monster), the location of the attack (String), and the number of victims (int).
 * MonsterAttack needs a constructor that sets all the instance fields listed above using its parameters. It should take the three components of the date as a single String in the format MM/DD/YYYY (eg, 01/31/2010). Use String's split method to split this String on the slashes, parse the resulting Strings to ints, and use them to set the values of the month, day, and year.
 * Monster attack also needs getters and setters for all the data fields and a toString() that uses the instance data to create and return a String similar to this: "Attack # 125 occurred on 6/25/2009. Mothra attacked Tokyo, resulting in 301 tragic fatalities."
 * 
 * Part II - AttackMonitor
 * Create an AttackMonitor class that keeps track of the MonsterAttack objects. It should contain an array list (not an array) of MonsterAttacks and an instance method called monitor() with a menu that allows the user to choose to quit or to do any of the tasks listed below, which must all be implemented in separate methods. After doing any of these tasks, the program should return to the menu, so that the user can continue working on any series of tasks until he/she chooses to quit. Write methods to do each of the following:
 * Input information on a MonsterAttack. You will have to parse some of the input Strings to ints. When you have all the data, call the MonsterAttack constructor, using the input data, and add the new attack to the list of attacks.
 * Show the current list of attacks by iterating through the list, calling the toString() of each attack, and outputting the result to a dialog box. Write this method so that the program does not crash if the list is empty.
 * Choose an attack from the array list and delete it. The easiest way to do this is to call the method that shows the information, then ask the user for the id number of the attack to delete. Use linear search to find the attack with that id and delete it. The id number may not be the same as the index in the list. Make sure the application does not crash if the user enters an id that does not appear in the list.
 * 
 * Part III: MonsterAttackDriver
 * The driver class should instantiate an AttackMonitor and call its monitor() method.
 */

package Homework1.Lab5;

// Instantiates an AttackMonitor

public class MonsterAttackDriver {

	public static void main(String[] args) {
		
		AttackMonitor obj = new AttackMonitor();
		obj.monitor();
		
	}
	
}