//************************************************************************
//	Author: Lane Pollock	
//	Date: 18 Mar 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: demo of enumerations
//************************************************************************


#include <iostream>
using namespace std;

//define enumerations
enum Color
{
	RED, //0
	GREEN, //1
	BLUE, //2
	YELLOW, //3
	ORANGE //4
	//after last constant, no comma!!
}; //enums end with semicolon

//function prototypes

int main()
{
	//declare local variables
	int choice;
	Color favoriteColor; //variable of the Color data type
	
	//display menu of colors and get user choice
	cout << "0 - Red\n"
		 << "1 - Green\n"
		 << "2 - Blue\n"
		 << "3 - Yellow\n"
		 << "4 - Orange\n"
		 << "Select your favorite color: ";
	cin >> choice;
	
	//assign a value to the favoriteColor var
	favoriteColor = static_cast<Color>(choice);
	
	//display the value of favoriteColor
	cout << "My favorite color is: " << favoriteColor << endl;
	
    return 0;
}

//function definitions