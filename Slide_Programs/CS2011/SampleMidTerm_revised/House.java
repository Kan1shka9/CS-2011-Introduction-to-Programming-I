package CS2011.SampleMidTerm_revised;

public class House extends Building{
	
	String description;
	
	public House(double size, boolean isHaunted, String description){
		super(size, isHaunted);
		this.description = description;
	}
	
	public void explore() {
		System.out.println("You pass a " + getSize() + " sq. meter house with a(n) " + getDescription());
		if (getisHaunted()) {
			System.out.println("Watch out! A ghost!");
		}
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

}