//
//  Car.cpp
//  CarClass
//
//  Created by Lane Pollock on 4/24/24.
//

#include "Car.hpp"
#include <iomanip>
#include <string>

using namespace std;

//definitions for the instance methods

//getters - accessors
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

//setters - mutators
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

//constructors
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
}

Car::Car()
{
    make = "Unknown Make";
    model = "Unknown Model";
    year = 2000;
    price = 0.0;
}

//instance methods
void Car::print()
{
    cout << "Make: " << make << endl
         << "Model: " << model << endl
         << "Year: " << year << endl
         << fixed << setprecision(2)
         << "Price: $" << price << endl;
}
