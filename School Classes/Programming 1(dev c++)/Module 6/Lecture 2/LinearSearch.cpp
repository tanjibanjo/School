//************************************************************************
//	Author: Lane Pollock	
//	Date: 3 Apr 2024
//	Language: C++
//	Assignment: 
//	Description: Linear searching through arrays
//************************************************************************


#include <iostream>
using namespace std;

//function prototypes
int linearSearch(int[], int, int); 

int main()
{
	//declare local variables
	int numbers[] = { 2, 4, 7, 10, 11, 32, 45, 87}; //array of numbers
	int arraySize;
	int value, valueIndex;
	
	
	//calculate the size of the array
	arraySize = sizeof(numbers) / sizeof(numbers[0]); //returns bytes, ints are 4 each
	
	//output the numbers in the array
	cout << "NUMBERS: [ "; 
	for(int num : numbers)
		cout << num << "  ";
	cout << "]\n";
	
	//prompt user for a number to search for
	cout << "Enter an integer value: ";
	cin >> value;
	
	//perform a linear search to find the value
	//function call
	valueIndex = linearSearch(numbers, arraySize, value);
	
	//if desired value not found
	if (valueIndex == -1)
		cout << value << " was not found.";
	else //value was found
	{
		cout << "Found " << value << " at index " << valueIndex << ".\n";
	}
	
	
    return 0;
}

//function definitions

//function to search an int array for specific value returns index value or -1
int linearSearch(int nums[], int size, int find)
{
	//iterate through array to find the number
	for(int i = 0; i < size; i++)
	{
		if(nums[i] == find) //if number is found
			return i;		//return the index where it was found
	}
	return -1; //return -1 if number is not found
		
}
