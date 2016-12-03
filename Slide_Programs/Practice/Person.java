package Practice;

/**
 * instanceof --- objects
 * equals --- boolean
 * comparedTo --- int
 * copyconstructor ---
 * cloning ---
 */

public class Person implements Cloneable, Comparable<Person>{

	// Private Variables
	private String name;
	private Integer age;
	
	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Copy Constructor
	public Person(Person otherP) {
		this.name = otherP.name;
		this.age  = otherP.age;
	}
	
	// Getters
	public String  getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// Equals
	public boolean equals(Person o) {
		if (this == o) {
			return true;
		}
		if (this == null || this.getClass() != o.getClass()) {
			return false;
		}
		Person otherperson = (Person)o;
		if (this.name.equals(otherperson.name) && (this.age.equals(otherperson.age))) {
			return true;
		}
		return false;
	}
	
	// compareTo
	public int compareTo(Person o) {
		return this.age.compareTo(o.age);
	}
	
	// Cloning
	public Person clone() throws CloneNotSupportedException {
		return (Person)super.clone();
	}
	
	public String toString() {
		return getName() + ":" + getAge();
	}
	
}