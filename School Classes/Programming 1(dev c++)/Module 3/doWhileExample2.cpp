//	Author: Lane Pollock	
//	Date: 21 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: do...while example 2

#include <iostream>
using namespace std;

int main()
{
	//local variables
	int choice;
	
	do{
	
		//menu
		cout << "=====================";
		cout << "MENU\n"
			 << "1 - Option 1\n"
			 << "2 - Option 2\n"
			 << "3 - Option 3\n"
			 << "4 - Quit\n"
			 << "Enter your choice and press return: ";
		cin >> choice;
	
	
		//switch on user choice
		switch(choice)
		{
			case 1: //user picks 1
				cout << "You chose option 1.\n";
				//this is where code goes for option 1
				break;
			case 2:
				cout << "You chose option 2.\n";
				break;
			case 3:
				cout << "You chose option 3.\n";
				break;
			case 4:
				cout << "Goodbye!\n";
				break;
			default:
				cout << "Not a valid choice.\n";
				cout << "Try again.\n";
				break;
		}	// end switch
	   } while(choice != 4);
	
    return 0;
}

