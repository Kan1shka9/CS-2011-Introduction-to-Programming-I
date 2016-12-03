package CS2011.Lecture15.InnerAnonymousClass;

/**
 * Compiled into OuterClassName$InnerClassName.class
 * 
 * An inner class can be defined as static. 
 * A static inner class can be accessed using the outer class name.
 * A static inner class cannot access non static members of the outer class.
 * 
 * If the inner class is static, use the following syntax to create an object for it:
 * OuterClass.InnerClass innerObject = new OuterClass.InnerClass();
 * 
 * Objects of an inner class are often created in the outer class. 
 * But you can also create an object of an inner class from another class. 
 * If the inner class is non static, you must first create an instance of the outer class, then use the following syntax to create an object for the inner class: 
 * OuterClass.InnerClass innerObject = outerObject.new InnerClass();
 */

// An outer class
public class OuterClass {
	private int data = 10;
	
	// Method in the outer class
	public int m(int a, int b) {
		return a + b;
	}
	
	// An inner class
	class InnerClass {
		// Method in the inner class
		public void mi() {
			// Directly reference data and method defined in the outer class
			data++;
			System.out.println(data);
			System.out.println(m(5,4));
		}
	}
	
	public static void main(String args[]) {
		
		OuterClass outerObject = new OuterClass();
		OuterClass.InnerClass innerObject = outerObject.new InnerClass();
		innerObject.mi();
		
	}
	
}