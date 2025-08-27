//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: CLO - Game Character
// Description: Character class to hold attributes for a game character
//************************************************************************


package clo;

public class Character {
	//instance variables
	private String characterName;
	private String characterType;
	private int hitPoints;
	
	/* CONSTRUCTORS */
	
	//default
	public Character() {
		this("Unknown", "Unknown", 0);
	}
	//3 par
	public Character(String name, String type, int hp) {
		this.characterName = name;
		this.characterType = type;
		setHitPoints(hp); //using built in validation
	}
	//copy
	public Character(Character b) {
		this.characterName = b.characterName;
		this.characterType = b.characterType;
		this.hitPoints = b.hitPoints;
	}
	
	/* GETTERS/SETTERS */
	
	public String getCharacterName() {
		return characterName;
	}
	
	public String getCharacterType() {
		return characterType;
	}
	
	public int getHitPoints() {
		return hitPoints;
	}
	
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	
	public void setCharacterType(String characterType) {
		this.characterType = characterType;
	}
	
	public void setHitPoints(int hitPoints) {
		//validate there are positive # of hp
		if(hitPoints >= 0)
			this.hitPoints = hitPoints;
		else //less than 0
			this.hitPoints = 0;
	}
	
	//override toString for nice output
	@Override
	public String toString() {
		//string return
		String str = "";
		
		str += "|-------------------------|\n";
		str += "|        Character        |\n";
		str += "|-------------------------|\n";
		str += "\t" + characterName + "\n\t";
		str += characterType + "\n\t" + hitPoints + " hp";
		
		return str;
	}	
	

}
