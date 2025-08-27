//************************************************************************
//	Author: Lane Pollock	
//	Date: 27 Mar 2024
//	Language: C++
//	Assignment: 
//	Description: parallel arrays with functions
//************************************************************************


#include <iostream>
#include <iomanip>
using namespace std;

//function prototypes
double computeAverage(int[]);
const int ARRAY_SIZE = 5; //global variable for array size to use in all functions

int main()
{
	//declare local variables
	int studentGrades[ARRAY_SIZE]; //array for student grades
	
	//initialize array for student names
	string studentNames[ARRAY_SIZE] = 
	{"Kevin", "Fred", "Sally", "Cecilia", "Sam"};
	
	//use a loop to ask for the grades
	for(int i = 0; i < ARRAY_SIZE; i++)
	{
		cout << "Enter grade for " << studentNames[i] << ": ";
		cin >> studentGrades[i];	
	}
	
	//output the student average
	cout << showpoint << fixed << setprecision(2);
	cout << "The grade average is "
		 << computeAverage(studentGrades) << endl;
	
	
    return 0;
}

//function definitions

//function to calculate and return the average of grades
double computeAverage(int pArray[])
{
	int mySum = 0;
	for (int i = 0; i < ARRAY_SIZE; i++)
		mySum += pArray[i];
	return static_cast<double>(mySum) / ARRAY_SIZE;	 
}