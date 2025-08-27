//************************************************************************
//	Author: Lane Pollock
//	Date: 10 Apr 2024
//	Language: C++
//	Assignment: Lab 6.3: Vectors
//	Lab Purpose/ Description: Write a program to prompt for numbers to
//      fill a vector, then perform manipulations on the vector	
//************************************************************************

#include <iostream>
#include <vector>
#include <algorithm> //iteration
using namespace std;



int main()
{
	//declare local variables
	vector<int> myVector;
	int newInt, searchInt, removePos, addInt, position;
	
	//prompt user to enter values into vector, stop with -1
	cout << "Please enter integers to add to the vector"
		 << " or -1 to stop.\n";
	while(newInt != -1)
	{
		cout << "Enter a new integer: ";
		cin >> newInt; //store user input
        if(newInt != -1)
			myVector.push_back(newInt); //add to vector
	}
	
	//display vector so far
	cout << endl;
	cout << "The contents of the vector are: ";

	//iterate through vector with for loop
	for(int num : myVector)
		cout << num << " ";
	cout << endl;
	
	//prompt user for a value to search the vector for
	cout << "Enter a value to search for within the vector: ";
	cin >> searchInt;
	//find the integer by iteration
	auto it = find(myVector.begin(), myVector.end(), searchInt);
	if(it != myVector.end()) //value was found
		cout << searchInt << " found at position " //return position
			 << distance(myVector.begin(), it) << endl << endl; 
	else //was not found
		cout << "Value was not found.\n\n";
	
	//prompt user for a position to remove from vector
	cout << "Enter a position to remove (0 - " 
		 << myVector.size() - 1 << "): ";
	cin >> removePos; 
	//remove value at chosen position
	myVector.erase(myVector.begin() + removePos); 
	
	//display vector updated
	cout << "After removing the value, the contents of the vector are: ";
	for(int num : myVector) //iterate through vector to display
		cout << num << " ";
	cout << endl << endl;
	
	//prompt for a value and location to insert value into the vector
	cout << "Enter a value to insert: ";
	cin >> addInt;
	cout << "Enter a position to insert to (0 - " << myVector.size()
		 << "): ";
	cin >> position;
	myVector.insert(myVector.begin() + position, addInt); //insert value to position
	
	//display the updated vector
	cout << "After inserting the value, the contents of the vector are: ";
	for(int num : myVector) //iterate through vector to display
		cout << num << " ";
	cout << endl << endl;
	

    return 0;
}

//function definitions

