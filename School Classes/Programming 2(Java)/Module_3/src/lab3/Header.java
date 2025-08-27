//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: Lab 3.3 - Parking Permit
// Description: Static header class that prints welcome message
//************************************************************************


package lab3;

public class Header {
	public static void printHeader() {
		//local var
		String str = "";
		str += "|-------------------------------------------|\n";
		str += "|Welcome to the Alamo College Parking System|\n";
		str += "|-------------------------------------------|\n\n";
	
		System.out.print(str);
	}

}
