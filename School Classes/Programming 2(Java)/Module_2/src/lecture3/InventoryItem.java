//************************************************************************
// Author: Lane Pollock
// Date: 10 Sep 2024
// Language: Java
// Assignment: inventoryItem
// Description: blueprint for an inventory item in store
//************************************************************************

package lecture3;

public class InventoryItem {
	//declare instance variables
	int itemNumber, quantity;
	String description;
	double cost, salePrice;
	//note - since we don't have access modifiers, they all have default access
	
	//constructors 
	
	public InventoryItem() {
		this(0, "unknown", 0, 0.0, 0.0);
	}
	
	public InventoryItem(int itemNumber) {
		this(itemNumber, "unknown", 0, 0.0, 0.0);
	}
	
	public InventoryItem(int itemNumber, String desc) {
		this(itemNumber, desc, 0, 0.0, 0.0);
	}
	
	public InventoryItem(int itemNumber, String desc, int qty) {
		this(itemNumber, desc, qty, 0.0, 0.0);
	}
	
	public InventoryItem(int itemNumber, String desc, int qty, double cost) {
		this( itemNumber, desc, qty, cost, 0.0);
	}
	
	public InventoryItem(int itemNumber, String desc, int qty, double cost,
						 double price) {
		this.itemNumber = itemNumber;
		this.description = desc; 
		if(qty > 0)
			this.quantity = qty;
		else
			this.quantity = 0;
		this.cost = (cost > 0) ? cost : 0.0;
		this.salePrice = (price > 0) ? price : 0.0;
	}
	

}
