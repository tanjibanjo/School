//************************************************************************
// Author: Lane Pollock
// Date: 26 Sep 2024
// Language: Java
// Assignment: demo with aggregation
// Description: Course class that hold the fields of courses
//************************************************************************

package lecture3;

public class Course {
	//instance variables
	private String courseName;
	private Instructor instructor;
	private Textbook textbook;
	
	//constructors
	public Course(String name, Instructor instr, Textbook text) {
		courseName = name;
		instructor = new Instructor(instr); //use copy const so we create new instance!!
		textbook = new Textbook(text); //use copy const
	}
	
	//getters
	public String getCourseName() {
		return courseName;
	}

	public Instructor getInstructor() {
		//this returns a copy of constructor
		return new Instructor(instructor);
	}

	public Textbook getTextbook() {
		return new Textbook(textbook);
	}
		
	
	//override toString()
	@Override
	public String toString() {
		String str = "Course: " + courseName + 
					 "\nInstructor: \n" + instructor +
					 "\nTextbook: \n" + textbook;
		return str;
	}



}
