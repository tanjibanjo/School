//	Author: Lane Pollock	
//	Date: 26 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: revisit predefined functions

#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	//local variables
	int myInt = 5;
	double myDouble = 3.2;
	char myChar = 'H';
	
	cout << "Ceiling funciton " << ceil(myDouble) << endl;
	cout << "Floor function " << floor(myDouble) << endl;
	cout << "Power function " << pow(myInt, 3) << endl;
	cout << "Square root function " << sqrt(25) << endl;
	//notice in the example below the need to cast the result
	//tolower function probably converts the character to its int value, so we need to cast it back
	cout << "To lower function "
		 << static_cast<char>( tolower(myChar)) << endl;
	
    return 0;
}

