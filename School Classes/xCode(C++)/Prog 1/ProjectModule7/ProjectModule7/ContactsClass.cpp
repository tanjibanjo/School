//************************************************************************
//  Programming 1 Course Projects
//  Name: Lane Pollock
//  Language: C++
//  Course: ITSE-1302
//  Project Description: Comprehensive project for ITSE 1302
//  -   implementation file for Contacts Class
//  ContactsClass.cpp
//************************************************************************
#include "ContactsClass.hpp"
using namespace std;

//definitions for class methods
//getter definitions
string Contacts::getFirstName() const
{
    return firstName;
}

string Contacts::getLastName() const
{
    return lastName;
}

string Contacts::getPhoneNumber() const
{
    return phoneNumber;
}

//setter definitions
void Contacts::setFirstName(string pFirst)
{
    firstName = pFirst;
}

void Contacts::setLastName(string pLast)
{
    lastName = pLast;
}

void Contacts::setPhoneNumber(string pNumber)
{
    phoneNumber = pNumber;
}

//constructors
Contacts::Contacts(string pFirst, string pLast, string pNumber)
{
    firstName = pFirst;
    lastName = pLast;
    phoneNumber = pNumber;
}
Contacts::Contacts()
{
    firstName = "Unknown";
    lastName = "Unknown";
    phoneNumber = "Unknown";
}

//instance method definition
//function to print the Contact info
void Contacts::printContacts()
{
    cout << "Name: " << firstName << " " << lastName << endl
         << "Phone Number: " << phoneNumber << endl << endl;
}
