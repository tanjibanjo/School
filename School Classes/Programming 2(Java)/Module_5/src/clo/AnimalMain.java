//************************************************************************
// Author: Lane Pollock
// Date: 30 Oct 2024
// Language: Java
// Assignment: CLO - Animal Lab
// Description: Driver class to demonstrate the cat and dog classes
//************************************************************************


package clo;

import java.util.ArrayList;
import java.util.Objects;

public class AnimalMain {

	public static void main(String[] args) {
		//local variables
		
		//arraylist
		ArrayList<Cat> catList = new ArrayList<Cat>();
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		//make some instances of cats and dogs
		Cat cat1 = new Cat("Tanji");
		Cat cat2 = new Cat("Tanji");
		Dog dog1 = new Dog("Sonny");
		Dog dog2 = new Dog("Bella");
		
		//populate array lists
		catList.add(cat1);
		catList.add(cat2);
		dogList.add(dog1);
		dogList.add(dog2);
	
		
		//print the hashcodes of each instance
		System.out.println("Printing the hash codes for animals:");
		System.out.println("Cat 1: " + cat1.hashCode());
		System.out.println("Cat 2: " + cat2.hashCode());
		System.out.println("Dog 1: " + dog1.hashCode());
		System.out.println("Dog 1: " + dog2.hashCode());
		
		//now use equals method to see if they are equals
		System.out.println("\nComparing objects with equals:");
		if(Objects.equals(cat1, cat2))
			System.out.println("The cats are equal");
		else //not equal
			System.out.println("The cats are not equal.");
		
		if(Objects.equals(dog1, dog2))
			System.out.println("The dogs are equal");
		else //not equal
			System.out.println("The dogs are not equal.");
		
		System.out.println();
		
		//loop through the lists to print info with toString
		for(Cat cat : catList)
			System.out.println(cat);
		for(Dog dog : dogList)
			System.out.println(dog);


	}

}
