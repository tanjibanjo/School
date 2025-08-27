//	Author: Lane Pollock	
//	Date:
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: 

//	including required library
#include <iostream>
using namespace std;

int main()
{
	// variables
	char grade = 'B';
	
	//output grade
	switch(grade)
	{
		case 'A':
		case 'a':
			cout << "Excellent!\n";
			break;
		case 'B':
		case 'b':
		case 'C':
		case 'c':
			cout << "Well Done.\n";
			break;
		case 'D':
		case 'd':
			cout << "You passed.\n";
			break;
		case 'F':
		case 'f':
			cout << "Better try again.\n";
			break;
		default:
			cout << "Invalid grade.\n";
			break;
	}
	
	cout << "Your grade is: " << grade << endl;
    return 0;
}

