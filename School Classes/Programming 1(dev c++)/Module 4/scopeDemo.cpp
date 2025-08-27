//************************************************************************
//	Author: Lane Pollock	
//	Date: 4 March 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: demonstrate scope of variables
//************************************************************************


#include <iostream>
using namespace std;

//global variables
int myGlobalNumber = 10;

//function prototypes
void myFunction ();

int main()
{
	///declare local variables
	int myLocalNumber = 20;
	
	cout << "My global number: " << myGlobalNumber << endl;
	cout << "My local number: " << myLocalNumber << endl;
	
	myFunction();
	
    return 0;
}


//function definitions
void myFunction()
{
	//declare local variables
	int myFunctionNumber = 30;
	
	cout << "My global number: " << myGlobalNumber << endl;
	cout << "My function number: " << myFunctionNumber << endl;
}