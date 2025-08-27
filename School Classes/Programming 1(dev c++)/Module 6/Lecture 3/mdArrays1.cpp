//************************************************************************
//	Author: Lane Pollock	
//	Date: 10 Apr 2024
//	Language: C++
//	Assignment: 
//	Description: Demo for multi dimensional arrays
//************************************************************************


#include <iostream>
using namespace std;

//function prototypes

int main()
{
	//declare local variables
	//array with 3 rows and two columns
	int x[3][2] = {{0,1}, {2,3}, {4,5}};
	
	//output each element's array value
	for(int row = 0; row < 3; row++)
	{
		for(int col = 0; col < 2; col++)
		{
			cout << "Element at my array[" << row << "][" << col<< "]: ";
			cout << x[row][col] << endl; 
		}
	}
	
    return 0;
}

//function definitions