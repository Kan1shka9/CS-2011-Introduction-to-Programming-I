package CS2011.Lecture17.MonsterAttack;

public class MonsterAttackDriver {

	public static void main(String[] args) {
		Monster dracula;
		String dName = "Dracula", dNewName = "Bob", dHome = "Transylvania";
				
		dracula = new Vampire(dName, dHome);
		// if(!(dracula.getName().equals(dName)) System.out.println("Name error");
		
		dracula.setName(dNewName);
		// if(!(dracula.getName().equals(dNewName)) System.out.println("Name error");
		
		if(dracula.getOriginStory() == null) System.out.println("Origin story error");

		// etc.  Test all public methods	
	}
}