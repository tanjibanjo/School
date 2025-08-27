//abstract class that represents concept of vehicle

package lecture2;

public abstract class Vehicle {
	//class methods
	public void start() {
		System.out.println("Vehicle Started.");
	}
	
	public void stop() {
		System.out.println("Vehicle Stopped.");
	}
	
	//abstract methods
	public abstract double fuelEfficiency();

}
