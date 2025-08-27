//************************************************************************
//	Author: Lane Pollock	
//	Date: 20 March 2024
//	Language: C++
//	Assignment: 
//	Lab Purpose/ Description: demo 2 of string functions
//************************************************************************


#include <iostream>
#include <string>
using namespace std;

//function prototypes

int main()
{
	//declare local variables
	string str1, str2, str3;
	string school = "Computer Science";
	string course;
	
	str1 = "C++";
	str2 = "Programming";
	course = str1 + " " + str2;
	cout << "School: " << school << "\nCourse: " << course << endl;
	
	cout << "Character at index 5: " << course[5] << endl;
	
	cout << "Is str2 empty? [0-false, 1-true]: " << str2.empty() << endl;
	cout << "Is str3 empty? [0-false, 1-true]: " << str3.empty() << endl;
	str2.clear();
	cout << "Is str2 empty? [0-false, 1-true]: " << str2.empty() << endl;

	cout << "How long is school: " << school.length() << endl;
	cout << "How long is course: " << course.length() << endl;
	cout << "What is the size of str1: " << str1.size() << endl;
	cout << "What is the size of school: " << school.size() << endl;
	
	school.erase(12, 4);
	school.erase(4,4);
	cout << "School after erase: " << school << endl << endl;
	
	str1 = "The quick brown fox";
	str2 = "quick";
	cout << str1 << endl;
	cout << "Where does brown start? " << str1.find("brown") << endl;
	
	cout << "Where does str2 (quick) start? " << str1.find(str2) << endl;
	
	cout << "The first 'o' is at: " << str1.find("o") << endl;
	cout << "The next 'o' is at: " << str1.find("o", 13) << endl; //start searching at index 13!!
	
	str3 = str1.substr(4,5); // start at index 4, get 5 characters
	cout << "Substring of str1: " << str3 << endl;
	
	school.insert(4, "uter");
	cout << "School after insert: " << school << endl;
	school.insert(8, 3, '-'); //at index 8, insert 3 characters, of this type ('-')
	cout << "School after second insert: " << school << endl;
	school.append(5, '!'); //adds 5 of '!' chars at end of string
	cout << "School after append: " << school << endl;
	school.replace(12, 3, "Engineering") //start at index 12, replace the 3 characters with "engineering"
	cout << "School after replace: " << school << endl;
	
    return 0;
}

//function definitions