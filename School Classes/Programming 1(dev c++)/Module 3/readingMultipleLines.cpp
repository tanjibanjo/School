//	Author: Lane Pollock	
//	Date: 19 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: demo on reading multiple lines from KEYBOARD

#include <iostream>
#include <string>
using namespace std;

int main()
{
	//local variables
	string line;
	
	//prompt user to enter lines of text
	cout << "Enter lines of text. An empty line quits.\n";
	getline(cin, line);
	
	//loop while user is still entering lines
	while ( !line.empty())
	{
		cout << "You entered: " << line << endl;
		getline(cin, line);
		
	}
	
    return 0;
}

