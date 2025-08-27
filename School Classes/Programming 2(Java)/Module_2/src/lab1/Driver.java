//************************************************************************
// Author: Lane Pollock
// Date: 13 Sep 2024
// Language: Java
// Assignment: Lab 2.1 - Pet
// Description: Create a class, Pet, and driver class to allow user to make
//	instances of pets and output nicely
//************************************************************************


package lab1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		//instances of Pet
		Pet defaultPet = new Pet();
		Pet myPet;
		
		// local variables for user input
		String name, petType, sound;
		Scanner in = new Scanner(System.in);
		
		
		//use setters to update default and print to screen
		defaultPet.setName("Simba");
		defaultPet.setPetType("Cat");
		defaultPet.setSound("Roar");
		
		defaultPet.printInfo();
		
		//prompt user for pet attributes
		System.out.print("Enter the pet name: ");
		name = in.nextLine();
		
		System.out.print("Great, now enter type of pet: ");
		petType = in.nextLine();
		
		System.out.print("Lastly, enter sound pet makes: ");
		sound = in.nextLine();
		System.out.println();
		
		//close scanner
		in.close();
		
		//use input to create new instance of Pet
		myPet = new Pet(name, petType, sound);
		
		//print pet info
		myPet.printInfo();

	}

}
