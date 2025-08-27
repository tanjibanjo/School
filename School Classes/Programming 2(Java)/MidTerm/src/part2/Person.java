//************************************************************************
// Author: Lane Pollock
// Date: 25 Oct 2024
// Language: Java
// Assignment: FINAL EXAM PART 2
// Description: Modify the Person class to include GPA and Phone number
//  changing the methods and constructors to match
//************************************************************************


package part2;


public class Person {
	//instance variables
	private int age;
	private String firstName, lastName, phoneNumber;
	private double gpa;
	
	//constructors
	
	//default
	public Person() {
		this.age = 0;
		this.firstName = "Unknown";
		this.lastName = "Unknown";
		this.phoneNumber = "Unknown";
		this.gpa = 0.0;
	}
	
	//3 par
	public Person(String firstName, String lastName, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNumber = "Unknown";
		this.gpa = 0.0;
	}
	
	//5 par
	public Person(String firstName, String lastName, int age, 
					double gpa, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		setGpa(gpa); //for validation
		this.phoneNumber = phoneNumber;
	}
	
	//getters and setters

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


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


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		//validation
		if(gpa > 4) //more than 4
			gpa = 4.0;
		if(gpa < 0) //less than 0
			gpa = 0.0;
		else	//normal range
			this.gpa = gpa;
	}


	//methods
	//method to print the data of a person
	public String printData() {
		//return string
		String myReturn = "";
		//add to return
		myReturn += "Name: " + firstName + " " + lastName +
		            ", " + "Age: " + age + ", " + 
		            "GPA: " + gpa + ", " + 
		            "Phone: " + phoneNumber + "\n";
		
		
		return myReturn;
		} // END Person Class

	}
	