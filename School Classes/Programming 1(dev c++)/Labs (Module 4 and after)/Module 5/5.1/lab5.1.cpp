//************************************************************************
//	Author: Lane Pollock
//	Date: 26 Mar 2024
//	Language: C++
//	Assignment: lab 5.1: Remove the vowels
//	Lab Purpose/ Description: Create a program that takes a user string
//		and removes all the vowels before reprinting 						 
//************************************************************************

#include <iostream>
#include <string>
using namespace std;


//function prototypes
bool isVowel(char);
void removeVowels(string);

int main()
{
	//declare local variables
	string userString;
	
	//prompt user for a string
	cout << "Please enter a string:\n";
	getline(cin, userString); //store

	cout << "String without vowels: \n";

	//call function to remove vowels and display string
	removeVowels(userString);

    return 0;
}

//function definitions

//function to take a string and check each char if vowel- then reprint
void removeVowels(string myString)
{
	//local variables
	char c;

	//go through each character and check if vowel
    //while index is less than length of string, cycle through chars
	for(int i = 0; i < myString.length(); i++) 
	{
		c = myString[i]; //grab character at index
		//call function to check if vowel
		if(!isVowel(c)) //if char is not a vowel
			cout << c; 
	}		
}

//function to take char as input and return true if they are vowels
bool isVowel(char myChar)
{
	//local variables
	bool lowercaseVowel, uppercaseVowel;
	
	//set the bools to vowels
	lowercaseVowel = (myChar == 'a' || myChar == 'e' || myChar == 'i' ||
	                  myChar == 'o' || myChar == 'u');
	uppercaseVowel = (myChar == 'A' || myChar == 'E' || myChar == 'I' ||
	                  myChar == 'O' || myChar == 'U');
	                  
	//check if the char is a vowel
	if(lowercaseVowel || uppercaseVowel) //char is a vowel
		return 1; //true
	else //char is not a vowel
		return 0; //false
}

