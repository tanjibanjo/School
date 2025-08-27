//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: Lab 3.1 - Employee
// Description: Class with attributes for employee benefits
//************************************************************************


package lab1;

public class Benefit {
	//instance variables
	private double cost;
	private String type;
	private String provider;
	
	/* CONSTRUCTORS */
	
	//default
	public Benefit() {
		this.cost = 0.0;
		this.type = "Unknown";
		this.provider = "Unknown";
	}
	
	//3 parameter
	public Benefit (String provider, String type, double cost) {
		this.provider = provider;
		this.type = type;
		this.cost = cost;
	}
	
	//copy
	public Benefit(Benefit b) {
		this.provider = b.provider;
		this.type = b.type;
		this.cost = b.cost;
	}
	
	/* GETTERS/SETTERS */

	public double getCost() {
		return cost;
	}

	public String getType() {
		return type;
	}

	public String getProvider() {
		return provider;
	}
		
	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	/* METHODS */

	//method to return a string of the benefit
	public String printBenefit() {
		String str = "";
		
		//populate str return
		str += "# Benefits #";
		str += "\nType: " + type;
		str += "\nProvider: " + provider;
		str += "\nCost: $";
		//using format for currency
		str = String.format("%s%,.2f", str, cost);
		
		return str;
	}
	

}
