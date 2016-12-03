package CS2011.Lecture15.Interface;

public class UniqueMonster implements Monster {
	
	private String name;
	private String weapon;
	private String location;
	private String originStory;
	
	public UniqueMonster(String name, String weapon, String location, String originStory) {
		this.name = name;
		this.weapon = weapon;
		this.location = location;
		this.originStory = originStory;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void setLocation(String location){
		this.location = location;		
	}
	
	@Override
	public void rampage() {
		System.out.println(name + " destroys " + location + " with " + weapon);		
	}

	@Override
	public String getOriginStory() {
		return originStory;		
	}

	@Override
	public String getName() {
		return name;
	}
	
}