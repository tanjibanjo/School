//************************************************************************
//	Author: Lane Pollock	
//	Date: 20 March 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: demo for incuding string functions
//************************************************************************


#include <iostream>
#include <string>
using namespace std;

//global function prototypes

int main()
{
	//declare local variables
	string name = "William Jacob";
	string str1, str2, str3, str4;
	
	cout << "Name = " << name << endl;
	
	str1 = "Hello there";
	cout << "str1 = " << str1 << endl;
	
	str2 = str1;
	cout << "str2 = " << str2 << endl;
	
	cout << "str1 compared to str2: " << str1.compare(str2) << endl; //returns int 0 because they are the same
	cout << "str2 compared to str1: " << str2.compare(str1) << endl; //.compare returns integer!
	
	str1 = "Sunny";
	str2 = str1 + " Day";
	cout << "str1 = " << str1 << endl;
	cout << "str2 = " << str2 << endl;
	
	cout << "str1 compared to str2: " << str1.compare(str2) << endl; //will return the difference in int form
	cout << "str2 compared to str1: " << str2.compare(str1) << endl; //.compare returns integer!
	
	str1 = "Hello";
	str2 = "There";
	str3 = str1 + " " + str2;
	cout << "str3 = " << str3 << endl;
	
	str1 = str1 + " Mickey";
	cout << "str1 = " << str1 << endl;
	
	str1 = "Hello there";
	cout << "str1[6] = " << str1[6] << endl;
	
	str1[6] = 'T'; //replaces the character in the string at that spot
	cout << "str1 = " << str1 << endl;
	
	//input operations
	cout << "Enter a string without spaces: ";
	cin >> str1;
	
	char ch;
	cin.get(ch); //reads a new line character, clear it from buffer
	
	cout <<"The string you entered = " << str1 << endl;
	
	cout << "Enter a sentence: ";
	getline(cin, str2);
	cout << endl;
	cout << "The sentence is = " << str2 << endl;
	
    return 0;
}

//function definitions