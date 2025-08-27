//	Author: Lane Pollock	
//	Date: 14 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: demo a counter controlled while loop

//	including required library
#include <iostream>
using namespace std;

int main()
{
	//variables
	int stepsPerDay = 0;
	int totalSteps = 0;
	int dayNumber = 1;		// sets LCV
	float stepsAverage = 0.0;
	
	//loop through five days and get the steps from the user
	while(dayNumber <= 5)
	{
		cout << "Enter the steps for day " << dayNumber << ": ";
		cin >> stepsPerDay;
		
		//keep a running total of steps
		totalSteps = totalSteps + stepsPerDay;
		
		dayNumber++; //increment the LCV
	}
	
	//calculate the average steps per day
	//without either adding a .0 to 5 or casting totalSteps to a float, there will be no decimal in the answer
	//stepsAverage = totalSteps / 5.0;
	stepsAverage = (float)totalSteps / 5;
	
	//output the results to user
	cout << "Your average daily steps are " << stepsAverage << endl;
	
	//give the user feedback based on the average dailys steps
	if(stepsAverage >= 7500)
		cout << "Great Job - you are getting your steps in!\n";
	else
		cout << "Looks like you need to do some more walking...\n";
		
	
	


    return 0;
}

