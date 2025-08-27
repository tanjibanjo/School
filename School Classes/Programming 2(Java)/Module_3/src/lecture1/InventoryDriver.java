//program to test the inventory item class

package lecture1;

public class InventoryDriver {
	public static void main(String[] args) {
		//local variables
		InventoryItem item1, item2, item3;
		
		//instantiate the items
		
		//item1 with default constructor and display
		item1 = new InventoryItem();
		System.out.println("Item 1:");
		System.out.println("Description: " + item1.getDescription() );
		System.out.println("Units: " + item1.getUnits() );
		System.out.println();
		
		//instantiate item2 with second constructor
		item2 = new InventoryItem("Wrench");
		System.out.println("Description: " + item2.getDescription() );
		System.out.println("Units: " + item2.getUnits() );
		System.out.println();
		
		//instantiate item 3 with last constructor
		item3 = new InventoryItem("Hammer", 20);
		System.out.println("Description: " + item3.getDescription() );
		System.out.println("Units: " + item3.getUnits() );
		System.out.println();
		
	}

}
