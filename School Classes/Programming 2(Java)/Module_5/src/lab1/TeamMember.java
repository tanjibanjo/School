//************************************************************************
// Author: Lane Pollock
// Date: 30 Oct 2024
// Language: Java
// Assignment: Lab 5.1 - Baseball Team
// Description: Team Member class to be a base class for coach and player
//************************************************************************


package lab1;

public class TeamMember {
	//instance variables
	private String name;
	private int    jerseyNumber;
	
	//constructors
	public TeamMember() {
		name = "unknown";
		jerseyNumber = -1;
	}
	
	public TeamMember(String name, int jerseyNumber) {
		this.name = name;
		this.jerseyNumber = jerseyNumber;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
	//override toString
	@Override
	public String toString() {
		return "Name: " + name + "\n"
				+ "Jersey Number: " + jerseyNumber + "\n";
	}
	

}
