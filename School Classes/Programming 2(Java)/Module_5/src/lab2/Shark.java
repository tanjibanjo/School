//************************************************************************
// Author: Lane Pollock
// Date: 30 Oct 2024
// Language: Java
// Assignment: Lab 5.2
// Description: Shark class that is a subclass of Animal
//************************************************************************


package lab2;

public class Shark extends Animal{
	//instance variables
	private String typeWater;
	
	//constructors
	public Shark() {
		super();
		this.typeWater = "unknown";
	}
	
	//getters and setters
	
	public Shark(String name, int age, String color, String typeWater) {
		super(name, age, color);
		this.typeWater = typeWater;
	}

	public String getTypeWater() {
		return typeWater;
	}

	public void setTypeWater(String typeWater) {
		this.typeWater = typeWater;
	}
	
	//methods
	public void swim() {
		System.out.println("The shark swims menacingly.");
	}
	
	//override methods
	@Override
	public void eat() {
		System.out.println("The shark finds prey and eats.");
	}
	
	@Override
	public void sleep() {
		System.out.println("The shark sleeps while floating along.");
	}
	
	//override displayInfo for shark details
	@Override public void displayInfo() {
		System.out.println("Shark Details\n");
		super.displayInfo();
		System.out.println("\tType of water: " + typeWater);
		System.out.println("--------------------------------");
	}

}
