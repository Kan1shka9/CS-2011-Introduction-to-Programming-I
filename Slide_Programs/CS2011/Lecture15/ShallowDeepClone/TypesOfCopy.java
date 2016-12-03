package CS2011.Lecture15.ShallowDeepClone;

public class TypesOfCopy {
	
	public static void main(String[] args) {
		/**
		 * https://www.youtube.com/watch?v=WIh-TVq4ifI
		 * Shallow -> obj and obj2 point to the same location in memory. Any change to either value will change both
		 * Deep -> new object is created with its own memory location so any change to one will not change the other
		 * Clone
		 */
		
		// Shallow copy
		Abc obj = new Abc();
		obj.i = 5;
		obj.j = 6;
		System.out.println(obj); // i = 5 j = 6
		
		Abc obj1  = new Abc(); // Default values of instance variables is 0
		System.out.println(obj1);  // i = 0 j = 0
		
		Abc obj2 = obj;
		System.out.println(obj2); // i = 5 j = 6

		System.out.println(obj); // i = 5 j = 6
		
		// Deep copy
		Abc obj3 = new Abc();
		obj3.i = obj.i;
		obj3.j = obj.j;
		System.out.println(obj3); // i = 5 j = 6
		
	}

}

class Abc {
	int i;
	int j;
	
	@Override
	public String toString() {
		return "i = " + i + " j = " + j;
	}
}