package lecture3;

public class BrickHouseBuilder extends HouseBuilder{
	//implement the abstract methods from houseBuilder
	protected void buildFoundation() {
		System.out.println("Building a brick foundation for the house.");
	}
	
	protected void buildStructure() {
		System.out.println("Building a brick structure.");
	}
	
	protected void addRoof() {
		System.out.println("Adding a roof to the brick house.");
	}
	
	protected void addWalls() {
		System.out.println("Adding brick walls to the house.");
	}
	
	protected void furnishHouse() {
		System.out.println("Furnishing the brick house.");
	}
	
	protected boolean hasGarden() {
		return false;
	}

}
