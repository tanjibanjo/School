//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: Lab 3.2 - University
// Description: Class with attributes for a professor at a university
//************************************************************************


package lab2;

public class Professor {
	//instance variables
	private String professorName, department;
	private Course course;
	
	/* CONSTRUCTORS */
	
	//default 
	public Professor() {
		professorName = "Unknown";
		department = "Unknown";
		course = new Course(); //using default
	}
	
	//3 parameter
	public Professor(String professorName, String department, Course b) {
		this.professorName = professorName;
		this.department = department;
		this.course = new Course(b); //using copy
	}
	
	//copy
	public Professor(Professor b) {
		this.professorName = b.professorName;
		this.department = b.department;
		this.course = new Course(b.course); //using copy
	}
	
	/* GETTERS/SETTERS */

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Course getCourse() {
		return new Course(course);
	}

	public void setCourse(Course course) {
		this.course = new Course(course);
	}
	
	//method to print info from professor
	public void printProfessor() {
		String myReturn = "";
		myReturn += "# Professor #\n\tName: " + professorName + 
				   "\n\tDepartment: " + department;
		System.out.println(myReturn);
		course.printCourse();
	}

}
