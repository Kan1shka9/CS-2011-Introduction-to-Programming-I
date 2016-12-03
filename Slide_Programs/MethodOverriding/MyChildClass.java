package MethodOverriding;

/**
 * The Access Modifier of the overriding method (method of subclass) cannot be more restrictive than the overridden method of parent class.  
 * For e.g. if the Access Modifier of base class method is public then the overriding method (child class method) cannot have private, protected and default Access modifier as all of the three are more restrictive than public.
 */

class MyBaseClass{
	protected void disp(){
		System.out.println("Parent class method");
	}
}
	
class MyChildClass extends MyBaseClass{
	public void disp(){
		System.out.println("Child class method");
	}
	
	public static void main( String args[]) {
	      MyChildClass obj = new MyChildClass();
	      obj.disp();
	}
}