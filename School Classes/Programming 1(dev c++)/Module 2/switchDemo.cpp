//	Author: Lane Pollock	
//	Date: 12 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: Demo Switch case

//	including required library
#include <iostream>
using namespace std;

int main()
{
	// variables
	int day;	// day of the week, 1 = Monday
	
	// prompt for day of the week
	cout << "Enter a day number: 1-7: ";
	cin >> day;
	
	//output the day of the week based on number
	switch(day)
	{
		case 1:
			cout << "Monday\n";
			break;
		case 2:
			cout << "Tuesday\n";
			break;
		case 3:
			cout << "Wednesday\n";
			break;
		case 4:
			cout << "Thursday\n";
			break;
		case 5:
			cout << "Friday\n";
			break;
		case 6:
			cout << "Saturday\n";
			break;
		case 7:
			cout << "Sunday\n";
			break;
		default:
			cout << "Invalid day number\n";
			break;		
	}

    return 0;
}

