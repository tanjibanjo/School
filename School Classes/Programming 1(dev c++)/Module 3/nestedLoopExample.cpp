//	Author: Lane Pollock	
//	Date: 21 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: multiplication table using nested loops

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	//display table header
	cout << "   |    1   2   3   4   5   6   7   8   9  10\n"
		 << "----------------------------------------------\n";
		 
	//loop through the rows in table
	for(int row = 1; row <= 10; row++)
	{
		cout << setw(2) << row << " | ";
		//loop through the columns and display the products
		for(int col = 1; col <= 10; col++)
			cout << setw(4) << row * col;
		cout << endl;
	}	// end outer loop
	
	
    return 0;
}

