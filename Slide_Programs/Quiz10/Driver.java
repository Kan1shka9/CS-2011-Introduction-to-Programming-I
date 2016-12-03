package Quiz10;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first complex number :- ");
		double real1 = sc.nextDouble();
		double imaginary1 = sc.nextDouble();
		
		System.out.print("Enter the second complex number :- ");
		double real2 = sc.nextDouble();
		double imaginary2 = sc.nextDouble();

		Complex c1= new Complex(real1,imaginary1);
		Complex c2= new Complex(real2,imaginary2);
		Complex res=new Complex();
		
		res= c1.addition(c2);
		System.out.println("(" + real1 + " + " + imaginary1 + "i" + ")" + " + " + "(" + real2 + " + " + imaginary2 + "i" + ")" + " = " + res);
		
		res= c1.subtraction(c2);
		System.out.println("(" + real1 + " + " + imaginary1 + "i" + ")" + " - " + "(" + real2 + " + " + imaginary2 + "i" + ")" + " = " + res);
		
		res=c1.multiplication(c2);
		System.out.println("(" + real1 + " + " + imaginary1 + "i" + ")" + " * " + "(" + real2 + " + " + imaginary2 + "i" + ")" + " = " + res);
		
		res=c1.division(c2);
		System.out.println("(" + real1 + " + " + imaginary1 + "i" + ")" + " / " + "(" + real2 + " + " + imaginary2 + "i" + ")" + " = " + res);
		
		sc.close();

	}

}