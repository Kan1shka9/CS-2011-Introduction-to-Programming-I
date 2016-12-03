package Homework1.Lab7;

public class Address {
	
	/**
	 * An address has a street number, street name, city, state or province, and country.
	 **/
	
	private int streetNumber;
	private String streetName; 
	private String city;
	private String state;
	private String country;
	
	public Address() {	
	}
	
	public Address(int streetNumber, String streetName, String city, String state, String country){
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public int getStreetNumber() {
		return streetNumber;
	}
	
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	
	public String getStreetName() {
		return streetName;
	}
	
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString() {
		return "\nStreet Number :- " + streetNumber + "\nStreet Name :- " + streetName + "\nCity :- " + city + "\nState :- " + state +  "\nCountry :- " + country;
	}

}