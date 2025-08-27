//	Author: Lane Pollock
//	Assignment: Module 1, Lab 2	
//	Date: 22 Jan 24
//	Language: C++
//	Lab Purpose: Write a program using basic input and output to convert Fahrenheit to Celsius

#include <iostream>
using namespace std;

int main()
{
	/* *****************************
     Variables
     ****************************** */
    // Used float for variables so that the conversion would be more precise and include some decimals
    
	float degreesFahrenheit;
    float degreesCelsius;
    
    /* *****************************
     Input
     ****************************** */
    // Prompt user for temperature in Fahrenheit, & store
    
	cout << "Please enter the temperature in Fahrenheit: ";
	cin >> degreesFahrenheit;
	
    /* *****************************
     Processes
     ****************************** */
     // Set equation to convert temperature to Celsius
     
	degreesCelsius = (degreesFahrenheit - 32) * 5 / 9;
    
    /* *****************************
     Output 
     ****************************** */
     // Set up display to user
     // Using float, the decimals will be included without setprecision
	
	cout << "\tThe temperature in Fahrenheit is: " << degreesFahrenheit << endl;
	cout << "\tThe temperature in Celsius is: " << degreesCelsius << endl; 
     
    return 0;
}

