package lecture2;

public class InventoryDemo2Driver {

	public static void main(String[] args) {
		// inventory item
		InventoryItem item = new InventoryItem("Wrench", 20);
		//pass object to DisplayItem method
		System.out.println("The contents of item are: ");
		displayItem(item);
		
		//create another item
		InventoryItem item2 = new InventoryItem("Wrench", 20);
		//display
		System.out.println("The contents of item2 are:");
		displayItem(item2);
		
		//pass object to change obj method
		changeItem(item2);
		//display
		displayItem(item2);
	}//end main
	
	//METHOD DEFINITIONS
	public static void displayItem(InventoryItem pItem) {
		System.out.println("Description: " + pItem.getDescription());
		System.out.println("Units: " + pItem.getUnits());
	}
	
	//method that takes obj and changes its contents
	public static void changeItem(InventoryItem pItem) {
		pItem.setDescription("Hammer");
		pItem.setUnits(5);
	}

}
