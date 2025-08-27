//************************************************************************
//  Author: Lane Pollock
//  Date: 18 Apr 2024
//  Language: C++
//  Assignment: Lab 7.2 - Alamo Student
//  Lab Purpose/ Description: Create a program to hold the data of 3
//   students and display their attributes and average gpa
//************************************************************************

#include <iostream>
#include <iomanip>
using namespace std;

//structure definition
struct Student
{
    string fullName;
    string bannerID;
    int age;
    double gpa;
    string email;
    string phoneNumber;
};

//function prototypes
void getInfo(Student[], int);
void displayStudents(Student[], int);
double calcAverage(Student[], int);

int main()
{
    //declare local variables
    const int ARRAY_SIZE = 3;
    //create an array of 3 to hold the student info
    Student studentArray[ARRAY_SIZE];
    
    //call function to populate array
    getInfo(studentArray, ARRAY_SIZE);
    cout << endl;
    
    //call function to display the students and their attributes
    displayStudents(studentArray, ARRAY_SIZE);
    
    //display average gpa using function call
    cout << "Average GPA: " << calcAverage(studentArray, ARRAY_SIZE);
    cout << endl << endl;
    
    return 0;
}

//function definitions

//function to loop through students, getting their attributes from user
void getInfo(Student pStudent[], int size)
{
    //loop through array to get info
    for(int i = 0; i < size; i++)
    {
        cout << "Enter info for student " << i+1 << ":\n"
             << "Full Name: ";
        getline(cin, pStudent[i].fullName);
        cout << "BannerID: ";
        cin >> pStudent[i].bannerID;
        cout << "Age: ";
        cin >> pStudent[i].age;
        cout << "GPA: ";
        cin >> pStudent[i].gpa;
        cout << "Email: ";
        cin >> pStudent[i].email;
        cout << "Phone Number: ";
        cin >> pStudent[i].phoneNumber;
        cout << endl;
        cin.ignore(); //clear input buffer before getline
    }
}

//function to display the students and their attributes
void displayStudents(Student pStudent[], int size)
{
    //loop through the array to display info neatly
    for(int i = 0; i < size; i++)
    {
        cout << "Student " << i + 1 << endl;
        cout << "-----------------------------\n";
        cout << "Name: " << pStudent[i].fullName << endl
             << "ID: " << pStudent[i].bannerID << endl
             << "Age: " << pStudent[i].age << endl
             << "GPA: " << pStudent[i].gpa << endl
             << "Email: " << pStudent[i].email << endl
             << "Phone: " << pStudent[i].phoneNumber << endl
             << "-----------------------------\n\n";
    }
}

//function to calculate and return the average gpa of students
double calcAverage(Student pStudent[], int size)
{
    //local variables
    double total = 0;
    
    //set precision for average gpa
    cout << fixed << setprecision(1);
    
    //loop through array to add to total
    for(int i = 0; i < size; i++)
        total += pStudent[i].gpa;
    
    //return average
    return total / size;
}
