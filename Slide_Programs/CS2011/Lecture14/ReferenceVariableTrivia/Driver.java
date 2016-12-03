package CS2011.Lecture14.ReferenceVariableTrivia;

public class Driver {

	public static void main(String[] args) {
		
		/*This doesn't work because the reference variable is of the type Vehicle and it doesn't know anything about installSidecar*/
		// porky is object of Motorcycle but is referenced by Vehicle
		Vehicle porky = new Motorcycle(800, "Harley", 500, 200);
		// Uncomment the below line to see why it doesn't work
		// porky.installSidecar();
		
		/*This is work because the reference variable is of the type Motorcycle*/
		Motorcycle hindenberg = new Motorcycle(800, "MotorHaya", 800, 500);
		hindenberg.installSidecar();
					
	}

}