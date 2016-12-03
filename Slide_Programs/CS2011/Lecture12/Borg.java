package CS2011.Lecture12;

public class Borg {
	
	// Variable
	private String name;
	
	// Static Variable
	private static int borgCount;
	
	// Constructor
	public Borg(String nameIn) {
		name = nameIn;
		borgCount += 1;
	}
	
	// Method
	public void stateName() {
		System.out.println(name + " of " + borgCount);
	}
	
	public static void main(String[] args) {
		int max = 9;
		borgCount = 0;
		
		// Create borgs
		Borg[] borgs = new Borg[max];
		
		for (int counter = 0; counter < max; counter++) {
			// Converts the integer to string
			String name = String.valueOf(counter + 1);
			// System.out.println(name);
			borgs[counter] = new Borg(name);
			borgs[counter].stateName();
		}
	}
	
}