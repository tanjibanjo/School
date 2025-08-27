//	Author: Lane Pollock	
//	Date: 12 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: File I/O Demo

//	including required library
#include <iostream>
#include <fstream>
using namespace std;

int main()
{
	//create and open a file for writing
	ofstream myFile("testFile.txt"); //myFile is the name of stream, "testFile.txt" is the name of file
	
	//write
	myFile << "Quality is never an accident, it is always the result of intelligent efforts.\n";
	myFile << "\t --- William Foster ---";
	
	//close the file
	myFile.close();
	
	//now read the file
	//create a variable to hold the input
	string myText;
	
	//open the file for reading
	//creates file stream
	ifstream myReadFile("testFile.txt");
	
	//use a while loop to read each line of text
	while(getline(myReadFile, myText) )
	{
		cout << myText << endl;	
	}
	
	//close the file
	myReadFile.close();
	
	

    return 0;
}

