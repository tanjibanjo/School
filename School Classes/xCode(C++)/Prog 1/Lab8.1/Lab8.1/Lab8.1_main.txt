//************************************************************************
//  Author: Lane Pollock
//  Date: 24 Apr 2024
//  Language: C++
//  Assignment: Lab 8.1
//  Lab Purpose/ Description: Create a Car class and prompt for data to
//    fill the class, then print the car information
//  main.cpp
//************************************************************************

#include "CarClass.hpp"
#include <iostream>

using namespace std;

int main()
{
    //local variables
    string carMake, carModel;
    int carYear;
    double carPrice;
    
    //prompt user for car information
    cout << "Enter make: ";
    cin >> carMake;
    cout << "Enter model: ";
    cin >> carModel;
    cout << "Enter year: ";
    cin >> carYear;
    cout << "Enter price: $";
    cin >> carPrice;
    cout << endl;
    
    //set the values in the class
    Car myCar(carMake, carModel, carYear, carPrice);
    
    //print the values to user
    myCar.printCar();
    
    return 0;
}
