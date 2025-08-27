//************************************************************************
//	Author: Lane Pollock	
//	Date: 27 Mar 2024
//	Language: C++
//	Assignment: 
//	Description: demo of array usage to store multiple variables
//************************************************************************


#include <iostream>
using namespace std;

//function prototypes

int main()
{
	//declare local variables
	int grades[5];
	int sum = 0;
	float average;
	int highest;
	
	//ask user for grades and put into array
	for(int i = 0; i < 5; i++)
	{
		cout << "Enter the grade for student " << i+1 << ": ";
		cin >> grades[i]; //enters into array at index i value
		sum += grades[i]; //total the provided grades
	}
	
	//calculate and display the average grade
	average = sum / 5.0; //using 5.0 as a float takes away need for static casting
	cout << "The class average is: " << average << endl;
	
	//find the highest grade
	highest = grades[0];
	
	//loop throught the array to find the highest grade and display
	for(int i = 1; i < 5; i++)
	{
		if(grades[i] > highest)
			highest = grades[i];
	}
	
	cout << "The highest grade is: " << highest << endl;
	
    return 0;
}

//function definitions