/**
 * The MyFraction Class
 * This class will be used to represent a fraction. This class should have three private instance variables, one for the numerator, one for the denominator, and one to hold the sign (+ or -) of the fraction. The sign must be stored as the character + or -. You should include a constructor which creates a MyFraction object from a given numerator, denominator and sign. The numerator and denominator should always be positive and the sign of the entire fraction should be determined by the value of the sign instance variable.
 * MyFraction should also implement the methods found in the MyMath interface. If you don't remember how to perform these math operations on fractions the review here
 * add(MyFraction o) This should return a new MyFraction object which is the sum of two MyFraction objects.
 * subtract(MyFraction o) This should return a new MyFraction object which is the difference of two MyFraction objects.
 * multiply(MyFraction o) This should return a new MyFraction object which is the product of two MyFraction objects.
 * divide(MyFraction o) This should return a new MyFraction object which is the quotient of two MyFraction objects.
 * NOTE: Remember to deal with positive and negative fractions. Fractions where either the numerator or denominator are negative means the entire fraction is negative. Fractions where both the numerator and denominator are negative are positive. Keep this in mind when doing all math calculations.
 * You should also implement toString() to print a MyFraction object. The output of a fraction should look like the following examples. Notice that when a fraction is positive no sign appears, and when the fraction is negative the sign appears on the left of the numerator. 
 * -1/2
 * 5/2
 */

package Homework1.Lab8;

public class MyFraction implements MyMath<MyFraction> {
	
	// Private variables
	private int numerator;
	private int denominator;
	private char sign;
	
	// Default constructor
	public MyFraction() {
	}
	
	// Parameterized constructor
	public MyFraction(int numerator, int denominator, char sign) {
		this.numerator = numerator;
		this.denominator = denominator;
		this.sign = sign;
	}

	// Getters and Setters
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public char getSign() {
		return sign;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}
	
	// Method to get the sign of the fraction
	public int getSignValue() {
		if (sign == '+'){
			return 1;
		}
		else {
			return -1;
		}
	}

	@Override
	public MyFraction add(MyFraction o) {
		MyFraction myfracOut = new MyFraction();
		int revised_numerator = (this.numerator * this.getSignValue() * o.denominator) + (this.denominator * o.numerator * o.getSignValue()) ;
		myfracOut.setNumerator(revised_numerator);
		myfracOut.setDenominator(this.denominator * o.denominator);
		return myfracOut;
	}

	@Override
	public MyFraction subtract(MyFraction o) {
		MyFraction myfracOut = new MyFraction();
		int revised_numerator = (this.numerator * this.getSignValue() * o.denominator) - (this.denominator * o.numerator * o.getSignValue()) ;
		myfracOut.setNumerator(revised_numerator);
		myfracOut.setDenominator(this.denominator * o.denominator);
		return myfracOut;
	}

	@Override
	public MyFraction divide(MyFraction o) {
		MyFraction myfracOut = new MyFraction();
		int revised_numerator = this.numerator * this.getSignValue() * o.denominator * o.getSignValue();
		myfracOut.setNumerator(revised_numerator);
		myfracOut.setDenominator(this.denominator * o.numerator);
		return myfracOut;
	}

	@Override
	public MyFraction multiply(MyFraction o) {
		MyFraction myfracOut = new MyFraction();
		int revised_numerator = this.numerator * this.getSignValue() * o.numerator * o.getSignValue();
		myfracOut.setNumerator(revised_numerator);
		myfracOut.setDenominator(this.denominator * o.denominator);
		return myfracOut;
	}
	
	public String toString() {
		return numerator + "/" + denominator;	
	}
	
}