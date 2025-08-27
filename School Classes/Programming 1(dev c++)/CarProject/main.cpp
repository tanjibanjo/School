//************************************************************************
//	Author: Lane Pollock	
//	Date: 24 Apr 2024
//	Language: C++
//	Assignment: 
//	Description: driver program to test the car class
//		main.cpp
//************************************************************************

#include <iostream>
#include "Car.hpp"

using namespace std;

int main()
{
	//local variables
	//each uses a different constructor to build the instance
	Car myCar1("Honda", "Civic", 2020, 15000);
	Car myCar2("Ford", "Ranger", 2021);
	Car myCar3;
	
	cout << "Overloaded constructor example\n\n";
	
	//display first car
	myCar1.print();
	cout << endl << endl;
	
	//display the second car, update price and redisplay
	myCar2.print();
	cout << endl;
	myCar2.setPrice(16500.00);
	myCar2.print();
	cout << endl << endl;
	
	//set info for third car
	myCar3.setModel("BMW");
	myCar3.setMake("X3");
	myCar3.setPrice(26500);
	myCar3.setYear(2019);
	myCar3.print();
	cout << endl;
	
	return 0;
}