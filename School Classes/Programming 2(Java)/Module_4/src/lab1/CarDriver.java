//************************************************************************
// Author: Lane Pollock
// Date: 22 Oct 2024
// Language: Java
// Assignment: Lab 4.1
// Description: Driver Class to make an array list of cars and display 
//	information
//************************************************************************


package lab1;

import java.text.NumberFormat;
import java.util.ArrayList;

public class CarDriver {

	public static void main(String[] args) {
		//local variables
		//ArrayList to hold 5 cars
		ArrayList<Car> carList = new ArrayList<Car>();
		
		//populate the arraylist
		carList.add(new Car("Toyota", "Camry", 2023, 25000) );
		carList.add(new Car("Honda", "Civic", 2022, 35000) );
		carList.add(new Car("Ford", "Mustang", 2021, 40000) );
		carList.add(new Car("Chevy", "Silverado", 2013, 27500) );
		carList.add(new Car("Hyundai", "Sonata", 2014, 9000) );
		
		//call displayInventory to show the contents of carList
		displayInventory(carList);
		
		//call calculateTotalValue to find and print total value of lot
		calculateTotalValue(carList);

	}
	
	//methods
	
	//method to loop through the array list and print the car contents
	public static void displayInventory(ArrayList<Car> list) {
		//currency instance
		NumberFormat cf = NumberFormat.getCurrencyInstance();	
		
		//print table 
		System.out.println("Year\tMake\t  Model\t\tPrice");
		System.out.println("------------------------------------------");
		
		//loop through list to print car info
		for(Car car : list) 
			System.out.printf("%-8d%-10s%-10s%14s\n", 
				    car.getYear(), car.getMake(), car.getModel(), 
				    cf.format(car.getPrice() ) );
		
		System.out.println("------------------------------------------");
	}
	
	//method to take ArrayList and find/print the total value of all cars
	public static void calculateTotalValue(ArrayList<Car> list) {
		//local variables
		double total = 0.0;
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		
		//loop through list to add to total
		for(Car car : list)
			total += car.getPrice();
		
		//print the total
		System.out.println("Total Value of Lot: " + cf.format(total) );
	}	

}
