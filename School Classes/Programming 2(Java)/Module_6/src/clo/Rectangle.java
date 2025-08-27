//************************************************************************
// Author: Lane Pollock
// Date: 14 Nov 2024
// Language: Java
// Assignment: CLO - Shape Class
// Description: Rectangle class to implement abstract Shape class
//************************************************************************


package clo;

public class Rectangle extends Shape{
	//instance variables
	private int side1;
	private int side2;
	
	//constructor
	public Rectangle() {
		super();
		this.side1 = 0;
		this.side2 = 0;
	}
	
	public Rectangle(String color, int side1, int side2) {
		super(color);
		this.side1 = side1;
		this.side2 = side2;
	}
	
	//implement abstract methods
	
	//method to return perimeter
	@Override
	public double perimeter() {
		return (side1 * 2) + (side2 * 2);
	}
	
	//method to return area
	@Override
	public double area() {
		return side1 * side2;
	}
	
	//method to print info
	@Override
	public void printShapeInfo() {
		System.out.println("Rectangle color: " + getColor()
					+ "\nSide 1: " + side1 + "\nSide 2: " + side2);
	}

}
