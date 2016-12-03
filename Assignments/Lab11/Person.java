package Homework1.Lab11;

public abstract class Person implements Comparable<Person> {
	
	protected String firstName;
    protected java.util.Date birthdate;
    
    public Person(String firstName, java.util.Date birthdate) {
        this.firstName = firstName;
        this.birthdate = birthdate;
    }
    
    public abstract Double getSalary();
    
    public java.util.Date getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return firstName;
    }

    public String toString() {
        return getName() + " was born on " + birthdate;
    }
    
    public int compareTo(Person o) {
    	return this.getSalary().compareTo(o.getSalary());    	
    }

}