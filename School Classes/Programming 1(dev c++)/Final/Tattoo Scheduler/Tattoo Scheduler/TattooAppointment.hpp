#ifndef TATTOOAPPOINTMENT_HPP
#define TATTOOAPPOINTMENT_HPP

#include <iostream>
#include <iomanip>
#include <string>

using namespace std;

class TattooAppointment {
public:

    
    //constructors
    //default
    TattooAppointment();
    //new client - sets cancellations to 0
    TattooAppointment(const string&, const string&, const string&, double, double);
    //copy
    TattooAppointment(const TattooAppointment&);
        //by reference so we don't assign pointers to new obj
    
    //getters and setters
    void setName(const string&);
    void setDescritpion(const string&);
    void setDate(const string&);
    void setPrice(double);
    void setSize(double);
    
    const string& getName() const;
    const string& getDescription() const;
    const string& getDate() const;
    double getPrice() const;
    double getSize() const;
    
    //member methods
    void printData() const;

private:
    string clientName, description, date;
    double price, size;
    
};


#endif
