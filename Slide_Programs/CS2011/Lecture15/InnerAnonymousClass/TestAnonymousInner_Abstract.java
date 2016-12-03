package CS2011.Lecture15.InnerAnonymousClass;

/**
 * Anonymous inner class
 * 1.) A class that have no name is known as anonymous inner class in java.
 * 2.) Used to override methods of abstract class, concrete class or interface
 */

// Do not define abstract class as public
abstract class Person {
	abstract void eat(); 
}

public class TestAnonymousInner_Abstract {

	public static void main(String[] args) {
		
		Person p = new Person() {
			
			@Override
			void eat() {
				System.out.println("Every person has to eat.");
			}
			
		};
		
		p.eat();

	}

}