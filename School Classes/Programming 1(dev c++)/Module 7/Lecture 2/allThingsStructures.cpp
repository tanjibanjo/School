//************************************************************************
//	Author: Lane Pollock	
//	Date: 17 Apr 2024
//	Language: C++
//	Assignment: 
//	Description: Program manages student name, program, and grades
//************************************************************************


#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

//structure definitions
struct Name
{
	string firstName;
	char middleInitial;
	string lastName;
};

struct Grades
{
	double homework;
	double midtermExam;
	double finalExam;
};

struct Student
{
	Name studentName;
	string program;
	Grades studentGrades;
};

//function prototypes
void printStudentData(Student);
void addStudentData(Student&, Name&);
void printGradesAverage(Grades);

int main()
{
	//declare local variables
	Student studentArray[3];
	Name nameEntered;
	
	//display prompt
	cout << "This program holds the name, program, and grades of three students.\n";
	
	//loop through the array getting the student data
	for(int i = 0; i < 3; i++)
	{
		//get three parts of name
		cout << "Enter the first name: ";
		cin >> nameEntered.firstName;
		cout << "Enter middle initial: ";
		cin >> nameEntered.middleInitial;
		cout << "Enter last name: ";
		cin >> nameEntered.lastName;
		
		//call function to add student data
		addStudentData(studentArray[i], nameEntered);
	}
	
	//loop through the array to display the student data
	for(int i = 0; i < 3; i++)
		printStudentData(studentArray[i]);
	
    return 0;
}

//function definitions

//function to add student data from nameEntered to array
void addStudentData(Student& pStudent, Name& pName)
{
	//set the student name values
	pStudent.studentName = pName;
	
	//get the student's program
	cout << "What program is " << pName.firstName << " in: ";
	cin.ignore(); //reset the cin buffer in case of new line char
	getline(cin, pStudent.program);
	
	//get the grades info
	cout << "Enter the homework, midterm, and final exam grades: ";
	cin >> pStudent.studentGrades.homework
		>> pStudent.studentGrades.midtermExam
		>> pStudent.studentGrades.finalExam;
	cout << endl;
}

//function to print the student data
void printStudentData(Student pStudent)
{
	//display the student name
	cout << pStudent.studentName.firstName << " "
	     << pStudent.studentName.middleInitial << ". "
	     << pStudent.studentName.lastName << "\n";
	     
	//display program
	cout << "\tProgram: " << pStudent.program << endl;
	
	//display the grades
	cout << "\t*** Grades ***\n";
	printGradesAverage(pStudent.studentGrades);
}

//function to print grade info from grades structure
void printGradesAverage(Grades pGrade)
{
	//local variables
	double courseAvg = (pGrade.homework + pGrade.midtermExam + pGrade.finalExam)
	                    / 3.0;
	//output for decimals
	cout << fixed << showpoint << setprecision(2);
	//print grade info
	cout << "\t    Homework: " << pGrade.homework << endl
	     << "\t    Midterm Exam: " << pGrade.midtermExam << endl
	     << "\t    Final Exam: " << pGrade.finalExam << endl
	     << "\t    Course Average: " << courseAvg << endl << endl;
}