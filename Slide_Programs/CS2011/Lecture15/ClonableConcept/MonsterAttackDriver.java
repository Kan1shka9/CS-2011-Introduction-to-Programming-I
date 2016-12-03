package CS2011.Lecture15.ClonableConcept;

public class MonsterAttackDriver {
	
	public static void main(String[] args) throws CloneNotSupportedException {

		Vampire v1 = new Vampire("Dracula", "Transylvania");

		// clone() returns an Object, but it will be a Vampire.  To use methods that are not inherited from Object, we need to cast.
		Vampire v2 = v1.clone();   

		v2.setName("Bob");
		v2.setLocation("Burbank");

		v1.rampage();
		v2.rampage(); 

	}

}