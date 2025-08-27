//	Author: Lane Pollock	
//	Date: 19 Feb 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: End of file controlled while loop

#include <iostream>
#include <fstream>
using namespace std;

int main()
{
	// Variables
	string aWord;
	ifstream inFile;
	
	//open input file
	inFile.open("myData.txt");
	
	while( !inFile.eof()) //while not at the end of the file
	{
		getline(inFile, aWord);
		cout << "Line in file: " <<aWord << endl;
	}
		
	//close the file
	inFile.close();
		
    return 0;
}

