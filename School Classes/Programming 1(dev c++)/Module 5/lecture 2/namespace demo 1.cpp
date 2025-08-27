//************************************************************************
//	Author: Lane Pollock	
//	Date: 20 March 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: demo of using namespaces
//************************************************************************


#include <iostream>
using namespace std;

//global variables
int radius = 5;

//global prototypes

//define namespace
namespace square
{
	double length, width; 
	double printArea(); //this serves as a prototype - NOT GLOBAL
}

namespace circle
{
	double radius;
	double printArea(); //this serves as a prototype - NOT GLOBAL
	double printArea(double);
}

using namespace square;
using namespace circle;

//global prototypes

int main()
{
	//declare local variables
	int radius;
	
	//set values of the square namespace variables
	length = 20;
	width = 10;
	
	//display square area
	cout << "Area of a " << length << " x " << width << " square is "
	     << square::printArea() << endl;
	
	//set values for radius'
	radius = 3; //local
	circle::radius = 2; //sets within circle namespace because we are 'using namespace'^^
	
	//display the radius'
	cout << "Local radius: " << radius << endl; //dont need :: as it is within function
	cout << "Global radius: " << ::radius << endl; // just :: for globals
	cout << "Namespace radius: " << circle::radius << endl; //identify namespace
	
	//display circle's area
	cout << "Area of a circle with a radius of " << circle::radius << " is "
		 << circle::printArea() << endl;
	
	//display circle's area
	cout << "Area of a circle with a radius of " << ::radius << " is "
		 << circle::printArea(::radius) << endl;
	
	//display circle's area
	cout << "Area of a circle with a radius of " << radius << " is "
		 << circle::printArea(radius) << endl;
	
    return 0;
}

//function definitions

//function in the square namespace to calculate the area of a square
//must identify the namespace that function resides because it is not global
double square::printArea()
{
	return length * width;
}

//function in the circle namespace to calculate the area of a circle
double circle::printArea()
{
	return 3.1415926535 * radius * radius;
}

//function in the circle namespace to calculate the area of a circle
//using passed in value
double circle::printArea(double radius)
{
	return 3.1415926535 * radius * radius;
}