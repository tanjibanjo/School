//************************************************************************
// Author: Lane Pollock
// Date: 13 Sep 2024
// Language: Java
// Assignment: Lab 2.3 - Guess the Number
// Description: Create a class that simulates a guessing game, and random
//	generates integers for user to guess
//************************************************************************

package lab3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	//instance variables
	private int secretNumber;
	private int playerGuess;
	
	//constructor
	public GuessTheNumber() {
		//local variables
		Random rand = new Random(); //new instance for random number
		
		//bounds are 0-99 + 1 = (1-100)
		secretNumber = rand.nextInt(99) + 1; 
	}
	
	//methods
	public String guess(int guess) {
		//local variables
		String feedback;
		
		playerGuess = guess; //updates the player guess based on input
		
		//return feedback on guess
		if(playerGuess > secretNumber)
			feedback = "You're too high!";
		else if(playerGuess < secretNumber)
			feedback = "Too low, try again.";
		else // correct guess
			feedback = "Congrats, you guessed correctly!";
		
		return feedback;
	}
	
	public void playGame() {
		//open the scanner for game
		Scanner in = new Scanner(System.in);
		
		do {
			//prompt user for guess and store using guess
			System.out.print("Enter your guess: ");
			System.out.println( guess(in.nextInt()) );
		}while(playerGuess != secretNumber);
		
		//close scanner
		in.close();
	}

}
