//	Author: Lane Pollock	
//	Date: 28 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: function for area and perimeter of a rectangle using both pass by value/reference

#include <iostream>
using namespace std;

//function prototypes
void perimeterAndArea(int, int, int&, int&);


int main()
{
	///declare local variables
	int intBase = 6, intHeight = 8;
	int intPerimeter, intArea;
	
	cout << "FOR A RECTANGLE\n";
	
	//get the perimeter and area of the rectangle
	perimeterAndArea(intBase, intHeight, intPerimeter, intArea);
	
	//display results to user
	cout << "The perimeter is: " << intPerimeter << endl;
	cout << "The area is: " << intArea << endl;
	
    return 0;
}

//function definitions

//calculate the perimeter and area of a rectangle- sides are pass-by-value, p & a are pass-by-reference
void perimeterAndArea(int b, int h, int& p, int& a)
{
	p = 2 * (b + h); //perimeter
	a = b * h;	     //area
	//function can only return one value, so by using pass by reference we returned two values through the updated values
}