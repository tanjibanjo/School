//************************************************************************
//	Author: Lane Pollock	
//	Date: 18 March 2024
//	Language: C++
//	Assignment: Triangle type
//	Lab Purpose/ Description: a second demo for enumerations
//************************************************************************


#include <iostream>
using namespace std;

//define enumerations
enum triangleType{ SCALENE, ISOCELES, EQUILATERAL, NOTRIANGLE };

//function prototypes
triangleType triangleShape(double, double, double);
void printShape(triangleType);

int main()
{
	//declare local variables
	double lenSide1, lenSide2, lenSide3;
	
	//get the side lengths from the user
	cout << "Enter the lengths of the three sides of a triangle: \n";
	cin >> lenSide1 >> lenSide2 >> lenSide3;
	cout << endl;
	
	cout << "The shape of the triangle is: ";
	printShape( triangleShape(lenSide1, lenSide2, lenSide3) );
	cout << endl; 
	
    return 0;
}

//function definitions

//function to determine the type of triangle based of the side lengths
//return a triangleType
triangleType triangleShape(double side1, double side2, double side3)
{
	if(side1 == side2 && side2 == side3) //equilateral
		return EQUILATERAL;
	else if ( (side1 + side2 > side3) && //check side lengths to make sure 
			  (side2 + side3 > side1) && //they form a triangle
			  (side3 + side1 > side2) )
	{
		//if two sides are the same length
		if(side1 == side2 || side2 == side3 || side1 == side3) 
			return ISOCELES;
		else //no sides are the same length
			return SCALENE;
	}
	else //not a triangle
		return NOTRIANGLE;
}

//function to print the type of triangle in string
void printShape(triangleType triangle)
{
	switch(triangle)
	{
		case SCALENE:
			cout << "scalene\n";
		    break;
		case ISOCELES:
			cout << "isoceles\n";
		    break;
		case EQUILATERAL:
			cout << "equilateral\n";
		    break;
		case NOTRIANGLE:
			cout << "not a triangle\n";
		    break;
		default:
			//case not used due to enumeration
			break;
	}
}