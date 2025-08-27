//************************************************************************
// Author: Lane Pollock
// Date: 
// Language: Java
// Assignment:
// Description: truck class that inherits from vehicle
//************************************************************************


package lecture1;

public class Truck extends Vehicle{ //'extends' from parent class
	//instance variables
	private int payloadCapacity;
	
	//constructor
	public Truck(int speed, int fuel, int payloadCapacity) {
		super(speed, fuel); //using parent constructor
		this.payloadCapacity = payloadCapacity;
	}
	
	//getters
	public int getPayloadCapacity() {
		return payloadCapacity;
	}
	
	//methods
	public void unload() {
		System.out.println("Unloading Truck.");
	}

}
