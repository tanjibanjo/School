//************************************************************************
// Author: Lane Pollock
// Date: 30 Oct 2024
// Language: Java
// Assignment: Lab 5.1 - Baseball Team
// Description: Coach class that is a subclass of TeamMember
//************************************************************************


package lab1;

import java.util.Objects;

public class Coach extends TeamMember{
	//instance variables
	private String role;
	
	//constructors
	public Coach(String name, int jerseyNumber, String role) {
		super(name, jerseyNumber);
		this.role = role;
	}
	
	//Overrides
	
	//toString to include role
	@Override
	public String toString() {
		return "Coach:\n\n" + super.toString() + "Role: "
				+ role + "\n";
	}
	
	//equals to compare coaches
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass())
			return false;
		Coach coach = (Coach)o;
		return Objects.equals(this.getName(), coach.getName()) &&
				Objects.equals(this.getJerseyNumber(), 
								coach.getJerseyNumber()) &&
				Objects.equals(this.role, coach.role);
	}
	
	//hash to coincide with equals
	@Override 
	public int hashCode() {
		return Objects.hash(this.getName(), this.getJerseyNumber(), 
							this.role);
	}

}
