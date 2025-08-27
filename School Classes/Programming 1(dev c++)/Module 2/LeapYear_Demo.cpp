//	Author: Lane Pollock	
//	Date: 7 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: create a program with nested ifs for checking leap year

//	including required library
#include <iostream>
using namespace std;

int main()
{
	//local variables
	int year;
	
	//get year from user
	cout << "Enter the year: ";
	cin >> year;
	
	//check if the year is a leap year
	if(year % 4 == 0) // year is divisible by 4
	{
		if(year % 100 == 0) //divisible by 100
		{
			if(year % 400 == 0) //divisible by 400
			{
				cout << "The year " << year << " is a leap year.\n";
			}
			else 
			{
				cout << "The year " << year << " is not a leap year.\n";
			}
		}
		else
		{
			cout << "The year " << year << " is a leap year.\n";
		}
	}
	else 
	{
		cout << "The year " << year << " is not a leap year.\n";
	}
	
    return 0;
}

