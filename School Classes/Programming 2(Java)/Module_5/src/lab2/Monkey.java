//************************************************************************
// Author: Lane Pollock
// Date: 30 Oct 2024
// Language: Java
// Assignment: Lab 5.2
// Description: Monkey class that is a subclass of Animal
//************************************************************************


package lab2;

public class Monkey extends Animal{
	//instance variables
	private String home;
	
	//constructors
	public Monkey() {
		super();
		this.home = "unkown";
	}
	
	public Monkey(String name, int age, String color, String home) {
		super(name, age, color);
		this.home = home;
	}
	
	//getters and setters
	
	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}
	
	//methods
	//method for an interaction with/from a monkey
	public void interact() {
		System.out.println("The monkey hurls a bit of poop your way.");
	}
	
	//overrides
	@Override
	public void eat() {
		System.out.println("The monkey grabs a banana and begins to "
				+ "chow down.");
	}
	
	@Override
	public void sleep() {
		System.out.println("The monkey runs out of energy and falls "
				+ "asleep in the trees.");
	}
	
	//override displayInfo method to add monkey attributes
	@Override
	public void displayInfo() {
		System.out.println("Monkey Details\n");
		super.displayInfo();
		System.out.println("\tHome: " + home);
		System.out.println("--------------------------------");
	}

}
