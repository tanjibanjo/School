//************************************************************************
// Author: Lane Pollock
// Date: 14 Nov 2024
// Language: Java
// Assignment: Lab 2: HouseBuilder 
// Description: StoneHouseBuilder class that extends house builder
//  and defines abstract methods for a stone house
//************************************************************************


package lab2;

public class StoneHouseBuilder extends HouseBuilder{
	//define abstract methods
	protected void buildFoundation() {
		System.out.println("Building stone foundation.");
	}
	
	protected void buildStructure() {
		System.out.println("Building stone structure.");
	}
	
	protected void addRoof() {
		System.out.println("Adding roof to the stone house.");
	}
	
	protected void addWalls() {
		System.out.println("Adding stone walls to the house.");
	}
	
	protected void furnishHouse() {
		System.out.println("Furnishing the stone house.");
	}

}
