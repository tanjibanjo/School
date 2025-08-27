//************************************************************************
// Author: Lane Pollock
// Date: 30 Oct 2024
// Language: Java
// Assignment: CLO - Animal Lab
// Description: Animal class to be a base class for other animals
//************************************************************************

package clo;

public class Animal {
	//instance variables
	private String name;
	
	//constructor
	public Animal(String name) {
		this.name = name;
	}
	
	//methods
	public void makeSound() {
		System.out.println("Insert generic sound here");
	}
	
	//getters

	public String getName() {
		return name;
	}
	
	

}
