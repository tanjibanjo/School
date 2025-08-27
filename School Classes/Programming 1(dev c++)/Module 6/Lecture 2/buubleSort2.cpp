//************************************************************************
//	Author: Lane Pollock	
//	Date:
//	Language: C++
//	Assignment: 
//	Description: bubble sort demo 2
//************************************************************************


#include <iostream>
using namespace std;

//function prototypes

void bubbleSort(int[], int);

int main()
{
	//declare local variables
	int size;
	cout << "Enter the size of the array: ";
	cin >> size;
	
	//declare array with size input
	int arr[size];
	cout << "Enter " << size << " integers for the array: \n";
	for(int i = 0; i < size; i++)
		cin >> arr[i];
		
	//print array before sort
	cout << "Array before sort: ";
	for(int i = 0; i < size; i++)
		cout << arr[i] << " ";
		
	//bubble sort the array
	bubbleSort(arr, size);
	
	//print sorted array
	cout << "Array after sorting: ";
	
	for(int i = 0; i < size; i++)
		cout << arr[i] << " ";
	
    return 0;
}

//function definitions

//function to bubble sort the array
void bubbleSort(int arr[], int size)
{
	//local variables
	int temp;
	
	for(int i = 0; i < size - 1; i++) //designates how many passes through the array
	{
		for(int j = 0; j < size - i - 1; j++) //loop to guide the individual pass themseles
		{
			if(arr[j] > arr[j + 1]) //if location j is larger than the next, move it over one
			{
				temp = arr[j]; //temp equals the larger number
				arr[j] = arr[j + 1]; //move smaller number over to the left
				arr[j + 1] = temp; //move larger number to the right
			}
		}
	}
}