#include "TattooAppointment.hpp"

using namespace std;

//method definitions

//member functions
//method to print data tabular style
void TattooAppointment::printData() const{
    //local variables
    string sizeString = to_string(size);
           sizeString.resize(3);
           sizeString += "in";
    
    cout << "_____________________________________________\n";
    cout << left << setw(20) << clientName << "$" << setw(6) << price << setw(6)
    << sizeString << setw(10) << right << date << "\n*  " << description << endl;
}


//constructors
TattooAppointment::TattooAppointment(){
    clientName = "Unknown";
    description = "Unknown";
    date = "Unknown";
    price = 0.0;
    size = 0.0;
}

TattooAppointment::TattooAppointment(const string& name, const string& pDate, const string& pDescription, double pPrice, double pSize){
    clientName = name;
    date = pDate;
    description = pDescription;
    price = pPrice;
    size = pSize;
}

TattooAppointment::TattooAppointment(const TattooAppointment &b){
    clientName = b.clientName;
    date = b.date;
    description = b.description;
    price = b.price;
    size = b.size;
}

//getters and setters
void TattooAppointment::setName(const string& pName){
    clientName = pName;
}

void TattooAppointment::setDate(const string& pDate){
    date = pDate;
}

void TattooAppointment::setDescritpion(const string& desc){
    description = desc;
}

void TattooAppointment::setPrice(double pPrice){
    price = pPrice;
}

void TattooAppointment::setSize(double pSize){
    size = pSize;
}


const string& TattooAppointment::getName() const{
    return clientName;
}

const string& TattooAppointment::getDate() const{
    return date;
}

const string& TattooAppointment::getDescription() const{
    return description;
}

double TattooAppointment::getPrice() const{
    return price;
}

double TattooAppointment::getSize() const{
    return size;
}

