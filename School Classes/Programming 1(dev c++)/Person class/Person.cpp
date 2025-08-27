//************************************************************************
//	Author: Lane Pollock	
//	Date: 22 Apr 2024
//	Language: C++
//	Assignment: 
//	Description: implementation file for Person class
//    Person.cpp
//************************************************************************

//include header files
#include <iostream>
#include <string>
#include "Person.hpp"


using namespace std;

//define the member functions 

//function to print the person's name
void Person::print() const
{
	cout << firstName << " " << middleName << " " << lastName;
}

//function to set all three names
void Person::setName(string first, string middle, string last)
{
	firstName = first;
	middleName = middle;
	lastName = last;
}

//function to set the last name
void Person::setLastName(string last)
{
	lastName = last;
}

//function to set the first name
void Person::setFirstName(string first)
{
	firstName = first;
}

//function to set the middle name
void Person::setMiddleName(string middle)
{
	middleName = middle;
}

//function to return the first name
string Person::getFirstName() const
{
	return firstName;
}

//function to return the middle name
string Person::getMiddleName() const
{
	return middleName;
}

//function to return the last name
string Person::getLastName() const
{
	return lastName;
}

//constructor
Person::Person(string first, string middle, string last)
{
	firstName = first;
	middleName = middle;
	lastName = last;
}