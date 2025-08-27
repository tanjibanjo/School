//************************************************************************
// Author: Lane Pollock
// Date: 13 Sep 2024
// Language: Java
// Assignment: Lab 2.1 - Pet
// Description: Pet class containing attributes for pets
//************************************************************************


package lab1;

public class Pet {
	//private instance variables
	private String name, petType, sound;
	
	//constructors
	
	//default
	public Pet() {
		this("Unknown", "Unknown", "Unknown");
	}
	
	//parameterized 
	public Pet(String name, String type, String sound) {
		this.name = name;
		this.petType = type;
		this.sound = sound;
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public String getPetType() {
		return petType;
	}
	
	public String getSound() {
		return sound;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPetType(String petType) {
		this.petType = petType;
	}
	
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	//method to print pet info
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Type: " + petType);
		System.out.println("Sound: " + sound + "\n");
	}
	

}
