//	Author: Lane Pollock
//	Date: 13 Feb 2024
//	Language: C++
//	Assignment: Lab 2.1
//	Lab Purpose/ Description: Create a program to calculate expenses of a homeowner

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	/* *****************************
     Variables
     ****************************** */
    // month, rent, electricity, water, total
    string month;
    double rent;
    double electricity;
    double water;
    double total;
    
    /* *****************************
     Input
     ****************************** */
    // prompt user to input each variable
    cout << "Please enter the month: ";
    cin >> month;
    
    cout << "Please enter your rent amount: $";
    cin >> rent;
    
    cout << "Please enter your electricity bill amount: $";
    cin >> electricity;
    
    cout << "Please enter your water bill amount: $";
    cin >> water;
    cout << endl << endl;
    
    /* *****************************
     Processes
     ****************************** */
    // add all together for total
    total = rent + electricity + water; 
    
    /* *****************************
     Output 
     ****************************** */
    // display variables left aligned, amount right aligned
   
    cout << "Your monthly expenses for " << month <<"\n";
    cout << showpoint << fixed << setprecision(2); //for money
    
    //setw(26) so it will match with header for February
    cout << left << setw(26) << "Rent: "
    	 << right << "$" << setw(7) << rent << endl;
    
    cout << left << setw(26) << "Electricity: "
    	 << right << "$" << setw(7) << electricity << endl;
    
    cout << left << setw(26) << "Water: "
    	 << right << "$" << setw(7) << water << endl;
    
    //line included for presentation purposes
    cout << "----------------------------------" << endl;
    cout << left << setw(26) << "Total: "
    	 << right << "$" << setw(7) << total 
    	 << endl << endl;
    
    return 0;
}

