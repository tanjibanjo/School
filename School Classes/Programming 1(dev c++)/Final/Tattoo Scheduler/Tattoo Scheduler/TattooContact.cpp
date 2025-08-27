#include "TattooContact.hpp"

//define constructors
TattooContact::TattooContact(){}

TattooContact::TattooContact(const string& pName, const string& pPhone){
    name = pName;
    phoneNumber = pPhone;
    cancellations = 0;
}

TattooContact::TattooContact(const TattooContact& b){
    name = b.name;
    phoneNumber = b.phoneNumber;
    cancellations = b.cancellations;
}

TattooContact::TattooContact(const string& pName, const string& pPhone, int cancels){
    name = pName;
    phoneNumber = pPhone;
    cancellations = cancels;
}

//getters and setters
const string& TattooContact::getName() const{
    return name;
}

void TattooContact::setName(const string& pName){
    name = pName;
}

const string& TattooContact::getPhone() const{
    return phoneNumber;
}

void TattooContact::setPhone(const string& pPhone){
    phoneNumber = pPhone;
}

int TattooContact::getCancellations() const{
    return cancellations;
}

void TattooContact::setCancellations(int pCancellations){
    cancellations = pCancellations;
}

//member function
//prints tha name of the contact with a nice box around, and then info
void TattooContact::printContact() const{
    cout << setfill('_') << " ___" << setw((int)name.length()) << right << "_\n";
    
    cout << setfill(' ') << "| " << left << setw((int)name.length()) << name << " |\n";
    
    cout << setfill('-') << " ---" << setw((int)name.length()) << right << "-\n" << setfill(' ')
    << "Contact: " << phoneNumber << endl
    << "Cancellations: " << cancellations << endl;
}
