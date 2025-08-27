//************************************************************************
// Author: Lane Pollock
// Date: 26 Sep 2024
// Language: Java
// Assignment: demo
// Description: Student class that represents a student entity
//************************************************************************


package lecture3;

public class Student {
	//instance variables
	String name;
	int age;
	
	//constructors
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//copy constructor
	public Student(Student og) {
		this.name = og.name;
		this.age = og.age;
	}
	
	//methods
	public String toString() {
		return "Student{Name = " + name + ", age = " + age + "}";
	}

}
