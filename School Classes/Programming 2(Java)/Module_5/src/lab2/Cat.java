//************************************************************************
// Author: Lane Pollock
// Date: 30 Oct 2024
// Language: Java
// Assignment: Lab 5.2 - Zoo
// Description: Cat class that is a subclass of Animal
//************************************************************************


package lab2;

public class Cat extends Animal{
	//instance variables
	private int    numberOfLives;
	private String type;
	
	//constructors
	public Cat() {
		super();
		this.numberOfLives = -1;
		this.type = "unknown";
	}
	
	public Cat(String name, int age, String color, String type, 
				int numberOfLives) {
		super(name, age, color);
		this.type = type;
		this.numberOfLives = numberOfLives;
	}
	
	//getters and setters

	public int getNumberOfLives() {
		return numberOfLives;
	}

	public void setNumberOfLives(int numberOfLives) {
		this.numberOfLives = numberOfLives;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	//methods
	public void meow() {
		System.out.println(getName() + " meows.");
	}
	
	//override methods
	
	@Override
	public void eat() {
		System.out.println("The cat catches a fish and eats.");
	}
	
	@Override
	public void sleep() {
		System.out.println("Cat purrs and nods off.");
	}
	
	//override the displayInfo method to add cat attributes
	@Override
	public void displayInfo() {
		System.out.println("Cat Details\n");
		super.displayInfo();
		System.out.println("\tType of cat: " + type + 
				"\n\tNumber of Lives: " + numberOfLives);
		System.out.println("--------------------------------");
	}


}
