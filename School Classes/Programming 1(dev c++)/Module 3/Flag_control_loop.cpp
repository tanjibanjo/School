//	Author: Lane Pollock	
//	Date: 19 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: 

//	including required library
#include <iostream>
using namespace std;

int main()
{
	//variables
	int stepsPerDay = 0;
	int totalSteps = 0;
	int dayNumber = 0;
	double stepsAverage = 0;
	bool doAgain = true; //set LCV
	
	//loop until doAgain is false
	// do not need to set while(doAgain == true) because it is already declared
	while(doAgain)
	{
		//prompt user for steps
		cout << "Enter the steps for day " << dayNumber + 1
			 << " or 0 to quit: ";
		cin >> stepsPerDay;
		
		//check if user entered steps
		if(stepsPerDay > 0)
		{
			totalSteps += stepsPerDay; //keep running total on steps
			dayNumber++; //increment days
		}
		else
			doAgain = false;
	} //end of loop
	
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

