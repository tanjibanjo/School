//************************************************************************
//	Author: Lane Pollock	
//	Date: 18 Mar 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: demo of using typeDef
//************************************************************************


#include <iostream>
using namespace std;

//define new data types
typedef unsigned int uInt; //uInt defined as an unsigned int
typedef string str; //str defined as a std::string

//function prototypes

int main()
{
	//declare local variables
	uInt num = 42; //use the uInt typedef instead of unsigned int
	str name = "John Doe"; //use str instead of std::string
	
	//display values
	cout << "Number: "<<num<<endl;
	cout << "Name: "<<name<<endl;
	
    return 0;
}

//function definitions