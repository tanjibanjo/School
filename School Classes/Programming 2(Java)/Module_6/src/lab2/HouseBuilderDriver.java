//************************************************************************
// Author: Lane Pollock
// Date: 14 Nov 2024
// Language: Java
// Assignment: Lab 2: House
// Description: Driver to demonstrate the new stone house builder class
//  and its implementation
//************************************************************************


package lab2;

public class HouseBuilderDriver {

	public static void main(String[] args) {
		//instances of the house builders
		HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
		HouseBuilder brickHouseBuilder = new BrickHouseBuilder();
		HouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
		
		woodenHouseBuilder.buildHouse();
		
		System.out.println();
		
		brickHouseBuilder.buildHouse();
		
		System.out.println();
		
		stoneHouseBuilder.buildHouse();

	}

}
