//************************************************************************
//	Author: Lane Pollock	
//	Date: 15 Apr 2024
//	Language: C++
//	Assignment: 
//	Description: passing arrays to functions
//************************************************************************


#include <iostream>
using namespace std;

//function prototypes
void displayArray(string[], int);
void copyArray(string[], string[], int);

int main()
{
	//declare local variables
	const int ARRAY_SIZE = 5;
	string studentName[ARRAY_SIZE] = {"Kevin", "Fred", "Sally", "Cecilia", "Sam"};
	string studentName2[ARRAY_SIZE];
	
	//display original array
	cout << "Original array:\n";
	displayArray(studentName, ARRAY_SIZE);
	cout << endl;
	
	//copy array
	cout << "Copying Array...\n";
	copyArray(studentName, studentName2, ARRAY_SIZE);
	
	//display
	cout << "Copied array:\n";
	displayArray(studentName2, ARRAY_SIZE);
	
    return 0;
}

//function definitions

//function to display names in a string array
void displayArray(string pArray[], int pSize)
{
	cout << "Displaying array:\n";
	//loop to display
	for(int i = 0; i < pSize; i++)
		cout << pArray[i] << " ";
}

void copyArray(string pArray[], string pCopyArray[], int pSize)
{
	//copy element by element
	for(int i = 0; i < pSize; i++)
		pCopyArray[i] = pArray[i];
}