//************************************************************************
// Author: Lane Pollock
// Date: 
// Language: Java
// Assignment:
// Description: dog class that inherits from animal
//************************************************************************


package lecture2;

public class Dog extends Animal{
	//constructors
	public Dog(String name) {
		this.name = name; //can directly access the variable because it is protected, not private
	}
	
	//methods
	public void bark() {
		makeSound(); //can access directly bc protected. no 'super' needed
		System.out.println(name + " says \"woof!\"");
	}
	
	

}
