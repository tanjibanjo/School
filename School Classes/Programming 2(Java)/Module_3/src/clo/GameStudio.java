//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: CLO - GameStudio
// Description: Class to hold attributes for a game studio, including
//  a VideoGame and Character
//************************************************************************


package clo;

public class GameStudio {
	//instance variables
	private String studioName;
	private String location;
	private VideoGame publishedGame;
	
	/* CONSTRUCTORS */
	
	//default
	public GameStudio() {
		this.studioName = "Unkown";
		this.location = "Unknown";
		this.publishedGame = new VideoGame(); //using default
	}
	
	//3 parameter
	public GameStudio(String studioName, String location, VideoGame b) {
		this.studioName = studioName;
		this.location = location;
		this.publishedGame = new VideoGame(b); //using copy
	}
	
	//copy constructor
	public GameStudio(GameStudio b) {
		this.studioName = b.studioName;
		this.location = b.location;
		this.publishedGame = new VideoGame(b.publishedGame);
	}
	
	/* GETTERS/SETTERS */

	public String getStudioName() {
		return studioName;
	}

	public void setStudioName(String studioName) {
		this.studioName = studioName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public VideoGame getPublishedGame() {
		return new VideoGame(publishedGame);
	}

	public void setPublishedGame(VideoGame publishedGame) {
		this.publishedGame = new VideoGame(publishedGame);
	}

	//override toString
	@Override
	public String toString() {
		String str = "";
		str += "|-------------------------|\n";
		str	+= "|         Studio          |\n";
		str	+= "|-------------------------|\n";
		str += "\t" + studioName + "\n\t";
		str += location + "\n" + publishedGame;
		
		return str;
	}
	
	

}
