//  Programming 1 Course Projects
//  Name: Lane Pollock
//	Language: C++
//  Course: ITSE-1302
//  Project Description: Comprehensive project for ITSE 1302
//  Modifications:
/*     <23 Jan 24> - Added Welcome Header and prompt for user's name
              	   - Added Welcome Message to user 
       <5 Feb 24>  - Added procedure, and variables
	   			   - Prompt user for procedure choice, and added switch statement for procedure   
	   <27 Feb 24> - Built visual box around menu section, added visual formatting 
	   			   - Added option 4 to switch case, built nested for loops to output triangle
	   			   - built flag controlled loop to keep program operating until user enters 0
*/

#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    //****** Variable section *********
    
	string firstName, lastName;
    int procedure, triangleSize;
    double numOne, numTwo, gpa;
	bool doAgain = true; //LCV
	    
    //******** Welcome Section **********
   
    //Output welcome header   	
	cout << "*********************************************************\n";
	cout << "*              Programming 1 Course Project             *\n";
	cout << "*********************************************************\n";   
   
    //prompt user for first name and store   
    cout << "Please enter your first name: ";
    cin >> firstName;
    
    //prompt user for last name and store   
    cout << "Please enter your last name: ";
    cin >> lastName;
    
    //Output a welcome message to the user    
    cout << "Welcome to my course project, " << firstName << "!" << endl;
    
    cout << "*********************************************************\n";
    
    //******** Menu Section ***********
    
    while(doAgain)
    {
    
	    //prompt user to make a selection between 1-3, 0 ends program
	    cout << "|-------------------------------------------------------|\n"
			 << "| Enter 1 to calculate square root.                     |\n"
	    	 << "| Enter 2 to raise X to the Y power.                    |\n"
	    	 << "| Enter 3 to convert numberical GPA to letter grade.    |\n"
	    	 << "| Enter 4 to create a triangle.                         |\n"
			 << "| Enter 0 to end the program.                           |\n"
	    	 << "|-------------------------------------------------------|\n"
	    	 << "Enter request: ";
	    cin >> procedure;
	   
		switch(procedure)
		{
			//0 will end program
			case 0:
				cout << "Program has been terminated.\n";
				doAgain = false; //update LCV
	    		break;
	    	//1 will prompt for square root
			case 1:
	    		cout << "Enter a number to calculate square root: ";
	    	    cin >> numOne;
			    cout << "The square root of " << numOne << " is " << sqrt(numOne) << ".\n";	
			    break;
			//2 prompt for two numbers to raise
			case 2:
				cout << "Enter number X to raise to Y power.\n";
			    cout << "X: ";
			    cin >> numOne; //use as base
			    cout << "Y: ";
			    cin >> numTwo; //use as exponent
			    cout << numOne << " to the " << numTwo << " power is " << pow(numOne, numTwo) << ".\n";
			    break;
			//3 prompt for gpa, show letter grade based on gpa
			case 3:
				cout << "Enter your GPA, and it will be converted to a letter grade: ";
			    cin >> gpa;
		
		    	if (gpa > 4.0 || gpa < 0)
		    		cout << "Invalid entry.\n";
				else if (gpa < 1.00) 
		    		cout << "Awkward... you have an 'F'.\n";
			    else if (gpa < 2.00)
			    	cout << "Well, you have a 'D'.\n";
				else if (gpa < 2.67)
					cout << "You passed with a 'C'!\n";
				else if (gpa < 3.67)
					cout << "Nicely done, you have a 'B'.\n";
				else 
					cout << "Wow, you have an 'A'!\n";
				break;
			//4 build a triangle, prompt user for size
			case 4:
				cout << "Enter the size of the triangle: ";
				cin >> triangleSize;
				
				for(int row = 1; row <= triangleSize; row++)
				{
					
					for(int col = 1; col <= row; col++)
						cout << "*";
					
					cout << endl;
					
				} //end of outer loop
				break;
			//default invalid input
			default:
				cout << "Invalid.\n";
		} //end of switch
	} // end of while loop

    return 0;
}
