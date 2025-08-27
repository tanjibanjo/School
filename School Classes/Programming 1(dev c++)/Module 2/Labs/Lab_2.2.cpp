//	Author: Lane Pollock	
//	Date: 3 Feb 2024
//	Language: C++
//	Assignment: Lab 2.2
//	Lab Purpose/ Description: Create a program that prompts user for a number & displays sqrt, pow, and log

#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

int main()
{
	/* *****************************
     Variables
     ****************************** */
    // number from user 
    float number;
    
    /* *****************************
     Input
     ****************************** */
    // prompt for a number 
    cout << "Please input a number: ";
    cin >> number;
    cout << endl;
    
    /* *****************************
     Output 
     ****************************** */
    // output the results neatly to user

	// used set(w) so the results will display at the same point
	// left justification is persistent
	cout << left << setw(41) << "The square root of your number is:" 
		 << sqrt(number) << endl;
	cout << setw(41) << "Your number squared is:" 
		 << pow(number, 2) << endl;
	cout << setw(41) << "The natural logarithm of your number is:"
		 << log(number);
	 
    return 0;
}

