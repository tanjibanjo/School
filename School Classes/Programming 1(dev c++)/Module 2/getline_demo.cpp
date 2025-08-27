//	Author: Lane Pollock	
//	Date: 5 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: Demo getline() function

//	including required library
#include <iostream>
using namespace std;

int main()
{
	/* *****************************
     Variables
     ****************************** */
    string myFullName;
    string myAddress;
    string myCityStateZip;
    
    /* *****************************
     Input
     ****************************** */
     cout << "Please enter your full name: ";
     getline(cin, myFullName);
     
     cout << "Please enter your full address: ";
     getline(cin, myAddress);
     
     cout << "Please enter your city, state, and zip: ";
     getline(cin, myCityStateZip);
     
    // display mailing label
    cout << "\n\nYour mailing label:" << endl
    	 << myFullName << endl
    	 << myAddress << endl
    	 << myCityStateZip << endl;

    return 0;
}

