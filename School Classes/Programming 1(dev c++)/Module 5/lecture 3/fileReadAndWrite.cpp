//************************************************************************
//	Author: Lane Pollock	
//	Date: 25 Mar 2024
//	Language: C++
//	Assignment: 
//	Description: demo of reading/writing with fileio
//************************************************************************


#include <iostream>
#include <fstream>
using namespace std;

//function prototypes

int main()
{
	//open file for writing
	ofstream myOutFile("example.txt");
	
	//check if file opened successfully
	if(myOutFile.is_open())
	{
		myOutFile << "Hello, world!\n";
		myOutFile << "This is a C++ file writing example.\n";
		myOutFile.close();
	}
	else
		cout << "Unable to open for writing.\n";
	
	
	//open file for reading
	ifstream myInFile("example.txt");
	
	//check if file opens successfully
	if(myInFile.is_open())
	{
		string line;
		//read one line at a time from the filestream to line variable
		while(getline(myInFile, line))
		{
			//read each line and display
			cout << line << endl;
			
		}
		//close the file
		myInFile.close();
	}
	else
		cout << "Unable to open file.\n";
		
	//open the file for reading and writing
	fstream myIOFile("example.txt", ios::in | ios::out); //ios::in and ios::out are for reading and writing
	
	//check if file opened successfully
	if(myIOFile.is_open())
	{
		string line;
		
		while(getline(myIOFile, line))
			cout << line << endl;
			
		//move cursor back to beginning of the file before writing
		myIOFile.clear(); //clear any error flags
		myIOFile.seekp(0, ios::beg); //seekp = seek position / beg = beginnning
		
		//write to file
		myIOFile << "New content added.\n";
		
		myIOFile.close();
	}
	else
		cout << "Unable to open the file.\n";
			
    return 0;
}

//function definitions