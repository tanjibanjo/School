//	Author: Lane Pollock
//	Assignment: Cin Examples
//	Date: 31 Jan 2024
//	Language: C++
//	Lab Purpose/ Description: Demo cin possibilities

//	including required library
#include <iostream>
using namespace std;

int main()
{
	// variables
	string firstName;
	string lastName;
	string phoneNumber;	
	
    cout << "Demo of cin feature\n";
    
    // get input from user
    cout << "Please enter your first name, last name, and phone number.\n";
    cin >> firstName >> lastName >> phoneNumber;
    
    //display output to user
    cout << "You entered: " << endl
         << "First name: " << firstName << endl
         << "Last name: " << lastName << endl
         << "Phone: " << phoneNumber << endl << endl;
				  // the enter key pressed after cin stays in the stream!!
	cin.ignore(); // this is there to capture the newline character in stream
	   
	//demo of cin(get) function
	char myChar;
	
	cout << "Press a key: ";
	myChar = cin.get(); // reads a single character from the keyboard- assigns to myChar whatever key is pressed
	cout<< "You pressed: " <<myChar << endl << endl;
	
	cin.ignore();
	
	// reading multiple characters
	char buffer[0]; //arrays will be covered later, so don't worry yet
	
	cout << "Enter some text up to 9 characters: ";
	cin.get(buffer, 10); //reads up to 9 characters and stores in "buffer" - you have to put one more than you need
	cout << "You entered: " << buffer << endl;
	
	
	   
    return 0;
}

