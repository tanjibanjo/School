//inherits from abstract animal class

package lecture2;

public class Dog extends AbstractAnimal{
	//constructors
	public Dog(String name) {
		super(name);
	}
	
	//overrides for abstract variables
	@Override public void makeSound() {
		System.out.println(name +  " barks.");
	}

}
