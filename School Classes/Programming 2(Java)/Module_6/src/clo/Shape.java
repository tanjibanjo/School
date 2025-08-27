//************************************************************************
// Author: Lane Pollock
// Date: 14 Nov 2024
// Language: Java
// Assignment: CLO - Shape Class
// Description: Abstract Shape class to be implemented
//************************************************************************


package clo;

public abstract class Shape {
	//instance variables
	private String color;
	
	//constructors
	public Shape() {
		this.color = "None";}
	
	public Shape(String color) {
		this.color = color;
	}
	
	//getter / setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//abstract methods
	public abstract double perimeter();

	public abstract double area();
	
	public abstract void printShapeInfo();

}
