//************************************************************************
//	Author: Lane Pollock	
//	Date: 10 Apr 2024
//	Language: C++
//	Assignment: 
//	Description: demo of vectors 1
//************************************************************************


#include <iostream>
#include <vector>
using namespace std;

//function prototypes

int main()
{
	//declare local variables
	vector<int> myVector;
	int sum = 0;
	double average;
	
	//add some values
	myVector.push_back(20);
	myVector.push_back(10);
	myVector.push_back(30);
	
	//calculate the average of the elements
	for(int i = 0; i < myVector.size(); i++)
		sum += myVector[i];
		
	average = (double)sum / myVector.size();
	
	cout << "Average: " << average << endl;
	
    return 0;
}

//function definitions