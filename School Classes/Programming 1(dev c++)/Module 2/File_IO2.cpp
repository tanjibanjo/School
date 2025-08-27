//	Author: Lane Pollock	
//	Date: 12 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: 

//	including required library
#include <iostream>
#include <fstream>
#include <iomanip>
using namespace std;

int main()
{
	// create i/o file streams
	ifstream inFile; //input file stream
	ofstream outFile; //output file stream
	
	//variables
	double testOne, testTwo, testThree, testFour, testFive;
	double testAverage;
	string firstName, lastName;
	
	//open file for reading
	inFile.open("test.txt");
	
	//if file cannot be opened or is not found display error
	if( !inFile )
	{
		cout << "The file could not be opened, or wasn't found.\n";
		cout << "Program terminated.\n";
		return 1;
	}
	
	//open the output file
	outFile.open("testAverage.txt");
	
	//set the output formatting for the file stream
	outFile << fixed << showpoint << setprecision(2);
	
	//display message to user that the program is processing
	cout << "Processing data.....\n";
	
	//read the student's name
	inFile >> firstName >> lastName;
	
	//write the student's name to the file
	outFile << "Student name: " << firstName << " " << lastName << endl;
	
	//read the test scores
	inFile >> testOne >> testTwo >> testThree >> testFour >> testFive;
	
	//write the test scores to the file
	outFile << "Test Scores: " << setw(6) << testOne << setw(6) 
			<< testTwo << setw(6) << testThree << setw(6) << testFour
			<< setw(6) << testFive << endl;
			
	//compute average score
	testAverage = (testOne + testTwo + testThree + testFour + testFive) / 5;
	
	//write the average score to file
	outFile << "Average test score: " << setw(6) << testAverage << endl;
	
	//message to user that process is complete
	cout << "Processing Complete.\n";
	
	//close file
	inFile.close();
	outFile.close();
	
    return 0;
}

