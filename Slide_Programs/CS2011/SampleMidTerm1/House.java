package CS2011.SampleMidTerm1;

public class House extends Building{
	
	String description;  // (for example, "charming fireplace" or "updated kitchen".) 
	
	public House(double size, boolean isHaunted, String description) {
		super(size, isHaunted);
		this.description = description;
	}
	
	@Override
	public void explore() {
		System.out.println("You pass a " + getSize() + " sq. meter house with a(n) " + getDescription());
		if (isHaunted()) {
			System.out.println("Watch out! A ghost!");
			count++;
		}
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desciption) {
		this.description = desciption;
	}
		
}