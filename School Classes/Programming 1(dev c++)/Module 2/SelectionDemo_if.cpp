//	Author: Lane Pollock	
//	Date: 7 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: example of an if statement

//	including required library
#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	//variables
	double creditCardBalance;
	double payment;
	double balance;
	double interest = 0.0;
	const double INTEREST_RATE = 0.15; //constant interest rate per month
	
	//output for currency
	cout << fixed << showpoint << setprecision(2);
	
	//get balance from user
	cout << "Please enter the credit card balance: ";
	cin >> creditCardBalance;
	cout << endl;
	
	//get the payment from user
	cout << "Enter the payment amount: ";
	cin >> payment;
	cout << endl;
	
	//calculate the new balance
	balance = creditCardBalance - payment;
	
	//if there's a balance, calculate interest
	if(balance > 0)
	{
		interest = balance * INTEREST_RATE;
	}
		
	//output results
	cout << "The balance is: $" << balance << endl;
	cout << "The interest to be added to your"
		 << " next month's bill is: $" << interest << endl;
		
    return 0;
}

