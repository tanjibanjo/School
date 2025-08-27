//	Author: Lane Pollock	
//	Date: 3 Feb 2024
//	Language: C++
//	Assignment: Lab 2.3
//	Lab Purpose/ Description: Create a simple text-based game like rock, paper, scissors using conditional statements

#include <iostream>
using namespace std;

int main()
{
	/* *****************************
     Variables
     ****************************** */
     // player choice and computer choice as int
     // initialize computer's choice as a constant
    int playerChoice;
    int computerChoice = 3;
    
    /* *****************************
     Input
     ****************************** */
     // prompt user for input between 1-3 (rock, paper, scissors)
    cout << "Welcome to Rock, Paper, Scissors.\n";
    cout << "Enter 1 for rock, 2 for paper, 3 for scissors: ";
    cin >> playerChoice;
    
    /* *****************************
     Processes
     ****************************** */
	 // use switch to convert player number to corresponding string
    switch (playerChoice)
    {
	    case 1 :
     		cout << "You have chosen rock. Good luck!" << endl;
     		break;
        case 2 :
      		cout << "Paper, huh?" << endl;
      		break;
        case 3 :
      		cout << "You have chosen scissors. How original..." << endl;
      		break;
        default :
      		cout << "Invalid.\n";
      		return 1;
      		break;	
	}
	
	switch (computerChoice)
	{
	    case 1 :
	 		cout << "The computer has chosen rock.\n";
	 		break;
	    case 2 :
	  		cout << "The computer has chosen paper.\n";
	  		break;
	    case 3 :
	  		cout << "The computer has chosen scissors.\n";
	  		break;
	}
     
	 // if statement for tie, then display to user
	 // only one statement each so no curly braces needed
    if (playerChoice == computerChoice) 
		cout << "You have tied.\n";
     
     // else if statement for each possible win, display congrats
    else if (playerChoice == 1 && computerChoice == 3)
		cout << "Wow, you won!\n";
	
	else if (playerChoice == 2 && computerChoice == 1) 
		cout << "Congratulations on winning!\n";

	else if (playerChoice == 3 && computerChoice == 2) 
		cout << "You have won!\n";
     
	 // else statement for potential losses, display to user the results
	else 
		cout << "Ouch...you lost!\n";
   
    return 0;
}

