//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: Lab 3.3 - Parking Permit
// Description: Class with attributes for a parking permit and random ID
//************************************************************************


package lab3;

import java.util.Random;

public class ParkingPermit {
	//instance variables
	private int permitID;
	private String carMake, carModel, carYear;
	private Random rand = new Random(); //new instance of random
	
	/* CONSTRUCTORS */
	
	//default
	public ParkingPermit() {
		this.permitID = 0;
		this.carMake = "Unkown";
		this.carModel = "Unkown";
		this.carYear = "Unkown";
	}
	
	//3 parameter
	public ParkingPermit(String make, String model, String year) {
		//(0-8999) + 1000 = (1000 - 9999)
		this.permitID = (rand.nextInt(9000) + 1000);
		this.carMake = make;
		this.carModel = model;
		this.carYear = year;
	}
	
	//copy
	public ParkingPermit(ParkingPermit b) {
		this.permitID = b.permitID;
		this.carMake = b.carMake;
		this.carModel = b.carModel;
		this.carYear = b.carYear;
	}
	
	/* GETTERS/SETTERS */

	public int getPermitID() {
		return permitID;
	}

	public void setPermitID(int permitID) {
		this.permitID = permitID;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarYear() {
		return carYear;
	}

	public void setCarYear(String carYear) {
		this.carYear = carYear;
	}
	
	//override method
	@Override 
	public String toString() {
		String str;
		str = String.format("Permit ID: %d\n\t%s %s %s", permitID, carYear, carMake, carModel);
		
		return str;
	}

}
