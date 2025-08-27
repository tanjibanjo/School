//************************************************************************
//	Author: Lane Pollock	
//	Date: 24 Apr 2024
//	Language: C++
//	Assignment: 
//	Description: driver program to test the person class
//    main.cpp
//************************************************************************

#include <iostream>
#include "Person.hpp"
using namespace std;


int main()
{
	//local variables
	//creating instance of our class
	Person student1("Kevin", "Read", "Roark");
	
	//display the student1 data
	student1.print();
	cout << endl;
	
	//change the last name of student1
	student1.setLastName("Flinstone");
	
	//display the student1 info
	student1.print();
	cout << endl;
	
	//declare another student - all variables should be declared at top
	//this is for example purposese
	Person student2("Sam", "R", "Smith");
	
	//display the student1 data
	student2.print();
	cout << endl;
	
	
	
	return 0;
}