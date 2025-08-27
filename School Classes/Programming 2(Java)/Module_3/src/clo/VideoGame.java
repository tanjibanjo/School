//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: CLO - VideoGame
// Description: Class to hold attributes for a video game, 
//  including a Character type object
//************************************************************************

package clo;

public class VideoGame {
	//instance variables
	private String gameName;
	private String genre;
	private Character mainCharacter;
	
	/* CONSTRUCTORS */
	
	//default
	public VideoGame() {
		this.gameName = "Unknown";
		this.genre = "Unknown";
		this.mainCharacter = new Character(); //using default 
	}
	
	//3 parameter
	public VideoGame(String gameName, String genre, Character newChar) {
		this.gameName = gameName;
		this.genre = genre;
		this.mainCharacter = new Character(newChar); //using copy
	}
	
	//copy
	public VideoGame(VideoGame b) {
		this.gameName = b.gameName;
		this.genre = b.genre;
		this.mainCharacter = new Character(b.mainCharacter); 
	}
	
	/* GETTERS/SETTERS */

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	//returning a copy, not pointer
	public Character getMainCharacter() {
		return new Character(mainCharacter); 
	}
	//using copy constructor to set new values
	public void setMainCharacter(Character mainCharacter) {
		this.mainCharacter = new Character(mainCharacter);
	}
	
	//toString 
	@Override
	public String toString() {
		//format string return 
		String str = "";
		
		str += "|-------------------------|\n";
		str += "|          Game           |\n";
		str += "|-------------------------|\n";
		str += "\t" + gameName + "\n\t" + genre;
		str += "\n" + mainCharacter;
		
		return str;
	}
	
	

}
