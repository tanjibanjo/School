//************************************************************************
//	Author: Lane Pollock	
//	Date: 4 March
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: calculate the area and perimeter of a 
// 						      rectangle and circle
//************************************************************************


#include <iostream>
using namespace std;

//global variables
const double PI = 3.1415926535;

//function prototypes
double area(int);
int area(int, int);
double area(double, double);

double perimeter(int);
int perimeter(int, int);
double perimeter(double, double);


int main()
{
	//declare local variables
	int base1 = 6, height1 = 8;
	double base2 = 2.5, height2 = 1.8;
	int radius1 = 3;
	
	//using the integer base/height, get the area and perimeter
	cout << "Passing the base and height as integers.\n";
	cout << "Area: " << area(base1, height1) << endl;
	cout << "Perimeter: " << perimeter(base1, height1) << endl;
	cout << endl;
	
	//using the double base/height, get the area and perimeter
	cout << "Passing the base and height as doubles.\n";
	cout << "Area: " << area(base2, height2) << endl;
	cout << "Perimeter: " << perimeter(base2, height2) << endl;
	cout << endl;
	
	//using the int radius, get the area and perimeter
	cout << "Passing the radius as an int.\n";
	cout << "Area: " << area(radius1) << endl;
	cout << "Circumference: " << perimeter(radius1) << endl;
	cout << endl;
	
    return 0;
}

//function definitions

//returns area as an integer based on int base and height
int area(int b, int h)
{
	return b * h;
}

//returns area as a double based on double base and height
double area(double b, double h)
{
	return b * h;
}

//returns area as a double based on int radius
double area(int r)
{
	return PI * r * r;
}

//returns perimeter as an int based on int base and height
int perimeter(int b, int h)
{
	return 2 * (b + h);
}

//returns perimeter as a double based on double base and height
double perimeter(double b, double h)
{
	return 2 * (b + h);
}

//returns perimeter as a double based on int radius
double perimeter(int r)
{
	return 2 * PI * r;
}