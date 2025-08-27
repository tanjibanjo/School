//************************************************************************
// Author: Lane Pollock
// Date: 
// Language: Java
// Assignment:
// Description: zoo class represents zoo, uses animals from a different package
//************************************************************************


package zoo;

//import lecture2.Animal; //import in classes we want to use
import lecture2.Dog;	//package.class nomenclature

public class AnimalDriver {

	public static void main(String[] args) {
		// instance variales
		//Animal animal = new Animal(); - commented out bc its not used but we could 
		Dog myDog = new Dog("Rex");
		
		//animal.makeSound(); will not work because it is protected, and this is neither in the same package or a subclass
		//same with myDog.makeSound(); or myDog.name;
		
		myDog.bark(); //this works because this method is public, and the Dog class can access the makeSound from parent

	}

}
