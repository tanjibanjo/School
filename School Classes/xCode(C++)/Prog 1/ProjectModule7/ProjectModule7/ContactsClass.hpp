//************************************************************************
//  Programming 1 Course Projects
//  Name: Lane Pollock
//  Language: C++
//  Course: ITSE-1302
//  Project Description: Comprehensive project for ITSE 1302
//  -   header file for Contacts Class
//  ContactsClass.hpp
//************************************************************************


#ifndef ContactsClass_hpp
#define ContactsClass_hpp

#include <iostream>

#endif /* ContactsClass_hpp */

using namespace std;

//class definition

class Contacts
{
private:
    string firstName;
    string lastName;
    string phoneNumber;
public:
    //getter methods
    string getFirstName() const;
    string getLastName() const;
    string getPhoneNumber() const;
    
    //setter methods
    void setFirstName(string);
    void setLastName(string);
    void setPhoneNumber(string);
    
    //constructor
    Contacts(string, string, string);
    Contacts();
    
    //instance methods
    void printContacts();
};
