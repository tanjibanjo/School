//************************************************************************
//  Author: Lane Pollock
//  Date: 29 Apr 2024
//  Language: C++
//  Assignment:
//  Lab Purpose/ Description: implementation file for the Person2 class
//  Person2.cpp
//************************************************************************

#include "Person2.hpp"
#include <iostream>

using namespace std;

//function definitions

//member function that prints name
void Person2::print() const
{
    cout << firstName << " " << middleName << " " << lastName << endl;
}

//define setters
void Person2::setName(string first, string middle, string last)
{
    firstName = first;
    middleName = middle;
    lastName = last;
}

void Person2::setFirstName(string first)
{
    firstName = first;
}

void Person2::setMiddleName(string middle)
{
    middleName = middle;
}

void Person2::setLastName(string last)
{
    lastName = last;
}

//define getters
string Person2::getFirstName() const
{
    return firstName;
}

string Person2::getMiddleName() const
{
    return middleName;
}

string Person2::getLastName() const
{
    return lastName;
}

//constructors
Person2::Person2(string first, string middle, string last)
{
    firstName = first;
    middleName = middle;
    lastName = last;
}

Person2::Person2()
{
    firstName = "Unknown";
    middleName = "Unknown";
    lastName = "Unknown";
}
