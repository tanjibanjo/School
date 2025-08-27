//************************************************************************
//	Author: Lane Pollock	
//	Date: 4 March 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: demo of overloading functions
//************************************************************************


#include <iostream>
#include <string>
using namespace std;

//function prototypes
void myFunction();
void myFunction(string);
string myFunction(string, int);

int main()
{
	//declare local variables
	myFunction();
	cout << endl;
	myFunction("Hello");
	cout << endl;
	cout << myFunction("This is a string", 5);
	cout << endl;
	
    return 0;
}


//function definitions
void myFunction()
{
	cout << "Inside the myFunction that does not take parameters.\n";
}

void myFunction(string message)
{
	cout << "Inside the myFunction - the message is " << message << endl;
}

string myFunction(string message, int x)
{
	string myReturn = "Inside the myFunction - message is " + 
					  message + "\n";
	myReturn += "The value of the int passed to me is " + to_string(x) + 
				"\n";
	
	return myReturn;
}