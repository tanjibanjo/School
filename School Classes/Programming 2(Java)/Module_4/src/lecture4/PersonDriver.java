package lecture4;

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
		String firstName, lastName;
		int age;
		int index = 0; //index for arraylist
		
		//create data file
		//use try/catch just in case something doesn't work
		try {
			FileWriter myWriter = new FileWriter("person.txt");
			
			//write to file
			myWriter.write("Kevin Roark 29\n" + "Sam Read 21\n" + "Sally Smith 34\n" +"Bart Simpson 14");
			
			//close the file
			myWriter.close();
			
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
			File myObj = new File("person.txt");
			
			//scanner to read
			Scanner myReader = new Scanner(myObj);
			
			while(myReader.hasNextLine()) {
				//read
				firstName = myReader.next();
				lastName = myReader.next();
				age = myReader.nextInt();
				
				//add person to list
				students.add(new Person(firstName, lastName, age));
				
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
