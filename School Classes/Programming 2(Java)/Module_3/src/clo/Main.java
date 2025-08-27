//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: CLO - Main
// Description: Driver class to get input, instantiate, and test
//  classes of Character, VideoGame, and GameStudio
//************************************************************************

package clo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// local variables
		int hp;
		String gameName, genre, studioName, location, charName, charType;
		//instances
		Scanner in = new Scanner(System.in);
		Character myChar;
		VideoGame myGame;
		GameStudio myStudio;
		
		//prompt for input from user and store
		System.out.print("Enter attributes for the character.\nName: ");
		charName = in.nextLine();
		
		System.out.print("Type: ");
		charType = in.nextLine();
		
		System.out.print("Hitpoints (hp): ");
		hp = in.nextInt();
		
		in.nextLine(); //clear input buffer
		
		System.out.print("Now enter values for the game.\nName: ");
		gameName = in.nextLine();
		
		System.out.print("Genre: ");
		genre = in.nextLine();
		
		System.out.print("Lastly, for the studio.\nName: ");
		studioName = in.nextLine();
		
		System.out.print("Location: ");
		location = in.nextLine();
		
		//close the scanner;
		in.close();
		
		//instantiate the classes!
		myChar = new Character(charName, charType, hp);
		myGame = new VideoGame(gameName, genre, myChar);
		myStudio = new GameStudio(studioName, location, myGame);
		
		//print the details
		System.out.println("\n" + myStudio);

	}

}
