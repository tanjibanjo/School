//************************************************************************
// Author: Lane Pollock
// Date: 30 Oct 2024
// Language: Java
// Assignment: Lab 5.1 - Baseball Team
// Description: Player class that is a subclass of TeamMember 
//************************************************************************


package lab1;

import java.util.Objects;

public class Player extends TeamMember{
	//instance variables
	private String position;
	
	//constructors
	public Player(String name, int jerseyNumber, String position) {
		super(name,jerseyNumber);
		this.position = position;
	}
	
	//Overrides
	
	//toString() to add player's position
	@Override
	public String toString() {
		return "Player:\n\n" + super.toString()
				+ "Position: " + position + "\n";
	}
	
	//equals, to compare players
	@Override
	public boolean equals(Object o) {
		if(this == o) return true; //if it is the same object
		if(o == null || getClass() != o.getClass())
			return false; //if object is null or of another class
		Player player = (Player)o;
		return Objects.equals(this.getName(), player.getName()) &&
			   Objects.equals(this.getJerseyNumber(), 
					   			player.getJerseyNumber()) &&
			   Objects.equals(this.position, player.position);
	}
	
	//hashCode to coincide with equals
	@Override 
	public int hashCode() {
		return Objects.hash(this.getName(), this.getJerseyNumber(), 
							this.position);
	}

}
