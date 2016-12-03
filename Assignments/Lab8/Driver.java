package Homework1.Lab8;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("MyFraction Demo:- ");
		MyFraction myf1 = new MyFraction(2,3,'+');
		MyFraction myf2 = new MyFraction(4,5,'+');
		MyFraction myf3 = new MyFraction();
		
		System.out.println("Add :- ");
		myf3 = myf1.add(myf2);
		System.out.println(myf3);
		
		System.out.println("Subtract :- ");
		myf3 = myf1.subtract(myf2);
		System.out.println(myf3);
		
		System.out.println("Multiply :- ");
		myf3 = myf1.multiply(myf2);
		System.out.println(myf3);
		
		System.out.println("Divide :- ");
		myf3 = myf1.divide(myf2);
		System.out.println(myf3);		
		
		System.out.println("---------------------------------------------");
		
		System.out.println("MySet Demo:- ");

		int[] intArr3 = {1,2,3};
		int[] intArr4 = {2,3,4};
		
		MySet set1 = new MySet(intArr3); 
		MySet set2 = new MySet(intArr4); 
		MySet set3 = new MySet();
		
		System.out.println("Add :- ");
		set3 = set1.add(set2);
		System.out.println(set3);
		
		System.out.println("Subtract :- ");
		set3 = set1.subtract(set2);
		System.out.println(set3);
		
		System.out.println("Multiply :- ");
		set3 = set1.multiply(set2);
		System.out.println(set3);
		
		System.out.println("Divide :- ");
		set3 = set1.divide(set2);
		System.out.println(set3);

	}
	
}