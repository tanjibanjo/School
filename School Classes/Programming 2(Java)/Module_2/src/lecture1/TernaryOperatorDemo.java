//************************************************************************
// Author: Lane Pollock
// Date: 10 Sep 2024
// Language: Java
// Assignment: StringComparison Demo
// Description: program to look at string comparison application and 
//  functions
//************************************************************************


package lecture1;

import java.util.Scanner;

public class TernaryOperatorDemo {
	public static void main(String[] args) {
		//local variables
		int myNumber;
		String message;
		Scanner keyboard = new Scanner(System.in);
		
		//get user input
		System.out.print("Please enter a number: ");
		myNumber = keyboard.nextInt();
		
		//determine if the number is even or odd
		message = (myNumber % 2 == 0) ? "The number is even." 
									  : "The number is odd.";
		
		//display the message
		System.out.println(message);
		
		//close scanner
		keyboard.close();
		
	}

}
