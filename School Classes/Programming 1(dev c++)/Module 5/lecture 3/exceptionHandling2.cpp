//************************************************************************
//	Author: Lane Pollock	
//	Date: 25 Mar 2024
//	Language: C++
//	Assignment: 
//	Description: demo of exception handling with file io
//************************************************************************


#include <iostream>
#include <fstream>
using namespace std;

//function prototypes

int main()
{
	//declare local variables
	string studentFirstName;
	string studentLastName;
	double studentGrade = 0.0;
	double totalGrades = 0.0;
	int countOfRecords = 0;
	
	//set up file to write to
	try
	{
		ofstream studentFile("student.txt");
		
		//write records to file
		studentFile << "Sam Read 92.3\n";
		studentFile << "Fred Flinstone 89.2\n";
		studentFile << "Bart Simpson 72.5\n";
		studentFile << "Sally Smith 98.3\n";
		
		//close file
		studentFile.close();
	} //end of try
	catch(...)
	{
		cout << "Yikes - something happened - "
			 << "the file was not written.\n";
	}
	
	//end of writing file
	
	
	//now read the file
	try
	{
		ifstream studentFile("student.txt");
		
		//loop while there's more lines in file
		while(studentFile)
		{
			studentFile >> studentFirstName >> studentLastName 
					    >> studentGrade;
			//display student name
			cout << "Student: " << studentFirstName << " " << studentLastName
				 << "   Grade: " << studentGrade << endl;
			
			//sum the grades
			totalGrades += studentGrade;
			//increment the counter
			countOfRecords++;
		} //end while loop
		
		//close file
		studentFile.close();
		//calculate average grade
		cout << "Average of class is " << (totalGrades / countOfRecords)
			 << endl;
	}
	catch(...)
	{
		cout << "The file was not read.\n";
	}
	cout << endl;
    return 0;
}

//function definitions