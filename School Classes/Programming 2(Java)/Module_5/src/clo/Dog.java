//************************************************************************
// Author: Lane Pollock
// Date: 30 Oct 2024
// Language: Java
// Assignment: CLO - Animal Lab
// Description: Dog class that inherits from Animal
//************************************************************************


package clo;

import java.util.Objects;

public class Dog extends Animal{
	//constructor
	public Dog(String name) {
		super(name);
	}
	
	//override makeSound()
	@Override 
	public void makeSound() {
		System.out.println("Woof Woof");
	}
	
	//toString
	@Override
	public String toString() {
		return "Name: " + getName()
			+ "\nSound: Woof Woof";
		
	}
	
	//equals
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass())
			return false;
		Dog dog = (Dog)o;
		return Objects.equals(this.getName(), dog.getName());
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return Objects.hash(getName());
	}

}
