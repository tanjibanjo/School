//************************************************************************
// Author: Lane Pollock
// Date: 14 Nov 2024
// Language: Java
// Assignment: Lab 1: Medical Provider
// Description: MedicalProvider abstract class to hold values 
//  for a generic medical provider
//************************************************************************


package lab1;

import java.util.Objects;

public abstract class MedicalProvider {
	//instance variables
	private String firstName,
		   		   lastName,
		   		   employeeID;
	private OfficeLocation employeeOfficeLocation;
	
	//constructors
	public MedicalProvider() {
		this.firstName = "Unknown";
		this.lastName = "Unknown";
		this.employeeID = "Unknown";
		this.employeeOfficeLocation = new OfficeLocation(); 
	}
	
	public MedicalProvider(String firstName, String lastName, 
			String employeeID, OfficeLocation employeeOfficeLocation) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.employeeOfficeLocation = 
				new OfficeLocation(employeeOfficeLocation);
	}
	
	public MedicalProvider(MedicalProvider copy) {
		this.firstName = copy.firstName;
		this.lastName = copy.lastName;
		this.employeeID = copy.employeeID;
		this.employeeOfficeLocation = 
				new OfficeLocation(copy.employeeOfficeLocation);
	}
	
	//getters and setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public OfficeLocation getEmployeeOfficeLocation() {
		return new OfficeLocation(employeeOfficeLocation);
	}

	public void setEmployeeOfficeLocation(OfficeLocation 
									employeeOfficeLocation) {
		this.employeeOfficeLocation = 
				new OfficeLocation(employeeOfficeLocation);
	}
	
	//methods
	
	//abstract method to pay employee
	public abstract double payEmployee();
	
	//override methods for toString and comparison
	@Override 
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\nEmployee ID: " 
				+ employeeID + "\n" + employeeOfficeLocation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeID, employeeOfficeLocation, 
							firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedicalProvider other = (MedicalProvider) obj;
		return Objects.equals(employeeID, other.employeeID)
				&& Objects.equals(employeeOfficeLocation,
								other.employeeOfficeLocation)
				&& Objects.equals(firstName, other.firstName) 
				&& Objects.equals(lastName, other.lastName);
	}

}
