//************************************************************************
// Author: Lane Pollock
// Date: 25 Oct 2024
// Language: Java
// Assignment: FINAL EXAM PART 2
// Description: Driver for modified Person Class 
// Modifications: gpa and phoneNumber variables added 
//************************************************************************


package part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonDriver {

	public static void main(String[] args) {
		// local variables
		ArrayList<Person> students = new ArrayList<Person>();
		String firstName, lastName, phoneNumber;
		int age;
		int index = 0; //index for arraylist
		double gpa;
		
		//create data file
		//use try/catch just in case something doesn't work
		try {
			FileWriter myWriter = new FileWriter("Person.txt");
			
			//write to file
			myWriter.write("Kevin Roark 29 3.97 210-563-1234\n"
						 + "Sam Read 21 4.14 210-677-9876\n" 
						 + "Sally Smith 34 3.14 210-627-2468\n"
						 + "Bart Simpson 14 -.34 210-985-3579");
			
			//close the file
			myWriter.close();
			//success message
			System.out.println("Successfully wrote to file.");
		}
		catch(IOException e) {
			//an issue happened - message user
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		//now, we read file to array list
		try {
			//create file object
			File myObj = new File("Person.txt");
			
			//scanner to read
			Scanner myReader = new Scanner(myObj);
			
			while(myReader.hasNextLine()) {
				//read
				firstName = myReader.next();
				lastName = myReader.next();
				age = myReader.nextInt();
				gpa = myReader.nextDouble();
				phoneNumber = myReader.next();
				
				//add person to list
				students.add(new Person(firstName, lastName, 
							 age, gpa, phoneNumber));
				
			}
			//close file scanner
			myReader.close();
			
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		
		//iterate through list and print data
		while(index < students.size()) {
			System.out.println(students.get(index).printData() );
			index++;
		}

	}//end main

}//end class
