//************************************************************************
// Author: Lane Pollock
// Date: 30 Oct 2024
// Language: Java
// Assignment: CLO - Animal Lab
// Description: Cat class to inherit from Animal
//************************************************************************


package clo;

import java.util.Objects;

public class Cat extends Animal {
	//constructor
	public Cat(String name) {
		super(name);
	}
	
	//methods
	@Override 
	public void makeSound() {
		System.out.println("Meow Meow");
	}
	
	@Override
	public String toString() {
		return "Name: " + getName()
		+ "\nSound: Meow Meow";
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass())
			return false;
		Cat cat = (Cat)o;
		return Objects.equals(this.getName(), cat.getName());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getName());
	}

}
