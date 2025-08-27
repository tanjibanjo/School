//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: Lab 3.2 - University
// Description: Class with attributes for a university with a professor 
//  and course
//************************************************************************


package lab2;

public class University {
	//instance variables
	private String universityName, location;
	private Professor professor;
	
	/* CONSTRUCTORS */
	
	//default
	public University() {
		this.universityName = "Unknown";
		this.location = "Unknown";
		this.professor = new Professor(); //using default
	}
	
	//3 parameter
	public University(String name, String location, Professor prof) {
		this.universityName = name;
		this.location = location;
		this.professor = new Professor(prof); //using copy
	}
	
	//copy
	public University(University uni2) {
		this.universityName = uni2.universityName;
		this.location = uni2.location;
		this.professor = new Professor(uni2.professor); //using copy
	}
	
	/* GETTERS/SETTERS */

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Professor getProfessor() {
		return new Professor(professor);
	}

	public void setProfessor(Professor professor) {
		this.professor = new Professor(professor);
	}
	
	//method to print information
	public void printUniversity() {
		//local var
		String myReturn = "";
		myReturn +=  "# University #\n\tName: " + universityName 
				+ "\n\tLocation: " + location;
		
		System.out.println(myReturn);
		professor.printProfessor();
		}
	

	
	
}
