//************************************************************************
// Author: Lane Pollock
// Date: 26 Sep 2024
// Language: Java
// Assignment: demo with aggregation
// Description: Program to test Course and its aggregated classes
//************************************************************************


package lecture3;

public class CourseDriver {

	public static void main(String[] args) {
		//instance variables
		Instructor myInstructor = new Instructor("Roark", "Kevin", "MLH201");
		Textbook myTextbook = new Textbook("Starting Out with Java", 		
							  "Gaddis", "Addison-Wesley");
		Course myCourse = new Course("Intro to Java", myInstructor, myTextbook);
		
		//display course
		System.out.println(myCourse);
	}

}
