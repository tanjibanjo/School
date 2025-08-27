//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: Lab 3.2 - University
// Description: Driver class for the University, Professor, and Course 
//  classes
//************************************************************************


package lab2;

import java.util.Scanner;

public class UniversityMain {

	public static void main(String[] args) {
		//local variables
		String courseName, courseCode, professorName, department;
		String universityName, location;
		//new instances
		Scanner in = new Scanner(System.in);
		Course course1;
		Professor professor1;
		University university1;
		
		
		//prompt for data
		System.out.print("Enter info for course.\nName: ");
		courseName = in.nextLine();
		
		System.out.print("Code: ");
		courseCode = in.nextLine();
		
		System.out.print("Enter data for professor.\nName: ");
		professorName = in.nextLine();
		
		System.out.print("Department: ");
		department = in.nextLine();
		
		System.out.print("Enter data for university.\nName: ");
		universityName = in.nextLine();
		
		System.out.print("Location: ");
		location = in.nextLine();	
		
		//close the scanner
		in.close();
		
		//instantiate the objects
		course1 = new Course(courseName, courseCode);
		professor1 = new Professor(professorName, department, course1);
		university1 = new University(universityName, location, professor1);
		
		//output nicely - uses the toString() method
		System.out.println();
		university1.printUniversity();
	}

}
