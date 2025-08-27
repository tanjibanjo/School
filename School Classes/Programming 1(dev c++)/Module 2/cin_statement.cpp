//	Author: Lane Pollock	
//	Date: 14Feb2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: demo cin clear statements

//	including required library
#include <iostream>
using namespace std;

int main()
{
	//variables
	int myNumber;
	char myChar;
	char nextChar;
	
	//prompt user to enter int
	cout << "Please enter an integer: ";
	cin >> myNumber;
	
	//just for comparison
	cout << "A true is: " << true << endl
		 << "A false is: " << false << endl;
	cout << "The error state is: " << cin.fail() << endl;
	
	if (cin.fail())
	{
		cout << "That was not an integer.\n";
		
		//clear error state
		cin.clear();
		
		//clear input stream
		cin.ignore();
	}
	else
		cout << "You entered the integer: " << myNumber << endl;
	
	/**********************************************************/
	
	// prompt user for a character
	cout << "Please enter a character: \n";
	cin >> myChar;
	
	// display the enter character
	cout << "You entered the character: " << myChar << endl;
	
	//put the character back into the input stream
	cin.putback(myChar);
	
	//re-read char from input stream
	cin >> myChar;
	
	//output again
	cout << "The re-read character is: " << myChar << endl;
	
	cin.ignore(); //clear input stream
	
	/******************************************************/
	
	//prompt user for another character
	cout << "Please enter another character: ";
	
	//peak at the next character in the input stream
	nextChar = cin.peek();
	
	//check if the character is a digit
	if ( isdigit(nextChar) )
		cout << "The next character is a digit.\n";
	else
		cout << "The next character is not a digit.\n";
	
	//read char and display
	cin >> myChar;
	cout << "This time you entered: " << myChar << endl;
		
			
    return 0;
}

