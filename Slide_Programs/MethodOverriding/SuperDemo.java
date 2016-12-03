package MethodOverriding;

class XYZ{
	public void mymethod(){
		System.out.println("Class XYZ: mymethod()");
	}	   
}

class SuperDemo extends XYZ{
	public void mymethod(){
		  //This will call the mymethod() of parent class
	      super.mymethod();
	      System.out.println("Class SuperDemo: mymethod()");
	}
	   
	public static void main( String args[]) {
		SuperDemo obj = new SuperDemo();
		obj.mymethod();
	}
}