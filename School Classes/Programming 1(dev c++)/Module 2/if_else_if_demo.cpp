//	Author: Lane Pollock	
//	Date:
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: 

//	including required library
#include <iostream>
using namespace std;

int main()
{
	/* *****************************
     Variables
     ****************************** */
    double temp;
    
    
    /* *****************************
     Input
     ****************************** */
    cout << "What is the temperature outside? ";
    cin >> temp;
    
    /* *****************************
     Processes
     ****************************** */
    if(temp>=90)
    {
    	cout << "Put shorts on, and go to the beach!\n";
	}
	else if(temp>=60)
	{
		cout << "Wear long pants if you go out.\n";
	}
	else if(temp>=20)
	{
		cout << "Bundle up, it's cold outside!\n";
	}
	else
	{
		cout << "You should stay inside today!\n";
		cout << "You could get frostbite if you go out.\n";
	}

	
    return 0;
}

