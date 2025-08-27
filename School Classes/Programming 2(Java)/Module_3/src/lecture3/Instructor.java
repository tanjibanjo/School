//************************************************************************
// Author: Lane Pollock
// Date: 26 Sep 2024
// Language: Java
// Assignment: demo with aggregation
// Description: Instructor class to hold values of an instructor
//************************************************************************


package lecture3;

public class Instructor {
	//instance variables
	private String lastName, firstName, officeNumber;
	
	//constructors
	public Instructor(String lName, String fName, String office)
	{
		lastName = lName;
		firstName = fName;
		officeNumber = office;
	}
	
	//copy const
	public Instructor(Instructor obj2) {
		this.lastName = obj2.lastName;
		this.firstName = obj2.firstName;
		this.officeNumber = obj2.officeNumber;
	}
	
	//setter
	//p.s. this is not good practice, we combine the individual setters into one for simplicity in this demo
	public void set(String lName, String fName, String office) {
		lastName = lName;
		firstName = fName;
		officeNumber = office;
	}
	
	//override the toString() method
	@Override
	public String toString() {
		String str = "\tLast Name: " + lastName +
					 "\n\tFirst Name: " + firstName +
					 "\n\tOffice Number: " + officeNumber;
		return str;
	}
}
