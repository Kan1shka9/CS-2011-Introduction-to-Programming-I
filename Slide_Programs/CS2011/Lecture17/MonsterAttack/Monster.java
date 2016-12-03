package CS2011.Lecture17.MonsterAttack;

public interface Monster {
	
	public void setName(String name);
	public String getName();
	
	// new in this version
	public void setLocation(String location);
	public String getLocation();  
	
	public void rampage();
	public String getOriginStory();
	
}