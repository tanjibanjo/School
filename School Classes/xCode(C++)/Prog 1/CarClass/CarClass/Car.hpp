//
//  Car.hpp
//  CarClass
//
//  Created by Lane Pollock on 4/24/24.
//

#ifndef Car_hpp
#define Car_hpp

#include <iostream>

#endif /* Car_hpp */

using namespace std;

//CarClass definitions
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
    
    //instance methods
    void print();
    
    //constructors
    Car(string, string, int, double);
    Car(string, string, int);
    Car();
    
};
