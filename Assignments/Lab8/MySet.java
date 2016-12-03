/**
 * The MySet Class
 * NOTE: Java has a built in Set class. You may NOT use this class or any of its methods. Also, you may not use any of the built in Java Collection classes inside of your MySet class. This means no ArrayLists, Lists, Maps, etc.
 * A set is a collection of items in which each item is unique. You will implement a simplified version of the Java Set class. Your MySet class should have a private instance variable which is a reference to an array of ints. A MySet object can be constructed by passing a Java array to its constructor. The constructor of the MySet class should take the given array and create an array of integers in which each value is unique. In other words, if the user creates a MySet object from an array with duplicate values, then your constructor must strip out any duplicates and only keep unique values in the set. This array will be the one which is stored in the instance variable of your MySet class. NOTE: Remember that arrays are fixed in size, so you will have to account for the fact that new sets may have more or less values than an array has space for. You should create new arrays and copy values to them when necessary.
 * MySet should also implement the methods found in the MyMath interface. Don't get hung up on the name of the methods even if they do not seem to intuitively relate to what the method actually does. Just follow the directions carefully.
 * add(MySet o) This should return a new MySet object which is the union of two MySet objects. The Union of a Set can be reviewed here. Remember that a set may not contain any duplicate elements, so you must discard duplicates.
 * subtract(MySet o) This should return a new MySet object which is the relative complement of o in the current MySet. In other words, it should contain only those elements of the current MySet which are not contained in o. Relative Complement can be reviewed here
 * multiply(MySet o) This should return a new MySet object which is the Symmetric Difference of two MySet objects. The Symmetric Difference can be reviewed here
 * divide(MySet o) This should return a new MySet object which is the intersection of two MySet objects. The Intersection can be reviewed here
 * You should also implement toString() to print your MySet objects.
 */

package Homework1.Lab8;

import java.util.Arrays;

public class MySet implements MyMath<MySet> {
	
	// Private variables
	private int[] inArray;
			
	// Default constructor
	public MySet() {
	}
			
	// Parameterized constructor
	public MySet(int[] input) {
		inArray = removeDuplicatesFromArray(input);
	}

	// Method to remove duplicates from array
	public int[] removeDuplicatesFromArray(int[] input) {
		int size = input.length;
		
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (input[i] == input[j]) {
					input[j] = input[size-1];
					size--;
					j--;
				}
			}
		}
		
		inArray = new int[size];
		
		for (int i = 0; i < size; i++) {
			inArray[i] = input[i];
		}
		
		return inArray;
		
	}
	
	// Method to check if a particular element exists in the array
	public boolean checkExistence(int a, int[] b) {
		int size = b.length;
		boolean exists = false;
		
		for (int i = 0; i < size; i++) {
			if (a == b[i]) {
				exists = true;
			}
		}
		
		return exists;		
	}

	/**
	 * A = {1, 3, 5, 7} and B = {1, 2, 4, 6} then A Union B = {1, 2, 3, 4, 5, 6, 7}
	 */
	@Override
	public MySet add(MySet o) {
		int counter = 0;
		int size1 = inArray.length;
		int size2 = o.inArray.length;
		int totalSize = size1 +  size2;
		int[] outArray = new int[totalSize];
		
		for (int i = 0; i < size1; i++) {
			outArray[i] = inArray[i];
		}
		for (int j = size1; j < totalSize; j++) {
			outArray[j] = o.inArray[counter];
			counter++;
		}
		
		MySet output = new MySet(outArray);
		return output;	
		
	}

	/**
	 * A = {1, 2, 3} and B = {2, 3, 4} then A Complement B = {1}
	 */
	@Override
	public MySet subtract(MySet o) {
		int counter = 0;
		int size = inArray.length;
		int[] midArray = new int[size];
		
		for (int i = 0; i < size; i++) {
			if (!checkExistence(inArray[i], o.inArray)) {
				midArray[counter] = inArray[i];
				counter++;
			}
		}
		
		int[] outArray = new int[counter];
		
		if (counter == 0) {
			return null;
		}
		else {
			for (int j = 0; j < counter; j++) {
				outArray[j] = midArray[j];
			}
		}
		
		MySet output = new MySet(outArray);
		return output;
		
	}

	/**
	 * A = {1, 2, 3} and B = {2, 3, 4} then A Intersection B = {2, 3}
	 */
	@Override
	public MySet divide(MySet o) {
		int counter = 0;
		int size = inArray.length;
		int[] midArray = new int[size];
		
		for (int i = 0; i < size; i++) {
			if (checkExistence(inArray[i], o.inArray)) {
				midArray[counter] = inArray[i];
				counter++;
			}
		}
		
		int[] outArray = new int[counter];
		
		if (counter == 0) {
			return null;
		}
		else {
			for (int j = 0; j < counter; j++) {
				outArray[j] = midArray[j];
			}
		}
		
		MySet output = new MySet(outArray);
		return output;
		
	}

	/**
	 * A = {1, 2, 3} and B = {3, 4} then A Symmetric Difference B = {1, 2, 4}
	 */
	@Override
	public MySet multiply(MySet o) {
		int counter = 0;
		int size1 = inArray.length;
		int size2 = o.inArray.length;
		int totalSize = size1 +  size2;
		int[] midArray = new int[totalSize];
		
		for (int i = 0; i < size1; i++) {
			if (!checkExistence(inArray[i], o.inArray)) {
				midArray[counter] = inArray[i];
				counter++;
			}
		}
		
		for (int i = 0; i < size2; i++) {
			if (!checkExistence(o.inArray[i], inArray)) {
				midArray[counter] = o.inArray[i];
				counter++;
			}
		}
		
		int[] outArray = new int[counter];
		
		if (counter == 0){
			return null;
		}
		else {
			for (int j = 0; j < counter; j++) {
				outArray[j] = midArray[j];
			}
		}

		MySet output = new MySet(outArray);
		return output;
		
	}
	
	@Override
	public String toString() {
		Arrays.sort(inArray);
		return Arrays.toString(inArray);
	}
	
}