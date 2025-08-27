//************************************************************************
//	Author: Lane Pollock
//	Date: 15 Apr 2024
//	Language: C++
//	Assignment: 
//	Description: demo of copying arrays using different functions(3 ways)
//************************************************************************


#include <iostream>
#include <algorithm>
using namespace std;

//function prototypes

int main()
{
	//declare local variables
	int src[] = {1, 2, 3, 4, 5};
	int dest[5];
	
	//loop through the array copying elements
	//copy method 1
	for(int i = 0; i < 5; i++)
		dest[i] = src[i];
		
	//display the new array
	for(int num : dest)
		cout << num << " ";
	
	cout << endl;
	
	//-----------------------------------------
	int src2[] = {6, 7, 8, 9, 10};
	int dest2[5];
	
	//copy method 2
	copy(begin(src2), end(src2), begin(dest2));
	
	//display
	for(int num : dest2)
		cout << num << " ";
	
	cout << endl;
	
	//-----------------------------------------
	int src3[] = {11, 12, 13, 14, 15};
	int dest3[5];
	
	//copy_n third method
	copy_n(begin(src3), 5, begin(dest3));
	
	//display
	for(int num : dest3)
		cout << num << " ";
	
	cout << endl;
	
	
    return 0;
}

//function definitions
