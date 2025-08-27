//************************************************************************
// Author: Lane Pollock
// Date: 2 Dec 2024
// Language: Java
// Assignment: Lab 1: Game Character Lab
// Description: Abstract character class to serve as superclass for types
//  of characters in the game
//************************************************************************


package lab1;

public abstract class Character {
	//instance variables
	private String name;
	private int    level,
				   health;
	
	//constructors
	public Character() {
		this.name = "none";
		this.level = 0;
		this.health = 0;
	}
	
	public Character(String name, int level, int health) {
		this.name = name;
		this.level = level;
		this.health = health;
	}
	
	//getters / setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	//abstract methods
	public abstract void attack();
	
	public abstract void defend();
	

}
