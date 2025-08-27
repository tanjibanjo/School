//Lane Pollock
//24 Sep 2024
//InventoryItem class to demo passing objects as arguments to methods
//JAVA

package lecture2;

public class InventoryItem {
	//instance variables
	private String description;
	private int units;
	
	//constructors 
	//no arg
	InventoryItem(){
		description = "";
		units = 0;
	}
	
	//string arg
	InventoryItem(String desc){
		description = desc;
		units = 0;
	}
	
	//2 arg
	InventoryItem(String desc, int u){
		description = desc;
		units = u;
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
