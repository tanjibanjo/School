//************************************************************************
//	Author: Lane Pollock	
//	Date: 27 March 2024
//	Language: C++
//	Assignment: 
//	Description: process student grades
//************************************************************************


#include <iostream>
#include <iomanip>
using namespace std;

//function prototypes
double computeAverage(int[]);


//global variables
const int ARRAY_SIZE = 5;


int main()
{
	//declare local variables
	int studentGrades[ARRAY_SIZE];
	
	//use a loop to ask for the five grades
	for(int i = 0; i < ARRAY_SIZE; i++)
	{
		cout << "Enter grade number " << (i+1) << ": ";
		cin >> studentGrades[i];
	}
	
	//output student average
	cout << showpoint << fixed << setprecision(2); //set to 2 decimal places
	//call function to get and display the grade average
	cout << "The grade average is " << computeAverage(studentGrades) << endl;
	
	
    return 0;
} //end of main

//function definitions

//function to get a display the grade average
double computeAverage(int pArray[] )
{
	//local variables
	int mySum;
	double myAverage = 0.0;
	
	//loop through the array and total the grades
	for(int i = 0; i < ARRAY_SIZE; i++)
		mySum += pArray[i];
		
	//calculate the average
	myAverage = (double)mySum / ARRAY_SIZE;
	
	return myAverage;
}