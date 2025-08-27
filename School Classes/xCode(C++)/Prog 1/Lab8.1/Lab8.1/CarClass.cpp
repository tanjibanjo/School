//************************************************************************
//  Author: Lane Pollock
//  Date: 24 Apr 2024
//  Language: C++
//  Assignment: Lab 8.1
//  Lab Purpose/ Description: Create a Car class and prompt for data to
//    fill the class, then print the car information
//  CarClass.cpp
//************************************************************************

#include "CarClass.hpp"
#include <iostream>
#include <iomanip>

using namespace std;

//method definitions for Car Class
//define method funcion <printCar> to print the car info
void Car::printCar()
{
    cout << fixed << setprecision(2); //set for money
    cout << "Make: " << make << endl << "Model: " << model << endl
         << "Year: " << year << endl << "Price: $" << price << endl;
}

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

//define setter methods
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

//define constructors
Car::Car(string pMake, string pModel, int pYear, double pPrice)
{
    make = pMake;
    model = pModel;
    year = pYear;
    price = pPrice;
}
