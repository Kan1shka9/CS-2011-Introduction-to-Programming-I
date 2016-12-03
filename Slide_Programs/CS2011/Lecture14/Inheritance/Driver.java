package CS2011.Lecture14.Inheritance;

public class Driver {

	public static void main(String[] args) {
		
		Vehicle shredder = new Car(1000, "Mazda", 1900, "gasoline", "ABC-123");
		System.out.println(shredder);
		shredder.accelerate(20);
		shredder.steer(100, 0);
		System.out.println(shredder);

		System.out.println();
		Vehicle hindenburg = new Motorcycle(240, "BMW", 594, 80);
		hindenburg.steer(70, 0);
		hindenburg.accelerate(90);
		System.out.println(hindenburg);

		System.out.println();
		Vehicle porky = new Motorcycle(400, "Harley-Davidson", 1200, 150);
		porky.accelerate(150);
		porky.steer(180, 45);
		System.out.println(porky);
		
	}
	
}