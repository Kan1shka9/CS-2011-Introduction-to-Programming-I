package CS2011.Lecture15.InstanceOf;

public class testInstanceOf {

	public static void main(String[] args) {
		
		Archimedes obj1 = new Archimedes();
		testInstanceOf obj2 = new testInstanceOf();
		
		if (obj1 instanceof Archimedes) {
			System.out.println("obj1 is instance of Archimedes");
		}
		else {
			System.out.println("obj1 is not an instance of Archimedes");
		}
		
		if (obj2 instanceof testInstanceOf) {
			System.out.println("obj2 is instance of Archimedes");
		}
		else {
			System.out.println("obj2 is not an instance of Archimedes");
		}
		
		/*if (obj2 instanceof Archimedes) {
			System.out.println("obj1 is instance of Archimedes");
		}
		else {
			System.out.println("obj1 is not an instance of Archimedes");
		}*/

	}

}