//Header file for functions used in TattooScheduler

#ifndef TATTOOSCHEDULER_HPP
#define TATTOOSCHEDULER_HPP
#include <vector>
#include <fstream>
#include "TattooAppointment.hpp"
#include "TattooContact.hpp"

using namespace std;
//function prototypes
void sort(vector<TattooAppointment>&);
void printMenu();
void printWelcome(bool&);
void addAppointment(vector<TattooAppointment>&, const vector<TattooContact>&);
void searchContacts(const vector<TattooContact>&);
void searchAppointments(const vector<TattooAppointment>&);
void printAppointments(const vector<TattooAppointment>&);
void addContact(vector<TattooContact>&);
bool contactExists(const vector<TattooContact>&, const string&);
void clientView();
void alterContactName(vector<TattooContact>&, vector<TattooAppointment>&);
void alterContactNumber(vector<TattooContact>&);
void alterContactCancellations(vector<TattooContact>&);
void removeAppointment(vector<TattooAppointment>&);
void save(const vector<TattooContact>&, const vector<TattooAppointment>&, const string&);
void load(vector<TattooContact>&, vector<TattooAppointment>&, const string&);
void clientNames(const vector<TattooContact>&);

#endif
