// Author: Lane Pollock
// Content: Contacts class to store the name, phone number, and number of cancellations of clients
// Purpose: To allow for easy sorting and tracking of cancellations between many apointments of the same client easier
//          - link many appointments to one client

#ifndef TATTOOCONTACT_HPP
#define TATTOOCONTACT_HPP

#include <iostream>
#include <iomanip>

using namespace std;

class TattooContact
{
private:
    //instance variables
    string name = "unknown";
    string phoneNumber = "unknown";
    int    cancellations = 0;
    
public:
    //constructors
    TattooContact(); //default
    TattooContact(const string&, const string&); //for new clients
    TattooContact(const string&, const string&, int);
    TattooContact(const TattooContact&); //copy
    
    //getters & setters
    const string& getName() const;
    void setName(const string&);
    
    const string& getPhone() const;
    void setPhone(const string&);
    
    int getCancellations() const;
    void setCancellations(int);
    
    //public methods
    void printContact() const;
    
};


#endif
