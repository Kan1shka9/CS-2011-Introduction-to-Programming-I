package Homework1.Lab7;

public class Person {

	/**
	 * A Person has a name and an Address (represented by an object of class Address, not a String).
	 * Note that the subclasses of Person inherit the fields and methods of Person. You may need to override some of the methods in the subclasses.
	 **/
	
	private String personName;
	private Address address = new Address();
	
	public Person(){
	}
	
	public Person(String personName){
		this.personName = personName;
	}
	
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString() {
		return "Person Name " + personName + " address " + address.toString();
	}	

}