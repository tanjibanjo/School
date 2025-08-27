//************************************************************************
// Author: Lane Pollock
// Date: 14 Nov 2024
// Language: Java
// Assignment: CLO - Shape Class
// Description: Circle class to implement abstract Shape class
//************************************************************************


package clo;

public class Circle extends Shape{
	//instance variables
	private final double PI = 3.14159265359;
	private int radius;
	
	//constructor
	public Circle() {
		super();
		this.radius = 0;
	}
	
	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}
	
	//getters/setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//implement abstract methods
	//method to return the perimeter of the circle
	@Override
	public double perimeter() {
		return PI * radius * 2;
	}
	
	//method to return the area of circle
	@Override 
	public double area() {
		return PI * (radius * radius);
	}
	
	//method to print information
	@Override 
	public void printShapeInfo() {
		System.out.println("Circle color: " + getColor() + 
							"\nRadius: " + radius);
	}

}
