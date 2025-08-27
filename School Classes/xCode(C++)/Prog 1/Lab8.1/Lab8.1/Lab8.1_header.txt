//************************************************************************
//  Author: Lane Pollock
//  Date: 24 Apr 2024
//  Language: C++
//  Assignment: Lab 8.1
//  Lab Purpose/ Description: Create a Car class and prompt for data to
//    fill the class, then print the car information
//  CarClass.hpp
//************************************************************************

#ifndef CarClass_hpp
#define CarClass_hpp

#include <iostream>

#endif /* CarClass_hpp */

using namespace std;

//class definition
class Car
{
private:
    string make;
    string model;
    int year;
    double price;
public:
    //getters
    string getMake() const;
    string getModel() const;
    int getYear() const;
    double getPrice() const;
    
    //setters
    void setMake(string);
    void setModel(string);
    void setYear(int);
    void setPrice(double);
    
    //constructors
    Car(string, string, int, double);
    
    //instance methods
    void printCar();
};
