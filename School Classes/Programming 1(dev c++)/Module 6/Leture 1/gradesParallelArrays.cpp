//************************************************************************
//	Author: Lane Pollock	
//	Date: 27 Mar 2024
//	Language: C++
//	Assignment: 
//	Description: parrallel array demo in a grades situation
//************************************************************************


#include <iostream>
using namespace std;

//function prototypes

int main()
{
	//declare local variables
	const int SIZE = 3;
	
	string names[SIZE] = {"Alice", "Bob", "Charlie"};
	int ids[SIZE] = {101, 102, 103};
	float grades[SIZE] = {90.5, 85.5, 88.0};
	
	//display the data
	cout << "Student data:\n";
	for(int i = 0; i < SIZE; i ++)
	{
		cout << "Name: " << names[i] << ", ID: " << ids[i]
			 << ", Grade: " << grades[i] << endl;
	}
	
	//modify the data for the student with ID 102
	for(int i = 0; i < SIZE; i++)
	{
		if(ids[i] == 102)
			grades[i] += 1.0; //bump the grade by 1
	}
	
	//display the modified data
	cout << "\nUpdated student data:\n";
	for(int i = 0; i < SIZE; i++)
	{
		cout << "Name: " << names[i] << ", ID: " << ids[i]
			 << ", Grade: " << grades[i] << endl;
	}
	
    return 0;
}

//function definitions