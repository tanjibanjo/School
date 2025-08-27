//************************************************************************
// Author: Lane Pollock
// Date: 14 Nov 2024
// Language: Java
// Assignment: CLO - Shape Class
// Description: Triangle class to implement abstract Shape class
//************************************************************************


package clo;

public class Triangle extends Shape{
	//instance variables
	private int side1; //hypotenuse
	private int side2; //base or height
	private int side3; //base or height
	
	//constructors
	public Triangle() {
		super();
		this.side1 = 0;
		this.side2 = 0;
		this.side3 = 0;
	}
	
	public Triangle(String color, int side1, int side2, int side3) {
		super(color);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//implement abstract methods
	
	//method returns perimeter
	@Override
	public double perimeter() {
		return side1 + side2 + side3;
	}
	
	//method returns area
	@Override
	public double area() {
		return (double)side2 * side3 / 2;
	}
	
	//method prints shape information
	@Override
	public void printShapeInfo() {
		System.out.println("Triangle color: " + getColor() + "\nSide 1: "
				+ side1 + "\nSide 2: " + side2 + "\nSide 3: " + side3);
	}

}
