//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: Lab 3.1 - Employee
// Description: Class with attributes for employee Address
//************************************************************************

package lab1;

public class Address {
	//instance variables
	private String city, state, street, zip;
	
	/* CONSTRUCTORS */
	
	//default
	public Address() {
		this("Unknown", "Unknown", "Unknown", "Unknown");
	}
	
	//4 parameter
	public Address(String city, String st, String street, String zip) {
		this.city = city;
		this.state = st;
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
	
	//method to return string of formatted address
	public String printAddress() {
		//format return
		String str;
		str = String.format("%s\n%s, %s, %s\n", street, city, state, zip);
	
		return str;
	}


}
