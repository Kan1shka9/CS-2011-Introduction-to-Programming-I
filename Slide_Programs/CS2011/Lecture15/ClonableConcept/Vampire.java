package CS2011.Lecture15.ClonableConcept;

public class Vampire implements Monster, Cloneable {
	
	private String name;
	private Crypt crypt;

	public Vampire(String nameIn, String location) {
		name = nameIn;
		crypt = new Crypt(location);
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setLocation(String location) {
		crypt.setLocation(location);
	}

	@Override
	public String getOriginStory() {
		return "undead creature which lives by sucking the blood of living humans";
	}
	
	@Override
	public void rampage() {
		System.out.println(name + " arises from "
		+ crypt.toString() + " as a bat, flies around and sucks people's blood all night, then returns to his coffin"
		+ " to hide from sunlight");
		
	}

	@Override
	public Vampire clone() throws CloneNotSupportedException {
		/*
		 * Object clone() returns an Object. 
		 * To get to anything specific to Vampires, we need to cast it to a Vampire and use a Vampire reference variable
		 */
		
		Vampire newV;
		newV = (Vampire) super.clone();
		newV.crypt= crypt.clone();
		return newV;

	}
	
}