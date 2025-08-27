//************************************************************************
//  Programming 1 Course Projects
//  Name: Lane Pollock
//	Language: C++
//  Course: ITSE-1302
//  Project Description: Comprehensive project for ITSE 1302
//  Modifications:
/*     <23 Jan 24> - Added Welcome Header and prompt for user's name
              	   - Added Welcome Message to user 
       <5 Feb 24>  - Added procedure, and variables
	   			   - Prompt user for procedure choice, and added switch 
					  statement for procedure   
	   <27 Feb 24> - Built visual box around menu section, added visual 
	   				  formatting 
	   			   - Added option 4 to switch case, built nested for loops
					   to output triangle
	   			   - Built flag controlled loop to keep program operating 
					  until user enters 0
	   <13 Mar 24> - Take otion 3 and 4 and create user defined functions
	   			   - Create option 5 to calculate weekly pay and 
					  built calculatePay function
	   			   - Create option 6 to calculate interest acrument and 
	   			   	  built displayInterest function
	   <27 Mar 24> - Create function printHeader to display the header 
	   				  at start of program
	   			   - Create a function to get the user's name and store
	   			      using pass by reference
*/
//************************************************************************

#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;


//function prototypes
void convertGPA(float);
void displayTriangle(int);
double calculatePay(int, float);
void displayInterest(float, float);
void printHeader();
void getName(string&, string&);

int main()
{
    //****** Variable section *********
    
	string firstName, lastName;
    int procedure = -1, triangleSize, hoursWorked;
    double numOne, numTwo;
	float payRate, savingsBalance, interest, gpa;
	
    //******** Welcome Section **********
   
    //Output welcome header using printHeader function   	
	printHeader();
	
	//use getName function to prompt for and store user's name
	getName(firstName, lastName);
    
    //Output a welcome message to the user    
    cout << "Welcome to my course project, " << firstName << "!" << endl;
    
    cout << "*********************************************************\n";
    
    //******** Menu Section ***********
    //set precision for money
    cout << fixed << setprecision(2);
    
    while(procedure != 0) //while user does not choose to exit
    {
    
	    //prompt user to make a selection between 1-6, 0 ends program
	    cout << "|-------------------------------------------------------"
	    	 << "|\n"
			 << "| Enter 1 to calculate square root.                     "
			 << "|\n"
	    	 << "| Enter 2 to raise X to the Y power.                    "
	    	 << "|\n"
	    	 << "| Enter 3 to convert numberical GPA to letter grade.    "
	    	 << "|\n"
	    	 << "| Enter 4 to create a triangle.                         "
	    	 << "|\n"
			 << "| Enter 5 to calculate weekly pay.                      "
			 << "|\n"
			 << "| Enter 6 to calculate interest earned.                 "
	    	 << "|\n"
			 << "| Enter 0 to end the program.                           "
			 << "|\n"
	    	 << "|-------------------------------------------------------"
	    	 << "|\n"
	    	 << "Enter request: ";
	    cin >> procedure;
	   
		switch(procedure)
		{
			//0 will end program
			case 0:
				cout << "Program has been terminated.\n";
	    		break;
	    	//1 will prompt for square root
			case 1:
	    		cout << "Enter a number to calculate square root: ";
	    	    cin >> numOne;
			    cout << "The square root of " << numOne << " is " 
					 << sqrt(numOne) << ".\n";	
				break;
			//2 prompt for two numbers to raise
			case 2:
				cout << "Enter number X to raise to Y power.\n";
			    cout << "X: ";
			    cin >> numOne; //use as base
			    cout << "Y: ";
			    cin >> numTwo; //use as exponent
			    cout << numOne << " to the " << numTwo << " power is " 
					 << pow(numOne, numTwo) << ".\n";
				break;
			//3 prompt for gpa, show letter grade based on gpa
			case 3:
				cout << "Enter your GPA, and it will be converted to a "
					 << "letter grade: ";
			    cin >> gpa;
			    //call function for conversion
				convertGPA(gpa);
		    	break;	
			//4 build a triangle, prompt user for size
			case 4:
				cout << "Enter the size of the triangle: ";
				cin >> triangleSize;
				//call function for triangle
				displayTriangle(triangleSize);
				break;
			//5 allow user to calculate weekly pay
			case 5:
				//prompt for hours and pay rate
				cout << "Enter hours: ";
				cin >> hoursWorked;
				cout << "Pay rate: ";
				cin >> payRate;
				
				//call function to calculate weekly pay
				cout << "Weekly pay is: $"
					 << calculatePay(hoursWorked, payRate)
					 << endl;
				break;
			//6 to calculate interest acrument
			case 6:
				//prompt for initial balance and interest rate
				cout << "Enter initial balance: $";
				cin >> savingsBalance;
				cout << "Enter yearly interest rate: ";
				cin >> interest;
				
				//call function to calculate and display interest
				displayInterest(savingsBalance, interest);
				break;
			//default invalid input
			default:
				cout << "Invalid.";
		} //end of switch
	} // end of while loop

    return 0;
}



//function definitions

//function to convert gpa and display
void convertGPA(float userGPA)
{
	if (userGPA > 4.0 || userGPA < 0)
		cout << "Invalid entry.\n";
	else if (userGPA < 1.00) 
		cout << "Awkward... you have an 'F'.\n";
    else if (userGPA < 2.00)
    	cout << "Well, you have a 'D'.\n";
	else if (userGPA < 2.67)
		cout << "You passed with a 'C'!\n";
	else if (userGPA < 3.67)
		cout << "Nicely done, you have a 'B'.\n";
	else //gpa is 3.67 or above
		cout << "Wow, you have an 'A'!\n";

}

//function to create and display a triangle
void displayTriangle(int size)
{
	//if the row is less or equal to size given
	for(int row = 1; row <= size; row++)
	{
		//print a line of asterisks the size of row
		for(int col = 1; col <= row; col++) 
			cout << "*";
		//end line to move to next row	
		cout << endl;
			
	} //end of outer loop
}

//function to calculate weekly pay
double calculatePay(int hours, float pay)
{
	//local variables
	float overtimePay, regularPay;
	
	//calculate pay
	if(hours <= 40)
		regularPay = hours * pay;
	else //if more than 40 hours worked, account for overtime
		overtimePay = ( (hours - 40) * (pay * 1.5) ) + (40 * pay);
	
	//return total
	return overtimePay + regularPay;
}

//function to calculate and display interest acrument
void displayInterest(float savings, float interestRate)
{
	//local variables
	float interestAmount;
	
	for(int i = 1; i <= 5; i++) //display for years 1-5
	{	
	    //calculate the interest earned
		interestAmount =  (savings * interestRate); 
		//display total
		cout << "Year " << i << ": $" << (savings + interestAmount)
			 << endl;
		savings += interestAmount; //update the savings account
	}
}

//function to display the header in the welcome section of the program
void printHeader()
{
	cout << "*********************************************************\n";
	cout << "*              Programming 1 Course Project             *\n";  
	cout << "*********************************************************\n"; 
}

//function to prompt for and pass back first and last names of user
void getName(string& fName, string& lName)
{
	//prompt user for first name and store   
    cout << "Please enter your first name: ";
    cin >> fName;
    
    //prompt user for last name and store   
    cout << "Please enter your last name: ";
    cin >> lName;
}