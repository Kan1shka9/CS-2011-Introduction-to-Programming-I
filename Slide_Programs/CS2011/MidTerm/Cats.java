package CS2011.MidTerm;

public class Cats extends Animal {
	
	public Cats(String name, double weightInGrams) {
		super(name, weightInGrams);
	}

	@Override
	public void call() {
		System.out.println("meow!");
	}
	
	public String toString() {
		return "Cat named " + getName() + " weighs " + getWeightInGrams() + " grams and says \"Meow!\"";
	}

}