package CS2011.Lecture15.StudyThis_CopyConstructor;

// https://www.youtube.com/watch?v=JfdJZ_RpExE
// Copy Constructor -> Deep Copy

public class copyTest {

	public static void main(String[] args) {
		
		Employee obj1 = new Employee("Joe", "101");
		Employee obj2 = new Employee(obj1);
		
		System.out.println("-----Constructor 1");
		System.out.println(obj1);
		System.out.println(obj1.hashCode());
		
		System.out.println();
		
		System.out.println("-----Copy Constructor");
		System.out.println(obj2);
		System.out.println(obj2.hashCode());

	}

}
