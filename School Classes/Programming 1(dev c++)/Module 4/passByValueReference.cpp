//	Author: Lane Pollock	
//	Date: 28 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: example of pass by value/ pass by reference in c++

#include <iostream>
using namespace std;

//function prototypes
void callByValue(int, int);
void callByReference(int&, int&);

int main()
{
	///declare local variables
	int firstNumber = 10;
	int secondNumber = 5;

	//display the values of the numbers before callByValue
	cout << "Before callByValue.\n";
	cout << "\tFirst Number: " << firstNumber << endl;
	cout << "\tSecond Number: " << secondNumber << endl;
	
	//call function
	callByValue(firstNumber, secondNumber);
	
	//display values after callByValue
	cout << "After callByValue.\n";
	cout << "\tFirst Number: " << firstNumber << endl;
	cout << "\tSecond Number: " << secondNumber << endl;
	
	//call CBR function
	callByReference(firstNumber, secondNumber);
	
	//display values after callByValue
	cout << "After callByReference.\n";
	cout << "\tFirst Number: " << firstNumber << endl;
	cout << "\tSecond Number: " << secondNumber << endl;
	
    return 0;
}

//function definitions

//function to swap values using pass by value
void callByValue(int num1, int num2)
{
	//declare local variables
	int temp = num1;
	
	//swap values
	num1 = num2;
	num2 = temp;
	
	//display the values of the numbers
	cout << "Inside callByValue.\n";
	cout << "\tFirst Number: " << num1 << endl;
	cout << "\tSecond Number: " << num2 << endl;
}

//function to swap values using pass by reference
void callByReference(int& num1, int& num2)
{
	//declare local variables
	int temp = num1;
	
	//swap values
	num1 = num2;
	num2 = temp;
	
	//display the values of the numbers
	cout << "Inside callByReference.\n";
	cout << "\tFirst Number: " << num1 << endl;
	cout << "\tSecond Number: " << num2 << endl;
}