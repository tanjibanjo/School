//************************************************************************
// Author: Lane Pollock
// Date: 22 Oct 2024
// Language: Java
// Assignment: Lab 4.2
// Description: Driver class to manage a collection of video games
//************************************************************************


package lab2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class VideoGameDriver {
	
	//global scanner, allowed in lab
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		//local variables
		//one member array to act as pass by reference for method
		int[] choice = {-1}; 
		ArrayList<VideoGame> gameList = new ArrayList<VideoGame>();
		
		//pre-populate the array
		gameList.add(new VideoGame("Legend of Zelda", "Adventure", 
								   "Nintendo Switch", 63.99));
		gameList.add(new VideoGame("Mario Kart 8", "Racing", 
								   "Nintendo Switch", 49.30));
		gameList.add(new VideoGame("Halo", "First Person Shooter", 
								   "Xbox One", 47.85));
		gameList.add(new VideoGame("Mario Kart 8", "Racing", 
								    "Playstation", 23.50));
		
		//loop to contain menu and choices
		do {
			//display menu and prompt for choice
			displayMenu(choice);
			
			//switch choice
			switch(choice[0]) {
			case 0: //exit
				System.out.println("Goodbye.");
				break;
			case 1: //add game to collection
				addGame(gameList);
				break;
			case 2: //show all games
				displayInventory(gameList);
				break;
			case 3: //search for a game by title
				searchByTitle(gameList);
				break;
			case 4: //search for a game by platform
				searchByPlatform(gameList);
				break;
			default: //not a valid option
				System.out.println("Invalid Choice.");
			}
			
		} while(choice[0] != 0);
		
		//close scanner
		in.close();

	} //end main
	
	 /*-----------------------
	 ---------METHODS---------
	 -----------------------*/
	
	
	//method to display menu to user and prompt for a choice
	public static void displayMenu(int[] choice) {
		//local variables
		String menu = "";
		//build the menu 
		menu += "Video Game Management Menu\n"
			 + "0 - Exit\n"
			 + "1 - Add Game\n"
			 + "2 - Display Inventory\n"
			 + "3 - Search by Title\n"
			 + "4 - Search by Platform\n"
			 + "Enter Choice: ";
		
		//print menu
		System.out.print(menu);
		
		//get and store the choice from user
		choice[0] = in.nextInt();
		in.nextLine(); //clear buffer
				
	}
	
	//method to prompt for details and add game to gameList
	public static void addGame(ArrayList<VideoGame> games) {
		//local variables
		String title, genre, platform;
		double price;
		
		//prompt for info of video game
		System.out.print("Enter Title: ");
		title = in.nextLine();
		System.out.print("Enter Genre: ");
		genre = in.nextLine();
		System.out.print("Enter Platform: ");
		platform = in.nextLine();
		System.out.print("Enter Price: $");
		price = in.nextDouble();
		System.out.println();
		
		//add to array list
		games.add(new VideoGame(title, genre, platform, price) );
	}
	
	//method to display all game in list
	public static void displayInventory(ArrayList<VideoGame> games) {
		//currency formatter
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		
		//print header of inventory
		System.out.println("-----------------------------------------"
						  + "-----------------------------------------");
		System.out.printf("%-20s%-24s%-20s%10s", "Title", "Genre", 
							"Platform", "Price");
		System.out.println("\n-----------------------------------------"
						  + "-----------------------------------------");
		
		//iterate through list to print game data
		for(VideoGame game : games)
			System.out.printf("%-20s%-24s%-20s%10s\n", game.getTitle(), 
					game.getGenre(), game.getPlatform(), 
					cf.format(game.getPrice() ) );
		
		System.out.println();
	}
//************************************************************************
	
	//method to search the arraylist for games based on title
	public static void searchByTitle(ArrayList<VideoGame> games) {
		//local variables
		String title;
		boolean found = false; //if this is false, there are no matches
		//currency formatter
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		
		//prompt for title to search for
		System.out.print("Enter Title of Game to Search For: ");
		title = in.nextLine();
		
		//iterate through list to see if name matches, and print
		for(VideoGame game : games) {
			if(game.getTitle().equals(title)) {
				System.out.printf("%-20s%-24s%-20s%10s\n", 
						game.getTitle(), game.getGenre(), 
						game.getPlatform(), cf.format(game.getPrice()));
				found = true;
			}
		} //end for
		
		//if nothing was found print message
		if(!found)
			System.out.println("The Title \"" + title + "\" "
					+ "Not Found");
		
		System.out.println();
	}
	
	public static void searchByPlatform(ArrayList<VideoGame> games) {
		//local variables
		String platform;
		boolean found = false; //if this is false, there are no matches
		//currency formatter
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		
		//prompt for title to search for
		System.out.print("Enter Platform of Game to Search For: ");
		platform = in.nextLine();
		
		//iterate through list to see if name matches, and print
		for(VideoGame game : games) {
			if(game.getPlatform().equals(platform)) {
				System.out.printf("%-20s%-24s%-20s%10s\n", 
						game.getTitle(), game.getGenre(), 
						game.getPlatform(), cf.format(game.getPrice()));
				found = true;
			}
		}
		
		//if nothing was found print message
				if(!found)
					System.out.println("The Platform \"" + platform
							+ "\" Not Found.");
		
		System.out.println();
	}

}
