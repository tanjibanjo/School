package lecture3;

public abstract class CaffeineBeverage {

	//template method
	public final void prepareRecipe() {
		boilWater();
		brew();
		poorInCup();
		addCondiments();
	}
	
	public void boilWater() {
		System.out.println("Boiling water");
	}
	
	public void poorInCup() {
		System.out.println("Pooring into cup");
	}
	
	//abstract methods for subclasses
	public abstract void brew();
	public abstract void addCondiments();
	
}
