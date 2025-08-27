//	Author: Lane Pollock	
//	Date: 7 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: Demo if/else statements

//	including required library
#include <iostream>
using namespace std;

int main()
{
	//delare variables
	int userAge;
	const int AGE_TO_DRIVE = 16; //legal age to drive
	
	//get user's age
	cout << "How old are you? ";
	cin >> userAge;
	cout << endl;
	
	//if user is >= 16, tell them they can drive
	//else tell them how long they have to wait to drive
	if(userAge >= 16)
	{
		cout << "Awesome, you are old enough to drive!\n";
	}
	else
	{
		cout << "Yikes, looks like you will have to wait "
			 << AGE_TO_DRIVE - userAge << " years to drive.\n";
	}
    return 0;
}

