package lecture3;

public class HouseBuilderDriver {

	public static void main(String[] args) {
		//instances of the house builders
		HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
		HouseBuilder brickHouseBuilder = new BrickHouseBuilder();
		
		woodenHouseBuilder.buildHouse();
		
		System.out.println();
		
		brickHouseBuilder.buildHouse();

	}

}
