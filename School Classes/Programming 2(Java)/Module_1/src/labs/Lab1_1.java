//************************************************************************
// Author: Lane Pollock
// Date: 3 Sep 2024
// Language: Java
// Assignment: Lab 1.1
// Description: Create a program that uses Heron's formula and user input 
//	            to calculate area and perimeter of a triangle
//************************************************************************

package labs;

//scanner 
import java.util.Scanner;

public class Lab1_1 {
	public static void main(String[] args) {
		//local variables
		double side1, side2, side3, area, perimeter, s;
		String name;
		Scanner scanner = new Scanner(System.in); //new object of scanner
		
		//prompt for name
		System.out.print("Enter your name: ");
		name = scanner.nextLine();
		
		//prompt for sides of triangle
		System.out.print("Enter value for side 1: ");
		side1 = scanner.nextDouble();
		System.out.print("Enter value for side 2: ");
		side2 = scanner.nextDouble();
		System.out.print("Enter value for side 3: ");
		side3 = scanner.nextDouble();
		
		//close the scanner
		scanner.close();
		
		//calculate perimeter
		perimeter = (side1 + side2 + side3);
		
		//use heron's formula to calulate area
		s = (.5 * perimeter);
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		//print to user
		System.out.printf("\nName: %s\nThe Area of Triangle: "
						  + "%.2f\nThe Perimeter of Triangle: %.2f", 
						  name, area, perimeter);
		
	}

}
