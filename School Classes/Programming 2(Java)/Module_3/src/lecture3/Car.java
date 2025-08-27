//class to represent a car
//java

package lecture3;

public class Car {
	//instance var
	private Engine engine;
	
	//construct the car
	public Car() {
		this.engine = new Engine(); //call the engine initialization in the constructor
	}
	
	//methods
	void start() {
		engine.start();
		System.out.println("Car Started.");
	}
	
	void stop() {
		engine.stop();
		System.out.println("Car Stopped.");
	}

}
