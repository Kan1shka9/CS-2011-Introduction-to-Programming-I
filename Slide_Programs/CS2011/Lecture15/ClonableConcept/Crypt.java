package CS2011.Lecture15.ClonableConcept;

public class Crypt implements Cloneable {
	
	private String location;

	public Crypt(String location) {
		this.location = location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public String toString(){
		return "a mysterious crypt in " + location;		
	}
	
	@Override
	public Crypt clone(){
		return new Crypt(location);		
	}	

}