//************************************************************************
// Author: Lane Pollock
// Date: 3 Sep 2024
// Language: Java
// Assignment:Lecture 3
// Description: 
//************************************************************************
package Lecture3;

public class OperatorExample {

	public static void main(String[] args) {
		// declare local var
		int a = 10, b = 20, score = 65;
		boolean x = true, y = false;
		String grade;
		
		//arithmetic operators
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
		
		//relational operators
		System.out.println("a == b: " + (a == b));
		System.out.println("a != b: " + (a != b));
		System.out.println("a < b: " + (a < b));
		System.out.println("a > b: " + (a > b));
		
		//logical operators
		System.out.println("x && y: " + ( x && y));
		System.out.println("x || y: " + (x || y));
		System.out.println("!x: "+ (!x));
		System.out.println("!x && y: " + (!x && y));
		
		//ternary operator
		grade = (score > 50) ? "Pass" : "Fail";
		System.out.println(grade);
		
		//type cast
		System.out.println( (int) 3.14);
		System.out.println( (char) 65);
		
		
	}

}
