//	Author: Lane Pollock
//	Assignment: Output Demo
//	Date: 24 Jan 24
//	Language: C++
//	Lab Purpose/ Description: Demo In/Out

//	including required library
#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	// declare variables
	int x = 42;
	double pi = 3.141592653589793;
	
	// basic output
	cout << "Hello World\n";
	
	// output with variable
	cout << "The value of x is: " << x << endl;
	
	// formatted output - 3.142
	cout << showpoint << fixed << setprecision(4) << "The value of PI is: " << pi << endl;
	
	// multiple insertions
	cout << "x: " << x << ", PI: " << pi << endl;
	
	// special characters
	cout << "First Line\nSecond Line\n";
	
    return 0;
}

