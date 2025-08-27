//************************************************************************
// Author: Lane Pollock
// Date: 14 Nov 2024
// Language: Java
// Assignment: Lab 1: Medical Provider
// Description: OfficeLocation class to hold values of an office location
//************************************************************************


package lab1;

import java.util.Objects;

public class OfficeLocation {
	//instance variables
	private String locationName,
				   city,
				   zip,
				   streetAddress,
				   state;
	
	//constructors
	public OfficeLocation() {
		this.locationName = "Unknown";
		this.city = "Unknown";
		this.zip = "Unknown";
		this.streetAddress = "Unknown";
		this.state = "Unknown";
	}
	
	public OfficeLocation(String locationName, String city, String zip,
							String streetAddress, String state) {
		this.locationName = locationName;
		this.city = city;
		this.zip = zip;
		this.streetAddress = streetAddress;
		this.state = state;
	}
	
	public OfficeLocation(OfficeLocation copy) {
		this.locationName = copy.locationName;
		this.city = copy.city;
		this.zip = copy.zip;
		this.streetAddress = copy.streetAddress;
		this.state = copy.state;
	}
	
	//getters and setters

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//methods
	
	//override toString
	@Override
	public String toString() {
		return "Office Location:\n\t" + locationName
				+ "\n\t" + streetAddress + ", " + city + ", " 
				+ state;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, locationName, state, 
							streetAddress, zip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OfficeLocation other = (OfficeLocation) obj;
		return Objects.equals(city, other.city) 
				&& Objects.equals(locationName, other.locationName)
				&& Objects.equals(state, other.state) 
				&& Objects.equals(streetAddress, other.streetAddress)
				&& Objects.equals(zip, other.zip);
	}
	

}
