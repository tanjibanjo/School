//************************************************************************
// Author: Lane Pollock
// Date: 23 Oct 2024
// Language: Java
// Assignment: CLO 5/6
// Description: Contacts - use parallel arrays to manage list of 5 sample
//  contacts - xt credit for sorting arrays
//************************************************************************


package clo;

import java.util.Scanner;

public class Contacts {

	public static void main(String[] args) {
		//local variables 
		int choice = -1;
		String name;
		Scanner in = new Scanner(System.in);
		
		//contact data points, populated w sample data for 5 contacts
		String[] firstNames = {"Lane", "John", "Paula", "Wendi", 
							   "Randy"};
		String[] lastNames = {"Pollock", "Williams", "Thompson", 
						      "Pollock", "Flores"};
		String[] emails = {"lpollock@student.alamo.edu", "jp@gmail.com",
							"pthompson@yahoo.com", "WR@satx.rr.com",
							"randyflowers@gmail.com"};
		String[] numbers = {"210-823-8553", "210-123-4567", 
							"210-865-4676", "543-210-5436", 
							"343-596-8903"};
		
		//sort contacts
		sortContacts(firstNames, lastNames, emails, numbers);
		
		//display menu
		printMenu();
		
		do {
			System.out.print("Enter Choice: ");
			//get choice from user
			choice = in.nextInt();
			in.nextLine(); //clear buffer
			
			//perform switch on choice
			switch(choice) {
			case 1: //show all contacts
				showContacts(firstNames, lastNames, emails, numbers);
				break; 
			case 2: //search by first name
				System.out.print("Enter first name to search for: ");
				name = in.nextLine();
				//search
				searchByFirstName(name, firstNames, lastNames, emails, 
								  numbers);
				break;
			case 3: //search by last name
				System.out.print("Enter last name to search for: ");
				name = in.nextLine();
				//search
				searchByLastName(name, firstNames, lastNames, emails,
								 numbers);
				break;
			case 4: //quit
				System.out.println("Goodbye.");
				break;
			default:
				System.out.println("Invalid choice, try again.");
				
			}
		} while(choice != 4);
		
		in.close(); //close scanner
		
	}//end main
	
	//METHODS
	
	//method to print menu
	public static void printMenu() {
		//local variables
		String menu = "";
		
		menu += "--------------------------------------\n"
			  + "             Contact List\n"
			  + "--------------------------------------\n"
			  + "1 - Show All Contacts\n"
			  + "2 - Search Contacts by First Name\n"
			  + "3 - Search Contacts by Last Name\n"
			  + "4 - Quit Program\n";
		
		System.out.println(menu);
		System.out.println();
		
	}
	
	//method to show all contacts
	public static void showContacts(String[] fNames, String[] lNames, 
					                String[] emails, String[] numbers) {
		System.out.println();
		
		//header
		System.out.printf("%-15s%-15s%-30s%15s\n", "First Name", 
				"Last Name", "Email Addresse", "Phone Number");
		System.out.println("---------------------------------------"
				+ "---------------------------------------");
		
		//loop through parallel arrays to display info
		//while less than array length
		for(int i = 0; i < fNames.length; i++) {
			System.out.printf("%-15s%-15s%-30s%15s\n", fNames[i], 
							   lNames[i], emails[i], numbers[i]);
		}//end for
		System.out.println();
	}
	
	//method that takes a String for name and searches for that name
	// returning all data points for name if found
	public static void searchByFirstName(String name, String[] fNames,
				    String[] lNames, String[] emails, String[] numbers) {
		//local variables
		boolean found = false;
		
		//loop through the array to search for name
		for(int i = 0; i < fNames.length; i++) {
			if(fNames[i].equals(name) ) { //name is found
				found = true;
				System.out.printf("%-15s%-15s%-30s%15s\n", 
						fNames[i], lNames[i], 
						emails[i], numbers[i]);
			}
		}//end for
		
		//display results
		if(!found) //no matches
			System.out.println("First Name Not Found.");
		
		System.out.println();
	}
	
	//method that takes a last name and searches contacts
	public static void searchByLastName(String name, String[] fNames,
				    String[] lNames, String[] emails, String[] numbers) {
		//local variables
		boolean found = false;
		
		//loop through last names to search
		for(int i = 0; i < lNames.length; i++) {
			if(lNames[i].equals(name) ) { //name found
				found = true;
				System.out.printf("%-15s%-15s%-30s%15s\n", 
						fNames[i], lNames[i], 
						emails[i], numbers[i]);
			}
		} //end for
		
		//now display results
		if(!found) //no matches found
			System.out.println("Last Name Not Found.");
		
		System.out.println();
	}
	
	//method to sort an array by first name and cascade changes to 
	//parallel arrays
	public static void sortContacts(String[] fNames, String[] lNames, 
			String[] emails, String[] numbers) {
		
		int startScan, index, minIndex, minValue;
		String minString, temp;
		//looping through the first values putting the next smallest in the 
		//next index
		for(startScan = 0; startScan < (fNames.length - 1); startScan++) {
			minIndex = startScan;
			minValue = fNames[startScan].charAt(0);
			minString = fNames[startScan];
			
			//looping through the remaining values
			for(index = (startScan + 1); index < fNames.length; index++) {
				//check if the next value is smaller than the previous and 
				//save the smallest (value and index)
				if(fNames[index].charAt(0) < minValue) {
					minValue = fNames[index].charAt(0);
					minString = fNames[index];
					minIndex = index;
				}
			}//end inner for loop
			
			//swap the values for first names
			fNames[minIndex] = fNames[startScan];
			fNames[startScan] = minString;
			//last names
			temp = lNames[minIndex];
			lNames[minIndex] = lNames[startScan];
			lNames[startScan] = temp;
			//emails
			temp = emails[minIndex];
			emails[minIndex] = emails[startScan];
			emails[startScan] = temp;
			//phone numbers
			temp = numbers[minIndex];
			numbers[minIndex] = numbers[startScan];
			numbers[startScan] = temp;
			
		}//end outer for loop
	}
		

}
