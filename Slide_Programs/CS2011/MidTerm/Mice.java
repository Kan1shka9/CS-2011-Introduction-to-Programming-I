package CS2011.MidTerm;

public class Mice extends Animal {

	public Mice(String name, double weightInGrams) {
		super(name, weightInGrams);
	}

	@Override
	public void call() {
		System.out.println("eek!");		
	}
	
	public String toString() {
		return "Mouse named " + getName() + " weighs " + getWeightInGrams() + " grams and says \"Eek!\"";
	}

}