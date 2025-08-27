//************************************************************************
// Author: Lane Pollock
// Date: 10 Sep 2024
// Language: Java
// Assignment: StringComparison Demo
// Description: program to look at string comparison application and functions
//************************************************************************
package lecture1;

import java.util.Scanner;

public class StringComparison {
	public static void main(String[] args) {
		// local variables
		String name1, name2, name3;
		Scanner keyboard = new Scanner(System.in);
		
		//get name 1
		System.out.print("Enter a name: ");
		name1 = keyboard.nextLine();
		
		//get name 2
		System.out.print("Enter a name: ");
		name2 = keyboard.nextLine();
		
		//get name 3
		System.out.print("Enter a name: ");
		name3 = keyboard.nextLine();
				
		//check if name1 and name2 are equal
		if(name1.equals(name2) )
			System.out.println(name1 + " and " + name2 + " are the same.");
		else 
			System.out.println(name1 + " and " + name2 + " are not the same.");
		
		//check if name1 and name3 are equal
		if(name1.equals(name3) )
			System.out.println(name1 + " and " + name3 + " are the same.");
		else 
			System.out.println(name1 + " and " + name3 + " are not the same.");

		//compare names
		if(name1.compareTo(name2) < 0)
			System.out.println(name1 + " is less than " + name2);
		else if(name1.compareTo(name2) == 0)
			System.out.println(name1 + " is equal to " + name2);
		else
			System.out.println(name1 + " is greater than " + name2);
		
		keyboard.close();

	}

}
