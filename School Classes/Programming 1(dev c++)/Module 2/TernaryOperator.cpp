// ternary example
// 12 Feb 2024
//demo ternary operator

#include <iostream>
using namespace std;

int main()
{
	// declare variables
	int numOne = 5;
	int numTwo = 10;
	int min;
	
	//use ternary operator
	min = (numOne < numTwo) ? numOne : numTwo;
	
	//output
	cout << "The minimum is: " << min;
	
	return 0;
}