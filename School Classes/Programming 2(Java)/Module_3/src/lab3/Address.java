//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: Lab 3.3 - Parking Permit
// Description: Class with attributes for student Address
//************************************************************************

package lab3;

public class Address {
	//instance variables
	private String city, state, street, zip;
	
	/* CONSTRUCTORS */
	
	//default
	public Address() {
		this("Unknown", "Unknown", "Unknown", "Unknown");
	}
	
	//4 parameter
	public Address(String city, String state, String street, String zip) {
		this.city = city;
		this.state = state;
		this.street = street;
		this.zip = zip;
	}
	
	//copy 
	public Address(Address b) {
		this.city = b.city;
		this.state = b.state;
		this.street = b.street;
		this.zip = b.zip;
	}
	
	/* GETTERS/SETTERS */

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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	/* METHODS */
	
	//override method
	@Override
	public String toString() {
		//format return
		String str;
		str = String.format("\t%s\n\t%s, %s, %s\n", 
							street, city, state, zip);
		
		return str;
	}


}
