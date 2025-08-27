//************************************************************************
// Author: Lane Pollock
// Date: 30 Oct 2024
// Language: Java
// Assignment: Lab 5.2
// Description: Driver class to demonstrate the different Animal 
//	subclasses and their unique behaviors and attributes
//************************************************************************


package lab2;

public class ZooDriver {

	public static void main(String[] args) {
		//make some instances of animals
		Cat myCat = new Cat("Tanji", 2, "Orange", "Tabby", 8);
		Monkey myMonkey = new Monkey("Randy", 5, "Brown", "Rainforest");
		Shark myShark = new Shark("Bruce", 15, "Black", "Saltwater");
		
		//now call some of their functions
		
		//cat
		myCat.eat();
		myCat.sleep();
		myCat.meow();
		System.out.println();
		myCat.displayInfo();
		
		//monkey
		myMonkey.eat();
		myMonkey.interact();
		myMonkey.sleep();
		System.out.println();
		myMonkey.displayInfo();
		
		//shark
		myShark.eat();
		myShark.sleep();
		System.out.println();
		myShark.displayInfo();

	}

}
