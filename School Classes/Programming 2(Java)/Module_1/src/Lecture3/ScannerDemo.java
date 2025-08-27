package Lecture3;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String [] args) {
		//local variables
		String name;
		Scanner scanner = new Scanner(System.in);
		int age;
		double height;
		
		//prompt for input
		System.out.print("Enter your name: ");
		name = scanner.nextLine();
		
		//prompt for age
		System.out.print("Enter your age: ");
		age = scanner.nextInt();
		
		//prompt for height
		System.out.print("Enter your height in meters: ");
		height = scanner.nextDouble();
		
		//display results
		System.out.printf("Hello, %s! You are %d years old and %.2f meters tall.", name, age, height);
		
		//close the scanner
		scanner.close();
		
	}

}
