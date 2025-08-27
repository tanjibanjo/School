//************************************************************************
//  Author: Lane Pollock
//  Date: 18 Apr 2024
//  Language: C++
//  Assignment: Lab 7.1 - Car Lot
//  Lab Purpose/ Description: Make a program to hold and display the info
//    of a car lot, using a structure
//************************************************************************

#include <iostream>
#include <iomanip>
using namespace std;

//structure definition
struct Car
{
    string make;
    string model;
    int year;
    double price;
};

//function prototypes
void displayInventory(Car[], int);
void displayTotal(Car[], int);

int main()
{
    //declare local variables
    const int ARRAY_SIZE = 5;
    Car carArray[ARRAY_SIZE];
    
    //populate the car array
    carArray[0] = {"Nissan", "Sentra", 2018, 15000};
    carArray[1] = {"Subaru", "Crosstrek", 2020, 23000};
    carArray[2] = {"Ford", "Escape", 2008, 7000};
    carArray[3] = {"Mazda", "BX3000", 1998, 4000};
    carArray[4] = {"Ford", "Fusion", 2024, 19000};
    
    //call function to display the entire inventory of cars
    displayInventory(carArray, ARRAY_SIZE);
    
    //call function to display the total value of the cars
    //display the result
    displayTotal(carArray, ARRAY_SIZE);

    return 0;
}

//function definitions

//function to display the inventory of the lot, formatted nicely
void displayInventory(Car pCar[], int size)
{
    //set decimals for money
    cout << fixed << setprecision(2);
    
    //display the cars and their attributes
    //header
    cout << "--------------------------------------------------\n"
         << "|Make        Model       Year        Price       |\n"
         << "--------------------------------------------------\n";
    //loop through aray
    for(int i = 0; i < size; i++)
    {
        cout << "|" << left << setw(12) << pCar[i].make << setw(12)
             << pCar[i].model << setw(12) << pCar[i].year << "$"
             << setw(11) << pCar[i].price << "|" << endl;
    }
    
    //close the table
    cout << "--------------------------------------------------\n";
}

//function to calculate and display the total value of the cars
void displayTotal(Car pCar[], int size)
{
    //local variables
    double total = 0;
    
    //loop through the array to add to total
    for(int i = 0; i < size; i++)
        total += pCar[i].price;
        
    cout << "Total Value of Lot: $" << total << endl << endl;
}
