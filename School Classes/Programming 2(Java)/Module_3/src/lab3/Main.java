//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: Lab 3.3 - Parking Permit
// Description: Driver class for lab3 Parking Permit system
//************************************************************************


package lab3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// local variables
		String fName, lName, make, model, year, street, state, city, zip;
		String resultHeader;
		//instances
		Scanner in = new Scanner(System.in);
		ParkingPermit permit;
		Student student;
		Address address;
		
		//display header
		Header.printHeader();
		
		//prompt for values 
		System.out.println("Enter Information for Student.");
		System.out.print("First Name: ");
		fName = in.nextLine();
		System.out.print("Last Name: ");
		lName = in.nextLine();
		System.out.print("Street Address: ");
		street = in.nextLine();
		System.out.print("City: ");
		city = in.nextLine();
		System.out.print("State: ");
		state = in.nextLine();
		System.out.print("ZIP: ");
		zip = in.nextLine();
		System.out.print("Car Make: ");
		make = in.nextLine();
		System.out.print("Car Model: ");
		model = in.nextLine();
		System.out.print("Car Year: ");
		year = in.nextLine();
		
		//close scanner
		in.close();
		
		//instantiate objects
		permit = new ParkingPermit(make, model, year);
		address = new Address(city, state, street, zip);
		student = new Student(fName, lName, address, permit);
		
		//print info
		System.out.println();
		System.out.println();
		resultHeader =  "|---------------------|\n";
		resultHeader += "| Student Information |\n";
		resultHeader += "|---------------------|\n";
		
		
		System.out.printf("%s%s\n%s\n%s", resultHeader, 
							student, address, permit);

	}

}
