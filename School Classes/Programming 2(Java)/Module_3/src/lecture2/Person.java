//Lane pollock
//24 Sep 2024
//JAVA
//This program demonstrates toString() method

package lecture2;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Person{name= " + name + ", age= " + age + "}"; //overriding the toString() function.
	}

}
