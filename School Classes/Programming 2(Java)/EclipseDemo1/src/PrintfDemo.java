//************************************************************************
// Author: Scott Raymond
// Date: 29 Aug 2024
// Language: Java
// Assignment:JavaDemo1
// Description: Demo of using Java for simple output using printf
//************************************************************************

public class PrintfDemo {

	public static void main(String[] args) {
		// declare local variables
		String name = "John";
		int age = 25;
		double score = 85.5;
		
		//using %s
		System.out.printf("Name: %s\n", name);
		//using %d
		System.out.printf("Age: %d\n", age);
		//using %f
		System.out.printf("Score: %.2f\n", score);
		//using multiple flags
		System.out.printf("Student: %s, Age: %d, Score: %.2f\n", 
							name, age, score);
		
		//left justify 10 char wide
		System.out.printf("Name: %-10s Age: %d\n",name, age);
		
		//display score with '+' sign
		System.out.printf("Score with sign: %+.3f\n", score);
		
		//zero padding the age to have a width of 3
		System.out.printf("Zero-padded age: %03d\n", age);
		
		//display a percentage
		System.out.printf("Passing rate: %.2f%%\n", 95.5);
		
		//displaying currency
		System.out.printf("Salary: $%,.2f\n", 50000.259);

	}

}
