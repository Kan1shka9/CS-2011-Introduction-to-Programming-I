package CS2011.Lecture16;

import java.util.Scanner;

public class Demo2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1 = input.nextInt();
		double int2 = input.nextInt();
		double result = num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + result);
		input.close();
	}

}