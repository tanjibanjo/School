//************************************************************************
//	Author: Lane Pollock
//	Date: 25 Mar 2024
//	Language: C++
//	Assignment: Extra credit lab 4.3
//	Lab Purpose/ Description: Create a program that prompts for and uses
//  	info from user to calculate federal tax						 
//************************************************************************

#include <iostream>
#include <iomanip>
using namespace std;


//function prototypes
void getData(char&, int&, double&, double&);
double taxIncome(char, int, double, double);
double taxAmount (double);

int main()
{
	//declare local variables
	char maritalStatus;
	int numChildren;
	double grossIncome, pensionPercent, taxableIncome;
	
	//welcome 
	cout << "Welcome to my tax calculator.\n";
	
	//call function getData to get data
	getData(maritalStatus, numChildren, grossIncome, pensionPercent);
	
	//call taxableIncome function to calculate taxable income and store
	taxableIncome = 
	taxIncome(maritalStatus, numChildren, grossIncome, pensionPercent);
	//display
	cout << fixed << showpoint << setprecision(2); //for money
	cout << "After exemptions, your taxable income is: $" << taxableIncome
		 << endl;
	
	//call function top calculate tax and display
	cout << "Your taxes are: $" << taxAmount(taxableIncome);
	
	

    return 0;
}

//function definitions

//function to prompt for and get info from user to use in tax calculations
void getData(char& marital, int& children, double& income, double& pension)
{
	//prompt user to enter marital status
	cout << "Please enter your marital status: [m/s]\n";
	cin >> marital; //store
	
	do
	{
		switch(marital)
		{ 
			case 'm': //if married
				cout << "Do you have any children under the age of 14?\n";
				cin >> children;
				cout << "Please enter your combined gross salary: \n";
				cin >> income;
				cout << "Did you contribute to a pension fund this year?\n"
					 << "Enter percentage in decimal form or 0 if no.\n"
					 << "[max = .06]: ";
				cin >> pension;
				
				//if pension is greater than .06, reprompt
				while(pension > .06)
				{
					cout << "Pension max is .06 (6%). Please re-enter "
						 << "pension percentage: ";
					cin >> pension;
				}//end of while loop
				
				cout << "Calculating...\n";
				break;
			case 's': //if single
				cout << "Please enter your gross salary: \n";
				cin >> income; //store
				cout << "Did you contribute to a pension fund this year?\n"
					 << "Enter percentage in decimal form or 0 if no.\n"
					 << "[max = .06]: ";
				cin >> pension; //store
				
				//if pension is greater than .06, reprompt
				while(pension > .06)
				{
					cout << "Pension max is .06 (6%). Please re-enter "
						 << "pension percentage: ";
					cin >> pension;
				}//end of while loop
				
				cout << "Calculating...\n";
				break;
			default: //if invalid
				cout << "Invalid input. Please enter 'm' for married or 's'"
					 << " for single.\n";
				cin >> marital; //reprompt for marital status
		}// end of switch
	}while (marital != 'm' && marital != 's');
}

//function to use the data given to calculate taxable income
double taxIncome( char marital, int children, double income, double pension)
{
	//local variables
	double taxableIncome = income;
	
	//subtract std exemption
	if(marital == 'm') //if married
		taxableIncome -= 7000;
	else //if single
		taxableIncome -= 4000;
	
	//subtract pension contributions
	taxableIncome -= (pension * income);
	
	//subtract personal exemption
	if(marital == 'm') //married status
		taxableIncome -= (3000 + (1500 * children) ); //subtracts 1500 per person
	else //single
		taxableIncome -= 1500;
	
	return taxableIncome;
	
}

//function to use the taxable income to calculate total taxes
double taxAmount(double taxableIncome)
{
	//local variables
	double tax;
	
	if (taxableIncome > 0 && taxableIncome <= 15000)
		tax = (taxableIncome * .15); //tax rate for under $15001
	else if (taxableIncome <= 40000) //income is between 15000-40000
		tax = 2250 + (.25 * (taxableIncome - 15000) ); 
	else //income is above 40000
		tax = 8460 + (.35 * (taxableIncome - 40000) );
		
	return tax;
}