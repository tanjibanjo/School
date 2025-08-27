//************************************************************************
// Author: Lane Pollock
// Date: 2 Dec 2024
// Language: Java
// Assignment: Lab 1: Game Character Lab
// Description: Driver class that demonstrates Character and subclasses
//  as well as SpecialAbility interface
//************************************************************************


package lab1;

public class GameCharacterDriver {
	public static void main(String[] args) {
	//local variables
	Warrior warrior = new Warrior("Liam", 5, 100, 80);
	Mage mage = new Mage("Tanji", 2, 70, 250);
	
	//demonstrate the warrior abilities
	warrior.attack();
	warrior.defend();
	warrior.useAbility();
	
	System.out.println();

	//demonstrate mage abilities
	mage.attack();
	mage.defend();
	mage.useAbility();
	}
}
