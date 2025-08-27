//abstract class to demonstrate the template method

package lecture3;

public abstract class HouseBuilder {
	//template
	public final void buildHouse() {
		buildFoundation();
		buildStructure();
		addRoof();
		addWalls();
		if(hasGarden())
			addGarden();
		furnishHouse();
	}
	
	protected abstract void buildFoundation();
	protected abstract void buildStructure();
	protected abstract void addRoof();
	protected abstract void addWalls();
	protected abstract void furnishHouse();
	protected void addGarden() {
		System.out.println("Adding a beatiful garden to the yard.");
	}
	protected boolean hasGarden() {
		return true;
	}
	
	

}
