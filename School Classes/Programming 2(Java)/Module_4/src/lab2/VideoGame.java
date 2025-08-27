//************************************************************************
// Author: Lane Pollock
// Date: 22 Oct 2024
// Language: Java
// Assignment: Lab 4.2
// Description: VideoGame class to represent a video game 
//************************************************************************


package lab2;

public class VideoGame {
	//instance variables
	private String title, genre, platform;
	private double price;
	
	//constructors
	public VideoGame() {
		title = "unknown";
		genre = "unknown";
		platform = "unknown";
		price = 0.0;
	}
	
	public VideoGame(String title, String genre, String platform, 
				     double price) {
		this.title = title;
		this.genre = genre;
		this.platform = platform;
		this.price = price;
	}
	
	//getters/setters

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
