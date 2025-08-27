//************************************************************************
//	Author: Lane Pollock
//	Date: 7 March 2024
//	Language: C++
//	Assignment: Module 4 - Lab 2: BMI Calculator
//	Lab Purpose/ Description: Write a program that calculates the user's
//							  BMI using user-defined functions
//************************************************************************

#include <iostream>
using namespace std;

//function prototypes
void getHeightWeight(float&, int&);
float calcBMI(float, int);
void BMIClassification(float);

int main()
{
	//declare local variables
	float height, BMI;
	int weight;
	
	//call function to get height and weight
	getHeightWeight(height, weight);
	
	//call function to calculate BMI and store it in variable in main
	BMI = calcBMI(height, weight);
	
	//use BMI to call classification function
	BMIClassification(BMI);
	
    return 0;
}


//function definitions

//function to prompt and get the height and weight of user
void getHeightWeight(float& height, int& weight)
{
	//prompt user to enter height in meters
	cout << "Please enter your height in meters: ";
	cin >> height; //store
	
	cout << "Great! Now enter your weight in kg: ";
	cin >> weight; //store
}

//function to calculate BMI from height and weight, returns BMI
float calcBMI(float height, int weight)
{
	//local variables
	float BMI;
	
	//calculate BMI
	BMI = weight / (height * height);
	
	//return BMI
	return BMI;
}

void BMIClassification(float BMI)
{
	//local variables
	string category;
	
	//use BMI to categorize 
	if(BMI < 18.5)
		category = "Underweight";
	else if(BMI < 25.0)
		category = "Normal weight";
	else if(BMI < 30.0)
		category = "Overweight";
	else //BMI is over 30.0
		category = "Obese";
		
	//display results to user
	cout << "Your BMI is: "  << BMI << endl;
	cout << "You are classified as: " << category << endl;
}