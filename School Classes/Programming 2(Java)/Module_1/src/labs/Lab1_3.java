//************************************************************************
// Author: Lane Pollock
// Date: 3 Sep 2024
// Language: Java
// Assignment: Lab 1.3
// Description: Create a program that takes user input for two coordinates
//	            and calulates the distance between them
//************************************************************************

package labs;

//scanner
import java.util.Scanner;

public class Lab1_3 {
	public static void main(String[] args) {
		//local variables
		int x1, x2, y1, y2;
		double xDifference, yDifference, distance;
		//object of scanner 
		Scanner scanner = new Scanner(System.in);
		
		//prompt user to enter coordinates for the points
		System.out.print("Enter the first coordinates (x,y)\nx: ");
		x1 = scanner.nextInt();
		System.out.print("y: ");
		y1 = scanner.nextInt();
		
		System.out.print("Enter the second coordinates (x,y)\nx: ");
		x2 = scanner.nextInt();
		System.out.print("y: ");
		y2 = scanner.nextInt();
		
		//close the scanner
		scanner.close();
		
		//calculate the distance
		xDifference = Math.pow((x2 - x1), 2);
		yDifference = Math.pow((y2 - y1), 2);	
		distance = Math.sqrt(xDifference + yDifference);
		
		//output
		System.out.printf("\nThe distance between points (%d, %d) and "
						+ "(%d,%d) is %.2f", x1, y1, x2, y2, distance);
		
	}

}
