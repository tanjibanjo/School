//	Author: Lane Pollock	
//	Date: 14 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: demo a sentinel controlled while loop

//	including required library
#include <iostream>
using namespace std;

int main()
{
	//variables
	int stepsPerDay = -1; //sets LCV
	int totalSteps = 0;
	int dayNumber = 0;		
	float stepsAverage = 0.0;
	
	//loop until user enters 0 steps
	while(stepsPerDay != 0)
	{
		cout << "Enter the steps for day " << dayNumber + 1
			 << " or 0 to quit: ";
		cin >> stepsPerDay;
		
		if(stepsPerDay > 0)
		{
			totalSteps += stepsPerDay; //running total of steps
			dayNumber++; //increment LCV
		}
	} //end of while loop
	
	//check if the day number > 0 before calculating average steps
	if(dayNumber > 0) // check for division by 0
	{
		//calculate average steps
		stepsAverage = static_cast<float>(totalSteps) / dayNumber;
		
		//display results
		cout << "Your average daily steps is: " << stepsAverage << endl;
		
		//give user feedback based on average steps
		if(stepsAverage >= 7500)
			cout << "Great job! You are getting your steps in.\n";
		else
			cout << "Looks like you need to do some more walking.\n";
	}
	
	return 0;
}