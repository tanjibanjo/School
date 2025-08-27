//	Author: Lane Pollock	
//	Assignment: Type Cast Demo
//	Date: 31 Jan 2024
//	Language: C++
//	Lab Purpose/ Description: 

//	including required library
#include <iostream>
using namespace std;

int main()
{
	//declare local variables
	int testOne = 89; 
	int testTwo = 98;
	int testThree = 85;
	float testAverage;
	
	//calculate average
	//have to cast the test averages to a double so they will output decimal value
	// instead of static_cast<double(.....), can use (double)(......) instead!*
	testAverage = static_cast<double>(testOne + testTwo + testThree) / 3;
	
	cout << "The average grade of all three test scores is: " << testAverage << endl;
	
	cout << "End of program!";
	
    return 0;
}

