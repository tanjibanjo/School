//************************************************************************
//	Author: Lane Pollock	
//	Date: 24 Apr 2024
//	Language: C++
//	Assignment: 
//	Description: header file for car class (specification)
//		car.hpp
//************************************************************************

#ifndef Car_hpp
#define Car_hpp

#include <iostream>
#include <string>

#endif

using namespace std;

class Car
{
	private:
		//instance variables
		string make;
		string model;
		int year;
		double price;
	public:
		//getter functions(accessor methods)
		string getMake() const;
		string getModel() const;
		int getYear() const;
		double getPrice() const;
		
		//setters(mutator methods)
		void setMake(string);
		void setModel(string);
		void setYear(int);
		void setPrice(double);
		
		//class methods
		void print();
		
		//constructors
		Car(string, string, int, double);
		Car(string, string, int);
		Car();
		
};