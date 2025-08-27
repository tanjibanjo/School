//************************************************************************
//	Author: Lane Pollock	
//	Date: 22 Apr 2024
//	Language: C++
//	Assignment: 
//	Description: Person class header fil (specification file)
//	  Person.hpp
//************************************************************************

#ifndef Person_hpp
#define Person_hpp

#endif //person_hpp

#include <iostream>

using namespace std;

class Person
{
	public:
		//class functions/methods
		void print() const; //const means no one can change the function
		
		//setter function(method)
		void setName(string, string, string);
		void setLastName(string);
		void setFirstName(string);
		void setMiddleName(string);
		
		//getter functions
		string getFirstName() const;
		string getMiddleName() const;
		string getLastName() const;
		
		//constructor
		Person(string, string, string);
		
	private:
		string firstName;
		string middleName;
		string lastName;
}; //semicolon! like structure