package lecture2;

public class VehicleDriver {
	public static void main(String[] args) {
		//objects
		Vehicle myCar = new Car();
		Vehicle myTruck = new Truck();
		
		myCar.start();
		
		System.out.println(myCar.fuelEfficiency());
		myCar.stop();
		
		myTruck.start();
		System.out.println(myTruck.fuelEfficiency());
		myTruck.stop();

	}
}
