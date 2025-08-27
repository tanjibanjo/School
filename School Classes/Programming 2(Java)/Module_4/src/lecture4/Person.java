//************************************************************************
// Author: Lane Pollock
// Date: 25 Oct 2024
// Language: Java
// Assignment: FINAL EXAM PART 2
// Description: Modify the Person class to include GPA and Phone number
//  changing the methods and constructors to match
//************************************************************************


package lecture4;


public class Person {
	//instance variables
	private int age;
	private String firstName, lastName;
	
	//constructors
	public Person() {
		this.age = 0;
		this.firstName = "None";
		this.lastName = "None";
	}
	
	
	public Person(String firstName, String lastName, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	//getters and setters

	public int getAge() {
		return age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String printData() {
		String myReturn = "";
		myReturn += "Name: " + getFirstName() + " " +
		getLastName() + "\n";
		myReturn += " Age: " + getAge();
		return myReturn;
		} // END Person Class

	}
	