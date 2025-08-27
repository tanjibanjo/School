//	Author: Lane Pollock	
//	Date: 19 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: The computer will pick a random number, and the user will have to guess the number
//							 -computer will count the number of guesses
#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main()
{
	//variables
	int randomNumber;			//random number for computer
	int userGuess;				//user guess
	int numberOfGuesses = 0;	//count of user guesses - must be declared so there is a value to increment on
	bool isGuessed = false;		//flag LCV
	
	//seed the random number generator
	srand( (int)time(0) );		// casting time to an integer - 0 refers to current time?
								// srand = seed random
	
	//generate a random number from 1-20
	randomNumber = rand() % 20 + 1;	// % 20 generates -> 0-19, so we add 1 to make it 1-20
	
	while( !isGuessed)			//while number is NOT guessed
								// needs to be true to enter and false to end
	{
		//prompt user for a number
		cout << "Enter a number from 1-20: ";
		cin >> userGuess;
		numberOfGuesses++; //increment amount of guesses
		cout << endl;
		
		//check to see if number is too high, too low, or if user has guessed correctly
		if(userGuess == randomNumber)
		{
			cout << "Congrats, you guessed number " << randomNumber << " on try number " << numberOfGuesses << endl;
			isGuessed = true;		//update LCV
		}
		else if(userGuess > randomNumber)
			cout << "Looks like your guess is too high. Try again.\n";
		else
			cout << "Looks like your guess is too low. Try again\n";
	}
	
	
    return 0;
}

