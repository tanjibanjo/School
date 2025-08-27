//coffee class takes from template design/parent abstract class CaffeineBeverage
//this is a concrete class because it must define the abstract methods of parent

package lecture3;

public class Coffee extends CaffeineBeverage{
	public void brew() {
		System.out.println("Dripping coffee through filter");
	}
	
	public void addCondiments() {
		System.out.println("Adding sugar and milk");
	}
}
