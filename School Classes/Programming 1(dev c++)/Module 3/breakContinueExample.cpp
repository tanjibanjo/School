//	Author: Lane Pollock	
//	Date: 21 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: example of a break and continue

#include <iostream>
using namespace std;

int main()
{
	//this is considered bag programming standard and can be rewritten as a loop
	//local variables
	int sum, num;
	
	//while loop WITH break statement
	sum = 0;
	cin >> num;
	
	while(cin)
	{
		if(num < 0) //negative number
		{
			cout << "negative number found in data.\n";
			break;
		}
		sum += num; //keep a running total of positive numbers
		cin >> num;
	}
	
	//display total
	cout << "Total: " << sum << endl;
	
	//rewrite the while loop without the break statement
	sum = 0;
	cin >> num;
	
	while(num >= 0) // not a negative number
	{
		sum += num; //running total
		cin >> num;
		if(num < 0)
			cout << "Negative number found in data.\n";
	}
	
	//display total
	cout << "Total: " << sum << endl;
	
	cout <<" ========================= \n\n";
	
	//while loop with a continue statement - this is not useful and puts cin into fail state
	sum = 0; //reset variable
	cin >> num;
	
	while(cin)
	{
		if(num <0) // negative number
		{
			cout << "Negative number found in data.\n";
			cin >> num;
			continue;
		}
		sum += num;
		cin >> num;
	}
	
	//display total
	cout << "Total: " << sum << endl;
	
	// clear cin stream
	cin.clear();
	cin.ignore();
	
	//rewrite the loop without continue statement
	sum = 0;
	cin >> num;
	
	while(cin)
	{
		if(num >= 0)//not a negative number
			sum += num;
		else
			cout << "Negative number found in data.\n";
		cin >> num;
		
	}
		//display total
	cout << "Total: " << sum << endl;
	
    return 0;
}

