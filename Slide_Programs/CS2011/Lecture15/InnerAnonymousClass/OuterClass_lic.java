package CS2011.Lecture15.InnerAnonymousClass;

/**
 * Inner class inside a method is called Local Inner Class
 * Rules for Local Inner class
 * 1) Local inner class cannot be invoked from outside the method.
 * 2) Local inner class cannot access non-final local variable.
 */

public class OuterClass_lic {
	
	// -> Variables
	private int var_outerclass = 10;
	
	// -> Method
	public void display() {
		
		int var_insidemethod = 20;
		final int var_finalinsidemethod = 30;
		System.out.println("Outer");
		
		// Class inside a method
		class LocalInnerClass {
			void msg() {
				System.out.println(var_outerclass);
				System.out.println(var_insidemethod);
				System.out.println(var_finalinsidemethod);
			}	
		}
		
		// Local inner class cannot be invoked from outside the method.
		LocalInnerClass lobj = new LocalInnerClass();
		lobj.msg();
	}

	// -> Static method
	public static void main(String[] args) {
		OuterClass_lic obj1 = new OuterClass_lic();
		obj1.display();
	}

}