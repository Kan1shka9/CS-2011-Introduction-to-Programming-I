package CS2011.SampleMidTerm1;

public class Asylum extends Building{
	
	String name;  // (e.g., "State Home For The Criminally Insane.")  
	
	public Asylum(double size, boolean isHaunted, String name) {
		super(size, isHaunted);
		this.name = name;
	}

	@Override
	public void explore() {
		System.out.println("You pass a " + getSize() + " sq. meter asylum called " + getName());
		if (isHaunted()) {
			System.out.println("Watch out! A ghost!");
			count++;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}