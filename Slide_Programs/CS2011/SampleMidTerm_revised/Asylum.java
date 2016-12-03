package CS2011.SampleMidTerm_revised;

public class Asylum extends Building{
	
	String name;
	
	public Asylum(double size, boolean isHaunted, String name) {
		super(size, isHaunted);
		this.name = name;
	}
	
	public void explore() {
		System.out.println("You pass a " + getSize() + " sq. meter asylum called " + getName());
		if (getisHaunted()) {
			System.out.println("Watch out! A ghost!");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}