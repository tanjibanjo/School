//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: Lab 3.3 - Parking Permit
// Description: Class with attributes for a student with address, name and
//  parking permit
//************************************************************************


package lab3;

public class Student {
	//instance variables
	private String firstName, lastName;
	private Address address;
	private ParkingPermit parkingPermit;
	
	/* CONSTRUCTORS */
	
	//default
	public Student() {
		this.firstName = "Unkown";
		this.lastName = "Unkown";
		this.address = new Address(); //using default
		this.parkingPermit = new ParkingPermit(); //default
	}
	
	//4 parameter
	public Student(String firstName, String lastName, Address address, 
					ParkingPermit parkingPermit) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = new Address(address);
		this.parkingPermit = new ParkingPermit(parkingPermit);
	}
	
	//copy
	public Student(Student b) {
		this.firstName = b.firstName;
		this.lastName = b.lastName;
		this.address = new Address(b.address);
		this.parkingPermit = new ParkingPermit(b.parkingPermit);
	}
	
	/* GETTERS/SETTERS */

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

	public Address getAddress() {
		return new Address(address);
	}

	public void setAddress(Address address) {
		this.address = new Address(address);
	}

	public ParkingPermit getParkingPermit() {
		return new ParkingPermit(parkingPermit);
	}

	public void setParkingPermit(ParkingPermit parkingPermit) {
		this.parkingPermit = new ParkingPermit(parkingPermit);
	}
	
	//override method
	@Override
	public String toString() {
		String str;
		str = String.format("%s %s", firstName, lastName);
		
		return str;
	}
	
	

}
