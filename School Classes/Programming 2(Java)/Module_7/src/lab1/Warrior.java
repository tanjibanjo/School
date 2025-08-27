//************************************************************************
// Author: Lane Pollock
// Date: 2 Dec 2024
// Language: Java
// Assignment: Lab 1: Game Character Lab
// Description: Warrior class to extend character abstract class 
//************************************************************************


package lab1;

public class Warrior extends Character implements SpecialAbility{
	//instance variables
	private int strength;
	
	//constructors
	public Warrior() {
		super();
		this.strength = 0;
	}
	
	public Warrior(String name, int level, int health, int strength) {
		super(name, level, health);
		this.strength = strength;
	}
	
	//getter/setter
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	//define abstract methods
	@Override
	public void attack() {
		System.out.println("The warrior slashes with his sword.");
	}
	
	@Override
	public void defend() {
		System.out.println("The warrior perries with his sword.");
	}
	
	//interface implementation
	@Override
	public void useAbility() {
		System.out.println("The warrior uses \'Berserker Rage\' "
				+ "on opponent.");
	}

}
