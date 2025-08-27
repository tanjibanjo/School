//************************************************************************
// Author: Lane Pollock
// Date: 22 Oct 2024
// Language: Java
// Assignment: Lab 4.1
// Description: Car Class to hold make, model, year, price of a car
//************************************************************************


package lab1;


public class Car {
	//instance variables
	private String make, model;
	private int year;
	private double price;
	
	//constructors
	
	public Car() {
		make = "unknown";
		model = "unknown";
		year = 0;
		price = 0.0;
	}
	
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	//getter/setters

	public void setMake(String make) {
		this.make = make;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
}
