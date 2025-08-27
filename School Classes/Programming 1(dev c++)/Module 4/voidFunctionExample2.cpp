//	Author: Lane Pollock	
//	Date: 28 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: another example of void functions

#include <iostream>
using namespace std;

//function prototypes
void printHeader(string);
void printLine();
void largestNumber(int, int);
void printFooter();


int main()
{
	///declare local variables
	int firstNumber = 10;
	int secondNumber = 5;
	
	//display program header using function
	printHeader("Number Tester");
	
	//get the largest of two numbers
	largestNumber(firstNumber, secondNumber);
	
	//display footer using function
	printFooter();
	
    return 0;
}

//function definitions

//function to print a header using a supplied message
void printHeader(string message) //string var called "message"
{
	printLine();
	cout << "\t\t" << message << endl;
	//void functions have no return value
	printLine();
}

//function to print a line of asterisks
void printLine()
{
	cout << "********************************************\n";
}

//function to display the larger of two integers
void largestNumber(int num1, int num2)
{
	//declare local variables
	int largest;
	
	//determine the larger of the two integers
	largest = (num1 > num2) ? num1 : num2;
	
	//display result
	cout << "The largest number is " << largest << endl;
}

//function to print footer
void printFooter()
{
	printLine();
	cout << "\t\tEnd of Program Run\n";
	printLine();
}