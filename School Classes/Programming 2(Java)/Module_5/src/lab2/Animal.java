//************************************************************************
// Author: Lane Pollock
// Date: 30 Oct 2024
// Language: Java
// Assignment: Lab 5.2
// Description: Animal class to be a base class for our zoo animals
//************************************************************************


package lab2;

public class Animal {
	//instance variables
	private String name, color;
	private int    age;
	
	//constructors
	public Animal() {
		this.name = "unknown";
		this.age = -1;
		this.color = "unknown";
	}
	
	public Animal(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	//getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//methods
	//method for animal eating
	public void eat() {
		System.out.println("The animal eats.");
	}
	//method for animal sleeping
	public void sleep() {
		System.out.println("The animal sleeps.");
	}
	
	//print info method
	public void displayInfo() {
		System.out.println("Name: " + name + "\nAge: " + age
							+ "\nColor: " + color);
	}

}
