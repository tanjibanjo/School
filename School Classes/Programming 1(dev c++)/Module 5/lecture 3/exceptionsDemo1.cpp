//************************************************************************
//	Author: Lane Pollock	
//	Date: 25 Mar 2024
//	Language: C++
//	Assignment: 
//	Description: demo of a try/catch exception
//************************************************************************


#include <iostream>

using namespace std;

//function prototypes

int main()
{
	//wrapping code inside a try block which
	//could possibly throw an exception
	try
	{
		int numerator = 10;
		int denominator = 0;
		
		//check if denominator = 0
		if(denominator == 0)
			throw runtime_error("Divide by zero error.");
		
		//if the denominator is valid
		cout << "The result is: " << numerator / denominator << endl;
	}
	catch (runtime_error& e)
	{
		//if an exception was thrown, print error message
		cout << "Exception caught: " << e.what() << endl;
	}
	
    return 0;
}

//function definitions