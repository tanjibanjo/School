//Lane Pollock
//java
//program that runs with inventoryitem and makes an array of objects

package lecture2;

import java.util.Scanner;

public class InventoryItemDriver {

	public static void main(String[] args) {
		// local variables
		final int NUM_ITEMS = 3;
		//inventoryArray
		InventoryItem[] inventory = new InventoryItem[NUM_ITEMS];
		
		//call get items method to get data from each element
		getItems(inventory);
		
		System.out.println("You entered the following: ");
		//loop through array to display items
		for(int i = 0; i < inventory.length; i++) {
			System.out.println("Item " + (i+1));
			System.out.println("Description " + inventory[i].getDescription() );
			System.out.println("Units " + inventory[i].getUnits() );
			
		}

	}//end main
	
	//method to get an inventory item and have user enter values
	private static void getItems(InventoryItem[] array) {
		//local variables
		String description;
		int units;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter data for " + array.length + " inventory items.");
		
		//loop through the array getting data from user
		for(int i = 0; i < array.length; i++) {
			//get the description and number of units from user
			System.out.print("Enter description for item " + (i + 1) + ":");
			description = in.nextLine();
			System.out.print("Enter units for item " + (i + 1) + ":");
			units = in.nextInt();
			
			//consume remaining newline
			in.nextLine();
			
			//initialize the array index
			array[i] = new InventoryItem(description, units);
			
			System.out.println();
		}
		in.close();
	}

}//end class
