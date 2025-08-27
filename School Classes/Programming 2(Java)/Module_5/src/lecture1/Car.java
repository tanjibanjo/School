//************************************************************************
// Author: Lane Pollock
// Date: 
// Language: Java
// Assignment:
// Description: car class that inherits from vehicle
//************************************************************************


package lecture1;

public class Car extends Vehicle{ //use 'extends' for inheritance to signify parent class
	//instance variables
	private int numberOfDoors;
	
	//constructors
	public Car(int speed, int fuel, int numberOfDoors) {
		super(speed, fuel); //use 'super' to access the parent class, Vehicle - using parent class constructors!
		this.numberOfDoors = numberOfDoors;
	}
	//getters
	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	//methods
	public void honk() {
		System.out.println("Car Honking lol");
	}
}
