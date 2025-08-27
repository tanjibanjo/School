//************************************************************************
//	Author: Lane Pollock	
//	Date: 3 Apr 2024
//	Language: C++
//	Assignment: 
//	Description: demo of selection sort thru arrays
//************************************************************************


#include <iostream>
using namespace std;

//function prototypes
void selectionSort(int[], int);

int main()
{
	//declare local variables
	const int ARRAY_SIZE = 10;
	//initialize with unsorted list
	int list[] = {2, 56, 34, 25, 73, 46, 89, 10, 5, 16};
	
	cout << "Before sorting: \n";
	
	//output array before sort
	for(int counter = 0; counter < ARRAY_SIZE; counter++)
		cout << list[counter] << "  ";
		
	cout << endl << endl;
	
	//call the selection sort function
	selectionSort(list, ARRAY_SIZE);
	
	//print array after sort
	cout << "After sorting, the list elements are: " << endl;
	
	for(int num : list)
		cout << num << "  ";
	
    return 0;
}

//function definitions

//function to sort through array
void selectionSort(int list[], int length)
{
	//local variables
	int index, smallestIndex, location, temp;
	//iterate through array to sort in ascending order
	for(index = 0; index < length - 1; index++) //length - 1 to account for not needing to check the last value
	{
		//find location of the smallest element
		smallestIndex = index; 
		for(location = index + 1; location < length; location++) //location + 1 so that it checks vs the first value(already set)
		{
			if(list[location] < list[smallestIndex]) //if next value is less than first, the smallest index equals that location
				smallestIndex = location;
		}
			
		//move the smallest element to the front of the array 
		temp = list[smallestIndex]; //temp number stores smallest element
		list[smallestIndex] = list[index]; //first make space for the smallest element by copying the number in the index it is moving to
		list[index] = temp; //list at index now equals the smallest number
	} //end of for loop
}