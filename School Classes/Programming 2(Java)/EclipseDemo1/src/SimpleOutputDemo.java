//************************************************************************
// Author: Scott Raymond
// Date: 29 Aug 2024
// Language: Java
// Assignment:JavaDemo1
// Description: Demo of using Java for simple output
//************************************************************************

public class SimpleOutputDemo {

	public static void main(String[] args) {
		//simple output with print and println
		System.out.print("Hello ");
		System.out.println("World!");
		
		//declare local variable
		int num = 42;
		
		//display a quote to the user
		System.out.println("The answer to everything is: " + num);
		
		//use of some escape characters
		System.out.println("This is a \"quote\".");
		System.out.println("This is a \ttab.");
		System.out.println("This is a \nnew line.");
		System.out.println("This is a backslash \\.");

	}

}
