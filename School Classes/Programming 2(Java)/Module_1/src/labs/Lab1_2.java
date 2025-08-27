//************************************************************************
// Author: Lane Pollock
// Date: 3 Sep 2024
// Language: Java
// Assignment: Lab 1.2
// Description: Create a program that takes user input and caluclates it
//	            into MPG, then outputs to user in nice format
//************************************************************************

package labs;

//scanner
import java.util.Scanner;

public class Lab1_2 {
	public static void main(String[] args) {
		//local variables
		int miles;
		double fuel, mpg;
		//new object of scanner
		Scanner scanner = new Scanner(System.in);
		
		//prompt user for miles driven and fuel used
		System.out.print("Enter the miles driven: ");
		miles = scanner.nextInt();
		
		System.out.print("Enter the fuel used in gallons: ");
		fuel = scanner.nextDouble();
		
		//close scanner
		scanner.close();
		
		//calculate the mpg
		mpg = miles / fuel;
		
		//output the mpg
		System.out.printf("\nMiles Driven: %.2f\nFuel Used: %.2f\nMiles"
						+ " per Gallon: %.2f", (double)miles, fuel, mpg);
		
	}

}
