//************************************************************************
//  Author: Lane Pollock
//  Date: 29 Apr 2024
//  Language: C++
//  Assignment:
//  Lab Purpose/ Description: header file for the Person2 class
//  Person2.hpp
//************************************************************************

#ifndef Person2_hpp
#define Person2_hpp

#include <iostream>

#endif /* Person2_hpp */

using namespace std;

class Person2
{
public:
    //class methods
    void print() const;
    
    //setters
    void setName(string, string, string);
    void setFirstName(string);
    void setMiddleName(string);
    void setLastName(string);
    
    //getters
    string getFirstName() const;
    string getMiddleName() const;
    string getLastName() const;
    
    //constructors
    Person2(string, string, string);
    Person2();
    
private:
    //attributes
    string firstName;
    string middleName;
    string lastName;
};
