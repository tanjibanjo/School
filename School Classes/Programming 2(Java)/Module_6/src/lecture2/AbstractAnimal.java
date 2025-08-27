package lecture2;

public abstract class AbstractAnimal {
	//instance variables
	protected String name;
	
	//constructor
	public AbstractAnimal( String name) {
		this.name = name;
	}
	
	//abstract methods
	public abstract void makeSound(); //abstract methods have no implementation
	
	//class methods
	public void eat() {
		System.out.println(name + " is eating.");
	}
}
