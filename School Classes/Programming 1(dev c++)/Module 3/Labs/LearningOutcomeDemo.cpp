//	Author: Lane Pollock	
//	Date:
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: code for learning outcome 3

#include <iostream>
using namespace std;

int main()
{
	///declare local variables
	int largestNumber = 0, newNumber;

	//prompt user for number
	cout << "Enter a positive integer or 0 to quit: ";
	cin >> newNumber;
	
	while(newNumber != 0)
	{
		if(newNumber > 0) //number is positive
		{
			{
				largestNumber = (newNumber > largestNumber) ? newNumber: largestNumber;
				cout << "The largest number in sequence is: " << largestNumber << endl << endl;
				
				//prompt for new number or quit
				cout << "Please enter another number or 0 to quit.\n";
				cin >> newNumber;
			}
			
		}
		else //pumber is negative
		{
			cout << "You entered a negative number. Please enter a positive integer or 0 to quit: ";
			cin >> newNumber;
		}
	} //end whlie statement
	
	cout << endl << "Goodbye.\n";
	
    return 0;
}

