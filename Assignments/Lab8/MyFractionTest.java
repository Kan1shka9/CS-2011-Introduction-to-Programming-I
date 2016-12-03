/**
 * The JUnit Test Cases
 * Each class should have an associated JUnit Test case which exhaustively tests every aspect of the classes.
 * All instance variables should be tested. All constructors should be tested, and all methods should be tested. 
 * Any aspect of a class which is not tested will result in a deduction in points. 
 * Refer to the lecture slides and examples on how to do this. 
 */

package Homework1.Lab8;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyFractionTest {
	
	MyFraction myFrac1, myFrac2;

	@Test
	public void testMyFraction() {
		myFrac1 = new MyFraction(2, 3, '+');
		assertNotNull(myFrac1);
		myFrac2 = new MyFraction(4, 5, '+');
		assertNotNull(myFrac2);
	}
	
	@Test
	public void testAddFraction() {
		myFrac1 = new MyFraction(2, 3, '+');
		myFrac2 = new MyFraction(4, 5, '+');
		
		MyFraction myFracOut = new MyFraction();
		
		myFracOut = myFrac1.add(myFrac2);
		
		assertEquals(22, myFracOut.getNumerator());
		assertEquals(15, myFracOut.getDenominator());
	}
	
	@Test
	public void testSubtractFraction() {
		myFrac1 = new MyFraction(2, 3, '+');
		myFrac2 = new MyFraction(4, 5, '+');
		
		MyFraction myFracOut = new MyFraction();
		
		myFracOut = myFrac1.subtract(myFrac2);
		
		assertEquals(-2, myFracOut.getNumerator());
		assertEquals(15, myFracOut.getDenominator());
	}
	
	@Test
	public void testMultiplyFraction() {
		myFrac1 = new MyFraction(2, 3, '+');
		myFrac2 = new MyFraction(4, 5, '+');
		
		MyFraction myFracOut = new MyFraction();
		
		myFracOut = myFrac1.multiply(myFrac2);
		
		assertEquals(8, myFracOut.getNumerator());
		assertEquals(15, myFracOut.getDenominator());
	}
	
	@Test
	public void testDivideFraction() {
		myFrac1 = new MyFraction(2, 3, '+');
		myFrac2 = new MyFraction(4, 5, '+');
		
		MyFraction myFracOut = new MyFraction();
		
		myFracOut = myFrac1.divide(myFrac2);
		
		assertEquals(10, myFracOut.getNumerator());
		assertEquals(12, myFracOut.getDenominator());
	}

}