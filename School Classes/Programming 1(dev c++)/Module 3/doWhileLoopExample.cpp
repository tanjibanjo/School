//	Author: Lane Pollock	
//	Date: 19 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: create an example for a do...while loop

#include <iostream>
using namespace std;

int main()
{
	//local variables
	int rocketCount = 10; //LCV set
	
	//display header comment
	cout << "Rocket countdown...\n";
	
	//loop till we hit 0 outputting the countown
	do {
		cout << rocketCount << endl;
		rocketCount--; //decrement the counter
	   } while(rocketCount>=0);
	
	//countdown is complete at 0
	cout << "Blast off!!\n";
	
    return 0;
}

