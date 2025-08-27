//************************************************************************
//	Author: Lane Pollock	
//	Date: 24 Apr 2024
//	Language: C++
//	Assignment: 
//	Description: implementation file for car class
//		car.cpp
//************************************************************************

#include "Car.hpp"
#include <string>
#include <iomanip>

using namespace std;

//define the getter methods
string Car::getMake() const
{
	return make;
}

string Car::getModel() const
{
	return model;
}

int Car::getYear() const
{
	return year;
}

double Car::getPrice() const
{
	return price;
}

//define the setter methods
void Car::setMake(string pMake)
{
	make = pMake;
}

void Car::setModel(string pModel)
{
	model = pModel;
}

void Car::setYear(int pYear)
{
	year = pYear;
}

void Car::setPrice(double pPrice)
{
	price = pPrice;
}

//class methods
void Car::print()
{
	cout << fixed << showpoint << setprecision(2); //money
	//display car details
	cout << "Make: " << make << endl
		 << "Model: " << model << endl
		 << "Year: " << year << endl
		 << "Price: $" << price << endl;
}

//constructors
//constructors are only called when an instance of a class is made****
Car::Car(string pMake, string pModel, int pYear, double pPrice)
{
	make = pMake;
	model = pModel;
	year = pYear;
	price = pPrice;
}

Car::Car(string pMake, string pModel, int pYear)
{
	make = pMake;
	model = pModel;
	year = pYear;
	price = 0.0;
}

Car::Car()
{
	make = "Unknown Make";
	model = "Unknown Model";
	year = 2023;
	price = 0.0;
}