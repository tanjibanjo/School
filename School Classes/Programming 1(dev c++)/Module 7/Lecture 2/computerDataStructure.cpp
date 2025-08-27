//************************************************************************
//	Author: Lane Pollock	
//	Date: 17 Apr 2024
//	Language: C++
//	Assignment: 
//	Description: Demo of structures 2 with computer data
//************************************************************************


#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

//global variables
const int ARRAY_SIZE = 3;

//structure definitions
struct ComputerType
{
	string manufacturer;
	string modelType;
	string processorType;
	int ram;
	int hardDriveSize;
	int yearBuilt;
	double price;
};

//function prototypes
void printComputerInfo(ComputerType);

int main()
{
	//declare local variables
	ComputerType computer;
	ComputerType computerArray[ARRAY_SIZE] =
	{
		{"Dell", "XPS", "intel i7", 16, 512, 2022, 987.00},
		{"Sony", "CP01", "intel i9", 32, 1000, 2021, 1254.00},
		{"Apple", "Macbook", "M2", 16, 1000, 2022, 1600.00}
	};
	
	//set output for two decimals
	cout << fixed << showpoint << setprecision(2);
	
	//get the computer info
	cout << "Enter the name of the manufacturer: ";
	getline(cin, computer.manufacturer);
	
	cout << "Enter the model of the computer: ";
	getline(cin, computer.modelType);
	
	cout << "Enter the processor type: ";
	getline(cin, computer.processorType);
	
	cout << "Enter the size of the RAM (in GB): ";
	cin >> computer.ram;
	
	cout << "Enter the size of the hard drive (in GB): ";
	cin >> computer.hardDriveSize;
	
	cout << "Enter the year the computer was built: ";
	cin >> computer.yearBuilt;
	
	cout << "Enter the price: $";
	cin >> computer.price;
	
	printComputerInfo(computer);
	
	//display information from array
	for(int i = 0; i < ARRAY_SIZE; i++)
		printComputerInfo(computerArray[i]);
	
    return 0;
}

//function definitions
//function to print the compupter info from structure
void printComputerInfo(ComputerType pComputer)
{
	//display the computer info
	cout << "\n*************************************************\n";
	cout << "Manufacturer: " << pComputer.manufacturer << endl
		 << "Model: " << pComputer.modelType << endl
		 << "Processor: " << pComputer.processorType << endl
		 << "RAM Size: " << pComputer.ram << endl
		 << "Hard Drive Size: " << pComputer.hardDriveSize<< endl
		 << "Year Built: " << pComputer.yearBuilt << endl
		 << "Price: $" << pComputer.price << endl << endl;
	
}