//	Author: Lane Pollock	
//	Date:
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: iomanip demo

//	including required library
#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	// declare variables
	double pi = 3.141592653589793238;
	
	// before set precision
	cout << "Before setting the precision: " << pi << endl;
	
	// set precision to 11
	cout << "Setting precision to 11: " << setprecision(11) << pi << endl;
	
	//using setwidth
	int myNumber =50;
	
	// before setwidth
	cout << "Before setting width:" << myNumber << "|" << endl;
	
	//set width to 5
	cout << "Setting the width to 5:" << setw(5) << myNumber << "|" << endl;
	
	//default is right justified
	cout << "Left justify:" << left << setw(25) << myNumber << "|" << endl;
	cout << "Right justify:" << right << setw(25) << myNumber << "|" << endl;
	
	//use setfill, fixed, showpoint
	//set up a menu
	
	double applePrice = 1.25;
	double peachPrice = .7;
	double steakPrice = 12.0;
	
	// set output format
	cout << fixed << showpoint << setprecision(2);
	
	cout << "********* Setting up our display **********\n";
	cout << setw(30) << left << setfill('.') << "Apple "
		 << setw(3) << right << setfill(' ') << "$"
		 << setw(6) << right << applePrice << endl;
	cout << setw(30) << left << setfill('.') << "Peach "
		 << setw(3) << right << setfill(' ') << "$"
		 << setw(6) << right << peachPrice << endl;
	cout << setw(30) << left << setfill('.') << "Steak "
		 << setw(3) << right << setfill(' ') << "$"
		 << setw(6) << right << steakPrice << endl;
	
    return 0;
}

