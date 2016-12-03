package MethodOverriding;

/**
 * Polymorphism
 * Output:-
 * disp() method of Child class
 * abc() method of parent class 
 * ABC obj = new Test();
 * The 'obj' can access all the methods of the parent class but not the child class until and unless these methods are overridden by the child class.
 */

class ABC{
	public void disp(){
	      System.out.println("disp() method of parent class");
	}
	   
	public void abc(){
		System.out.println("abc() method of parent class");
	}	   
}

	
class Test extends ABC{
	   public void disp(){
	      System.out.println("disp() method of Child class");
	   }
	   
	   public void xyz(){
	      System.out.println("xyz() method of Child class");
	   }
	   
	   public static void main( String args[]) {
	      //Parent class reference to child class object
		  Test obj1 = new Test();
		  obj1.disp();
		  obj1.abc();
	      ABC obj = new Test();
	      obj.disp(); // This method is overridden by the child class Test
	      obj.abc(); // This method is only present in the parent class ABC
	      // obj.xyz(); -> Error - The method xyz() is undefined for the type ABC
	   }
}