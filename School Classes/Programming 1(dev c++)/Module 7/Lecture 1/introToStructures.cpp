//************************************************************************
//	Author: Lane Pollock	
//	Date: 15 Apr 2024
//	Language: C++
//	Assignment: 
//	Description: intro to using structures
//************************************************************************


#include <iostream>
using namespace std;

//define structures
struct Person //PascalCase
{
	string name;
	int age;
	float height;
};

struct Address //PascalCase
{
	string city;
	string state;
};

struct Employee
{
	string name;
	Address address;
};

int main()
{
	//declare local variables
	Person person1;
	Person person2 = {"Sally", 25, 5.4}; //second way to initialize - be careful of order**
	Person person3 = {.name = "Charlie", .age = 22, .height = 5.8}; //third way to initialize - hybrid style
	
	//assign values to the structure members
	person1.name = "Kevin Roark";
	person1.age = 30;
	person1.height = 5.7f; //f designates that it is a float - specified just cause its less than 4 bytes
	
	//access and print structure members
	cout << "Name: " << person1.name << endl;
	cout << "Age: " << person1.age << endl;
	cout << "Height: " << person1.height << endl << endl;
	
	//access and print structure members
	cout << "Name: " << person2.name << endl;
	cout << "Age: " << person2.age << endl;
	cout << "Height: " << person2.height << endl << endl;
	
	//access and print structure members
	cout << "Name: " << person3.name << endl;
	cout << "Age: " << person3.age << endl;
	cout << "Height: " << person3.height << endl << endl;
	
	//nested structures
	Employee emp;
	emp.name = "Kevin Roark";
	emp.address.city = "San Antonio";
	emp.address.state = "Texas";
	
	cout << "Name: " << emp.name << endl
		 << "City: " << emp.address.city << endl
		 << "State: " << emp.address.state << endl;
	
	
    return 0;
}

//function definitions