package CS2011.Lecture22.Recursion;

import javax.swing.JOptionPane;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null,  "Please enter the number whose factorial you would like to compute"));
		JOptionPane.showMessageDialog(null,  "The factorial of " + num + " is " + factorialRecursive(num));
		
	}
	
	public static int factorialRecursive(int intIn) {
		
		if(intIn == 0)  {
			return 1;
		}	
		else {
			return intIn * factorialRecursive(intIn - 1);
		}	
	}

}