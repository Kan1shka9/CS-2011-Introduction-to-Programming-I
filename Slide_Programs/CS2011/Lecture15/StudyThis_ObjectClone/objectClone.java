package CS2011.Lecture15.StudyThis_ObjectClone;

// https://www.youtube.com/watch?v=EhxJ7QyBy-Q
// Cloning -> Deep Copy

public class objectClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee obj1 = new Employee("Test11", "111");
		
		System.out.println("------Display from original object :- ");
		System.out.println(obj1);
		System.out.println("Hashcode of obj1 :- " + obj1.hashCode());
		
		Employee obj2 = obj1.clone();  // Step 3
		
		System.out.println("------Display from cloned object :- ");
		System.out.println(obj2);
		System.out.println("Hashcode of obj1 :- " + obj2.hashCode());

	}

}

/**
 * $ javap java.lang.Cloneable
 *	Compiled from "Cloneable.java"
 *	public interface java.lang.Cloneable {
 *	}
**/