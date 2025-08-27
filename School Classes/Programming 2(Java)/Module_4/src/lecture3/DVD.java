package lecture3;

import java.text.NumberFormat;

public class DVD {
	//instance variables
	private String title, director;
	private int year;
	private double cost;
	private boolean bluray;
	
	//constructors
	public DVD(String title, String director, int year, double cost, boolean bluray) {
		this.title = title;
		this.director = director;
		this.year = year;
		setCost(cost); //using built in validation
		this.bluray = bluray;
	}
	
	//setters

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setCost(double cost) {
		if(cost >= 0)
			this.cost = cost;
		else 
			this.cost = 0.00;
	}

	public void setBluray(boolean bluray) {
		this.bluray = bluray;
	}
	
	//getters

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public int getYear() {
		return year;
	}

	public double getCost() {
		return cost;
	}

	public boolean isBluray() {
		return bluray;
	}
	
	//override toString to return the DVD details
	@Override 
	public String toString() {
		//local variables
		String description;
		
		//number format for cost
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		description = fmt.format(cost) + "\t" + year + "\t";
		description += title + "\t" + director;
		if(bluray) 
			description += "/t" + "Blu-ray";
		
		return description;
	}
	

}
