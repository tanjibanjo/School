//************************************************************************
// Author: Lane Pollock
// Date: 
// Language: Java
// Assignment: 
// Description: class to hold methods and vars for a vehicle
//************************************************************************


package lecture1;

public class Vehicle {
	//instance variables
	private int speed, fuel;
	
	//constructors
	public Vehicle(int speed, int fuel) {
		this.speed = speed;
		this.fuel = fuel;
		}
	
	//getters
	public int getSpeed() {
		return speed;
	}
	
	public int getFuel() {
		return fuel;
	}
	
	//methods
	public void startEngine() {
		System.out.println("Engine Started.");
	}

}
