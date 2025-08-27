#include <iostream>
#include <ctime>

using namespace std;

//function definitions

//function to fill the array with 10 random numbers
void fillArray(int arr[], int SIZE)
{
	//seed the random generator
	srand( time(NULL) ); //will always be different
	
	//loop through the array and populate with random numbers 1-100
	for(int i = 0; i < SIZE; i++)
		arr[i] = (rand() % 99) + 1; //nudge 1 over so 0 isn't included
}

//function that prints the elements of the array
void displayArray(int arr[], int SIZE)
{
	//loop through array to display the elements
	for(int i = 0; i < SIZE; i++)
		cout << arr[i] << " ";
	
	cout << endl;
}

//function that finds and returns the sum of the array
int findSum(int arr[], int SIZE)
{
	//local variables
	int sum;
	
	//loop through array to add to sum
	for(int i= 0; i < SIZE; i++)
		sum += arr[i]; //add to total
	
	return sum; //return the sum
}

//function that finds and returns the highest number in the array
int highestNumber(int arr[], int SIZE)
{
	//local variables
	int highest = arr[0];
	
	//loop through array to find the highest number
	for(int i = 1; i < SIZE; i++)
	{
		if(arr[i] > highest) //if number is higher, replace
			highest = arr[i];
	}
	
	//return highest value
	return highest;
}

//function that finds and returns the lowest number in the array
int lowestNumber(int arr[], int SIZE)
{
	//local variables
	int lowest = arr[0];
	
	//loop through array to find the lowest number
	for(int i = 1; i < SIZE; i++)
	{
		if(arr[i] < lowest) //if number is lower, replace
			lowest = arr[i];
	}
	
	//return lowest value
	return lowest;
}

//function to sort the array with bubble sort algorithm
void bubbleSort(int arr[], int SIZE)
{
	//local variables
	int temp;
	
	//nested for loops to sort the array
	for(int i = 0; i < SIZE -1; i++) //dictates how many total passes
	{
		for(int j = 0; j < SIZE - i - 1; j++) //algorithm of each pass
		{
			if(arr[j] > arr[j+1]) //if first element is higher
			{
				temp = arr[j]; //store larger number
				arr[j] = arr[j +1]; //move smaller number forward
				arr[j+1] = temp; //move larger number back
			} //end if
		} //end inner for
	} //end outer for
}