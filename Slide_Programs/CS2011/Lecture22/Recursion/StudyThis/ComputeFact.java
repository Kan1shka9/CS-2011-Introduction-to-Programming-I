package CS2011.Lecture22.Recursion.StudyThis;

import java.util.Scanner;

public class ComputeFact {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number for which the factorial has to be calculated :- ");
		int value = sc.nextInt();
		int result = compFactorial(value);
		System.out.println("The factorial of " + value + " is " + result);

	}
	
	public static int compFactorial(int num) {
		
		if (num == 0) {
			return 1;
		}
		else {
			return num * compFactorial(num-1);
		}
		
	}

}