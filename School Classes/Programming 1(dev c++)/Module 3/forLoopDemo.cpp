//	Author: Lane Pollock	
//	Date: 19 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: example of a for loop

#include <iostream>
using namespace std;

int main()
{
	//count 0-10
	for(int i = 0; i <= 10; ++i) //LCV; condition; update - all in the for statement
	
		//output value of i for each iteration
		cout << "The counter 'i' is " << i << endl;
	
	
	cout << "\n----------------------------\n\n";
	
	//output only even numbers
	for(int i = 0; i <= 20; i++)
	{
		//output number if it is even
		if (i % 2 == 0)
			cout << "The counter 'i' is " << i << endl;
	}
	
    return 0;
}

