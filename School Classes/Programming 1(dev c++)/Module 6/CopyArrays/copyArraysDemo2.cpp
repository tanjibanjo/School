//************************************************************************
//	Author: Lane Pollock	
//	Date:
//	Language: C++
//	Assignment: 
//	Description: demo 2 of copying arrays
//************************************************************************


#include <iostream>
#include <algorithm>
using namespace std;

//function prototypes

int main()
{
	//declare local variables
	const int ARRAY_SIZE = 5;
	string studentName[ARRAY_SIZE] = {"Kevin", "Fred", "Sally", "Cecilia", "Sam"};
	string studentName2[ARRAY_SIZE];
	string studentName3[ARRAY_SIZE];
	string studentName4[ARRAY_SIZE];
	
	//display the original array
	cout << "Let's look at the original array: \n";
	for(int i = 0; i < ARRAY_SIZE; i++)
		cout << "Student number " << i + 1 << " is " <<studentName[i] << endl;
	cout << endl;		
	
	//element by element copy
	cout << "Let's look at the second array before copy: \n";
	for(int i = 0; i < ARRAY_SIZE; i++)
		cout << "Student number " << i + 1 << " is " <<studentName2[i] << endl;
	cout << endl;
	
	//copy with for loop
	for (int i = 0; i < ARRAY_SIZE; i++)
		studentName2[i] = studentName[i];
	
	cout << "After copy:\n";
	for(int i = 0; i < ARRAY_SIZE; i++)
		cout << "Student number " << i + 1 << " is " <<studentName2[i] << endl;
	cout << endl;
	
	//now use copy() function
	cout << "Let's look at the third array before copy: \n";
	for(int i = 0; i < ARRAY_SIZE; i++)
		cout << "Student number " << i + 1 << " is " <<studentName3[i] << endl;
	cout << endl;
	
	//copy time
	copy(begin(studentName), end(studentName), begin(studentName3));
	//display
	cout << "After copy:\n";
	for(int i = 0; i < ARRAY_SIZE; i++)
		cout << "Student number " << i + 1 << " is " <<studentName3[i] << endl;
	cout << endl;
	
	//now use copy_n() function to copy all the elements to last array
	cout << "Let's look at the last array before copy: \n";
	for(int i = 0; i < ARRAY_SIZE; i++)
		cout << "Student number " << i + 1 << " is " <<studentName4[i] << endl;
	cout << endl;
	
	//copy_n()
	copy_n(begin(studentName), 5, begin(studentName4));
	
	//display
	cout << "After copy:\n";
	for(int i = 0; i < ARRAY_SIZE; i++)
		cout << "Student number " << i + 1 << " is " <<studentName4[i] << endl;
	cout << endl;
	
    return 0;
}

//function definitions