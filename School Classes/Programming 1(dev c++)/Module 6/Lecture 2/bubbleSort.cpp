//************************************************************************
//	Author: Lane Pollock	
//	Date: 3 apr 2024
//	Language: C++
//	Assignment: 
//	Description: demo for bubble sorting
//************************************************************************


#include <iostream>
using namespace std;

//function prototypes
void bubbleSort(int[], int);
void printArray(int[], int);

int main()
{
	//declare local variables
	int arr[] = {64, 34, 25, 12, 22, 11, 90};
	int n = sizeof(arr)/sizeof(arr[0]); //size 
	
	//unsorted array
	cout << "Unsorted array: \n";
	printArray(arr, n);
	
	//call function to sort array
	bubbleSort(arr, n);
	
	//now print sorted array
	cout << "Sorted array: \n";
	printArray(arr, n);
	
		
    return 0;
}

//function definitions

//function to print array
void printArray(int list[], int size)
{
	//iterate through array displaying values
	for(int i = 0; i < size; i++)
		cout << list[i] << "  ";
	
	cout << endl << endl;
}

//function to sort array through bubblesort
void bubbleSort(int list[], int size)
{
	//iterate through the array
	for(int i = 0; i < size - 1; i++) //size -1 bc the last number will already be sorted from previous sort
	{
		//last i elements are already in place
		for(int j = 0; j < size - i - 1; j++)
		{
			//swap if element found is greater than the next element
			if(list[j] > list[j+1])
			{
				int temp = list[j]; //temp equals the greater element
				list[j] = list[j+1]; //make space for swap
				list[j+1] = temp; //greater value moves back to next spot
			} //end if
		} //end inner loop
	} //end outer loop
}