//	Author: Lane Pollock	
//	Date: 26 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: intro to creating functions

#include <iostream>
using namespace std;

//function prototypes
//sets a placeholder so computer knows that the function will follow code
//function goes after main, prototypes go at top
int add(int, int);
bool isEven(int);

int main()
{
	///declare local variables
	int x = 5, y = 15;
	int sum;
	
	//call the add function to total the numbers
	sum = add(x, y);
	
	//display total
	cout << "The sum is " << sum << endl;
	
	//check if the sum is even
	if( isEven(sum) )
		cout << "The number is even.\n";
	
	else
		cout << "The number is odd.\n";
	
    return 0;
}

//function definitions

//funciton to return the sum of two integers, and return value
int add(int a, int b) //int - returns an integer
{
	return a + b; //return value of a + b
}

//function to return true if given value is even
//return false if it's odd
bool isEven(int number)
{
	return number % 2 == 0;
}

