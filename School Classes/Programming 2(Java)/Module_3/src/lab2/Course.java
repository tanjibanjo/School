//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: Lab 3.2 - University
// Description: Class with attributes for a course at a university
//************************************************************************


package lab2;

public class Course {
	//instance variables
	private String courseName, courseCode;
	
	/* CONSTRUCTORS */
	
	//default
	public Course() {
		this.courseName = "Unknown";
		this.courseCode = "Unknown";
	}
	
	//2 parameter
	public Course(String name, String code) {
		courseName = name;
		courseCode = code;
	}
	
	//copy
	public Course(Course b) {
		this.courseName = b.courseName;
		this.courseCode = b.courseCode;
	}
	
	/* GETTERS/SETTERS */

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	//method to print the info
	public void printCourse() {
		String myReturn = "";
		myReturn += "# Course #\n\tName: " + courseName
				+ "\n\tCode: " + courseCode;
		System.out.println(myReturn);
	}

}
