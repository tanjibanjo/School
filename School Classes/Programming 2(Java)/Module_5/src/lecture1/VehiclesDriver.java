//************************************************************************
// Author: Lane Pollock
// Date: 
// Language: Java
// Assignment:
// Description: program to test car/truck classes that inherit from Vehicle
//************************************************************************


package lecture1;

public class VehiclesDriver {

	public static void main(String[] args) {
		// local variables
		Car myCar = new Car(120, 50, 4);
		Truck myTruck = new Truck(100, 70, 2000);
		
		//use the car methods
		myCar.startEngine();
		myCar.honk();
		
		//truck methods
		myTruck.startEngine();
		myTruck.unload();

	}

}
