//	Author: Lane Pollock	
//	Date: 26 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: Example 1 of using a void function

#include <iostream>
using namespace std;

//function prototypes
void printGreeting();
void printSum(int, int);


int main()
{
	///declare local variables
	int x = 4, y = 7;
	
	//print greeting using funtion call
	printGreeting();
	
	cout << endl;
	
	//call function to display sum of two ints
	printSum(5, 3);
	
	//call function to display sum of two int vars
	printSum(x, y);
	
    return 0;
}

//function definitions
//function to display greeting
void printGreeting()
{
	cout << "Hello, world!\n";
}

//function that displays the sum of two integers
void printSum(int pOne, int pTwo)
{
	//declare local variables
	int sum = pOne + pTwo;
	
	cout << "The sum is " << sum << endl;
}