//************************************************************************
//  Author: Lane Pollock
//  Date: 29 Apr 2024
//  Language: C++
//  Assignment:
//  Lab Purpose/ Description: driver file for the Person2 class
//  Person2.cpp
//************************************************************************

#include "Person2.hpp"
#include <iostream>

using namespace std;

int main()
{
    //local variables
    Person2 personArray[3];
    
    cout << "Array of objects example\n";
    //populate array
    personArray[0].setName("Fred", "J.", "Flinstone");
    personArray[1].setName("Bart", "Paul", "Simpson");
    personArray[2].setName("Sam", "Reed", "Roark");
    
    //read array
    for(int i = 0; i < 3; i++)
        personArray[i].print();
    
    return 0;
}
