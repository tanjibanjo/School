//	Author: Lane Pollock	
//	Date: 21 Feb 2024
//	Language: C++
//	Assignment: Module 3, Lab 2
//	Lab Purpose/ Description: Create a program using switch and loops to implement a simple calculator

#include <iostream>
using namespace std;

int main()
{
	//declare local variables
	int procedure;
	double numOne, numTwo;
	
	do {

		//display menu options to user
		cout << "Calculator Menu:\n"
		  	 << "1. Addition\n"
		 	 << "2. Subtraction\n"
		 	 << "3. Multiplication\n"
		 	 << "4. Division\n"
			 << "0. Exit\n\n"
			 << "Enter your choice: ";
		cin >> procedure;
		
		//switch statement for calculator functions
		switch (procedure)
		{
			case 0: //exit calculator
				cout << "Exiting calculator. Goodbye!";
				break;
			case 1: //prompt user for numbers to add
				cout << "Enter the first number: ";
				cin >> numOne;
				cout << "Enter the second number: ";
				cin >> numTwo;    	
			//display results
				cout << "Result: " << numOne << " + " << numTwo << " = " 
					 << numOne + numTwo << endl << endl;
				break;
			case 2: //prompt user for numbers to subtract
				cout << "Enter the first number: ";
				cin >> numOne;
				cout << "Enter the second number: ";
				cin >> numTwo;
			//display results
				cout << "Result: " << numOne << " - " << numTwo << " = " 
					 << numOne - numTwo << endl << endl;
				break;
			case 3: //prompt for numbers to multiply
				cout << "Enter the first number: ";
				cin >> numOne;
				cout << "Enter the second number: ";
				cin >> numTwo;    	
			//display results
				cout << "Result: " << numOne << " * " << numTwo << " = " 
					 << numOne * numTwo << endl << endl;
				break;
			case 4: //prompt for numbers to divide
				cout << "Enter the first number: ";
				cin >> numOne;
				cout << "Enter the second number: ";
				cin >> numTwo;    	
			//display results
				cout << "Result: " << numOne << " / " << numTwo << " = " 
					 << numOne / numTwo << endl << endl;
				break;
			default:
				cout << "Invalid choice! Please enter a valid option.\n\n";
				break;
		} // end of switch
	
	   } while (procedure != 0); //end of do...while
	
    return 0;
}

