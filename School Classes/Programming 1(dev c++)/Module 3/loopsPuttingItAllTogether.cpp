//	Author: Lane Pollock	
//	Date: 21 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: program combining all the ideas of module 3 together

#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

int main()
{
	//local variables
	char contFlag = 'y'; // Set LCV
	int posInt, choice, index;
	
	//loop until user enters something other than 'y'
	while(contFlag == 'y')
	{
		// get a positive integer between 0-10,000
		do {
				//prompt user for a positive int <10000
				cout << "Enter a positive integer less than 10,000: ";
				cin >> posInt;
				
		   }while( !(posInt > 0) || !(posInt < 10000) ); // while positive int is <0 or >10,000
		
	
		//print the menu for the user
		cout << "\nYou entered the number " << posInt
			 << "\nWhat would you like to do?\n";
		cout << "1 - get the factors\n"
			 << "2 - get the prime factors\n"
			 << "3 - get the square and square root\n"
			 << "[1, 2, 3]: ";
		cin >> choice;
		cout << endl;
		
		//set output formatting
		cout << setfill('.');
		
		//switch on user's choice
		switch(choice)
		{
			case 1: //get factors of the number
			        //loop through factors
			    for(index = 1; index <= posInt; index++)
				{
					if(posInt % index == 0) //check for divisibility
					    cout << setw(8) << index;
				}
				break;
			case 2: //get the prime factors of number
			    index = 1; 
			    while (index < posInt) //still a factor to check
			    {
			    	index++; //increment the factor
			    	if(posInt % index == 0) //check for divisibility
			    	{
			    		cout << setw(8) << index;
			    		posInt /= index; //decrease number by the factor
			    		index--; //decrease index to try the factor again
					}
				}
				break;
			case 3: //get the square and square root of the number
			    cout << setprecision(5); //set the number of digits shown
			    cout << posInt << " squared is: " << pow(posInt, 2) << endl
			    	 << "The square root of " << posInt << " is " << sqrt(posInt) << endl;
				break;
			default:
				cout << "Invalid choice. Try again.\n";
				break;
		} // end of switch
	
		//ask the user if they want another number
		do {
				cout << "\nDo you want to continue [y/n]: ";
				cin >> contFlag;	
		   } while(contFlag != 'y' && contFlag != 'n');
	} //end of while loop
	
    return 0;
}

