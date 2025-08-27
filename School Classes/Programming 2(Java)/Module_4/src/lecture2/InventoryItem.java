//Lane Pollock
//java
//class for an item in an inventory

package lecture2;

public class InventoryItem {
	//instance variables
	private String description;
	private int units;
	
	//constructors
	public InventoryItem() {
		this.description = "";
		this.units = 0;
	}
	
	//1 parameter
	public InventoryItem(String desc) {
		this.description = desc;
		this.units = 0;
	}
	
	//2 parameter
	public InventoryItem(String desc, int units) {
		this.description = desc;
		this.units = units;
	}
	
	//getters & setters

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}
}//end class
