package CS2011.Lecture16;

import java.util.Scanner;

public class Demo2_ExceptionFixed {
	
	public static int quotient(int num1, int num2) {
		
		if (num2 == 0)
			throw new ArithmeticException("Divisor cannot be zero");
		
		return num1 / num2;
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		
		try {
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			double result = quotient(num1, num2);
			System.out.println(num1 + "/" + num2 + "=" + result);
		}

		catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} 
		
		finally {
			input.close();
		}
		
		System.out.println("festivities continue without a crash!");
		
	}

}