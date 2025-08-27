//************************************************************************
// Author: Lane Pollock
// Date: 14 Nov 2024
// Language: Java
// Assignment: Lab 1: Medical Provider
// Description: Doctor class that extends MedicalProvider abstract class
//************************************************************************


package lab1;

import java.util.Objects;

public class Doctor extends MedicalProvider{
	//instance variables
	private double yearlySalary;
	private String specialty, 
				   licenseNumber;
	
	//constructors
	
	public Doctor() {
		super();
		this.yearlySalary = 0.0;
		this.specialty = "Unknown";
		this.licenseNumber = "Unknown";
	}
	
	public Doctor(String firstName, String lastName, 
		String employeeID, OfficeLocation employeeOfficeLocation,
		double yearlySalary, String specialty, String licenseNumber) {
		
		super(firstName, lastName, employeeID, employeeOfficeLocation);
		this.yearlySalary = yearlySalary;
		this.specialty = specialty;
		this.licenseNumber = licenseNumber;
	}
	
	public Doctor(Doctor copy) {
		super(copy.getFirstName(), copy.getLastName(), 
			  copy.getEmployeeID(), copy.getEmployeeOfficeLocation());
		
		this.yearlySalary = copy.yearlySalary;
		this.specialty = copy.specialty;
		this.licenseNumber = copy.licenseNumber;
	}
	
	//getters and setters

	public double getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	
	//implement abstract methods
	
	//method to pay employee, as weekly pay
	@Override
	public double payEmployee() {
		return yearlySalary / 52; //no of weeks in year
	}
	
	//toString method to print doctor specific info
	@Override
	public String toString() {
		String str =
				"Doctor " + super.toString() + "\nSpecialty: " +
				specialty + "\nLicense Number: " + licenseNumber + 
				"\nWeekly Pay: $";
		return String.format("%s%,.2f", str, payEmployee());
	}

	//hashcode and equals overriding
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + 
				Objects.hash(licenseNumber, specialty, yearlySalary);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		return Objects.equals(licenseNumber, other.licenseNumber) 
				&& Objects.equals(specialty, other.specialty)
				&& Double.doubleToLongBits(yearlySalary) == 
				Double.doubleToLongBits(other.yearlySalary);
	}

}
