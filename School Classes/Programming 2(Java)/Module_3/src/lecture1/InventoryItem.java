//class to represent an item in inventory 

package lecture1;

public class InventoryItem {
	//instance variables
	private String description;
	private int units;
	
	//constructors
	public InventoryItem() {
		units = 0;
		description = null;
	}
	
	public InventoryItem(String desc) {
		description = desc;
		units = 0;
	}
	
	public InventoryItem(String desc, int pUnits) {
		description = desc;
		units = pUnits;
	}
	
	//getters

	public String getDescription() {
		return description;
	}

	public int getUnits() {
		return units;
	}
	
	//setters

	public void setDescription(String description) {
		this.description = description;
	}

	public void setUnits(int units) {
		this.units = units;
	}
	
	

}
