package CS2011.Lecture22.Recursion.StudyThis;

/**
 * Multiple Recursion
 * 1.) More than one base case
 * 2.) More than one recursive call
 * 3.) Eg :- Fibonacci Series
 */

import java.util.Scanner;

public class ComputeFibb {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an index for the fibonacci number: ");
		int index = sc.nextInt();
		int result = compFibonacci(index);
		System.out.println("The fibonacci number at index " + index + " is " + result);
		
	}
	
	public static int compFibonacci(int num) {
		if (num < 0) {
			return -1;
		}
		else if (num == 0) {
			return 0;
		}
		else if (num == 1) {
			return 1;
		}
		else {
			return compFibonacci(num - 1) + compFibonacci(num - 2);
		}
	}

}