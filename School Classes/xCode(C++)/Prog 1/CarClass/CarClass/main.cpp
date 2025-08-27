//
//  main.cpp
//  CarClass
//
//  Created by Lane Pollock on 4/24/24.
//
#include "Car.hpp"
#include <iostream>

int main()
{
    cout << "Overloaded constructor example\n\n";
    
    //local variables
    Car myCar1("Honda", "Civic", 2020, 15000.00);
    Car myCar2("Ford", "Ranger", 2021);
    Car myCar3;
    
    myCar1.print();
    cout << endl;
    
    //set price for car 2
    myCar2.print();
    myCar2.setPrice(16500);
    myCar2.print();
    cout << endl;
    
    //set the attributes for car3
    myCar3.setMake("BMW");
    myCar3.setModel("X3");
    myCar3.setYear(2019);
    myCar3.setPrice(26500);
    myCar3.print();
    cout << endl;
    
    
    return 0;
}
