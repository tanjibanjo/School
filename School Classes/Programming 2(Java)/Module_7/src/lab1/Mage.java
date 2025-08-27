//************************************************************************
// Author: Lane Pollock
// Date: 2 Dec 2024
// Language: Java
// Assignment: Lab 1: Game Character Lab
// Description: Mage class to extend character abstract class 
//************************************************************************


package lab1;

public class Mage extends Character implements SpecialAbility {
	//instance variables
	private int magic;
	
	//constructors
	public Mage() {
		super();
		this.magic = 0;
	}
	
	public Mage(String name, int level, int health, int magic) {
		super(name, level, health);
		this.magic = magic;
	}
	
	//getters/setters

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}
	
	//define abstract methods
	@Override
	public void attack() {
		System.out.println("The mage casts a fireball.");
	}
	
	@Override
	public void defend() {
		System.out.println("The mage casts a shield spell.");
	}
	
	//interface implementation
	@Override
	public void useAbility() {
		System.out.println("The mage uses \'Invisibility\' to "
				+ "disappear.");
	}

}
