//	Author: Lane Pollock	
//	Date: 19 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: another for loop example

#include <iostream>
using namespace std;

int main()
{
	//local variables
	float userInput = 0.0;
	float totalNumbers = 0.0;
	float numberAverage = 0.0;
	
	//loop to get 5 numbers from user
	for(int counter = 1; counter <= 5; counter++)
	{
		cout << "Enter number " << counter << ": ";
		cin >> userInput;
		totalNumbers += userInput;	//keep running total of numbers
	}
	
	//calculate the average of the numbers
	numberAverage = totalNumbers / 5.0;
	
	//display the total and the average 
	cout << "The total is: " << totalNumbers << endl;
	cout << "The average is: " << numberAverage << endl;
	
    return 0;
}

