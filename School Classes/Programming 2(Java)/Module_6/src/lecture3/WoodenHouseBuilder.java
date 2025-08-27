package lecture3;

public class WoodenHouseBuilder extends HouseBuilder{
	//define the abstract methods of parent class
	protected void buildFoundation() {
		System.out.println("Building wooden foundation.");
	}
	
	protected void buildStructure() {
		System.out.println("Building wooden structure.");
	}
	
	protected void addRoof() {
		System.out.println("Adding roof to the wooden house.");
	}
	
	protected void addWalls() {
		System.out.println("Adding wooden walls to the house.");
	}
	
	protected void furnishHouse() {
		System.out.println("Furnishing the wooden house.");
	}

}
