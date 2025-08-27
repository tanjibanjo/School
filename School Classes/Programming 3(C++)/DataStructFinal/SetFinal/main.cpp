// Lane Pollock
// 13 May 2025
// Final - Part One
// Define two sets of names, then perform set operations on them

#include <iostream>
#include <set>
#include <vector>
using namespace std;

int main() {
    //define a couple sets
    set<string> mathClass = {"Sam", "Bob", "Charlie", "Diana", "Ed",  "Freddy", "George", "Hannah", "Ian", "Julia"};
    set<string> programmingClass = {"Karen", "Sam", "Maria", "Nathan", "Sue","Paul", "Elle", "Sam", "Bob", "Charlie", "Cecilia"};
    //local variables
    vector<string> resultList(mathClass.size() + programmingClass.size()); //vector to hold the results for our set operations
    int numUniqueStudents = 0;
    int numCommonStudents = 0;
    
    //print all the names of students in each class
    cout << "Students in math class:\n";
    for(const auto& student : mathClass)
        cout << student << " ";
    cout << endl << endl;
    
    cout << "Students in programming class:\n";
    for(const auto& student : programmingClass)
        cout << student << " ";
    cout << endl << endl;
    
    //display the unique students across all classes
    //create iterator and initialize it
    auto it = set_union(mathClass.begin(), mathClass.end(), programmingClass.begin(), programmingClass.end(), resultList.begin());
    resultList.resize(it - resultList.begin()); //resize to fit
    cout << "All unique students in the classes (union):\n";
    for(const auto& student: resultList){
        cout << student << " ";
        numUniqueStudents++;
    }
    cout << endl << endl;
    
    //display students in both classes (Intersection)
    resultList.clear();
    resultList.resize(mathClass.size() + programmingClass.size());
    it = set_intersection(mathClass.begin(), mathClass.end(), programmingClass.begin(), programmingClass.end(), resultList.begin());
    resultList.resize(it - resultList.begin());
    
    cout << "Students that are in both classes (intersection):\n";
    for(const auto& student : resultList){
        cout << student << " ";
        numCommonStudents++;
    }
    cout << endl << endl;
    
    //display students in math, but not programming
    resultList.clear();
    resultList.resize(mathClass.size() + programmingClass.size());
    it = set_difference(mathClass.begin(), mathClass.end(), programmingClass.begin(), programmingClass.end(), resultList.begin());
    resultList.resize(it - resultList.begin());
    
    cout << "Students only in math (difference math - programming):\n";
    for(const auto& student : resultList)
        cout << student << " ";
    cout << endl << endl;
    
    //display students only in programming
    resultList.clear();
    resultList.resize(mathClass.size() + programmingClass.size());
    it = set_difference(programmingClass.begin(), programmingClass.end(), mathClass.begin(), mathClass.end(), resultList.begin());
    resultList.resize(it - resultList.begin());
    
    cout << "Students only in programming (difference programming - math):\n";
    for(const auto& student : resultList)
        cout << student << " ";
    cout << endl << endl;
    
    //display the number of unique and common students
    cout << "Number of unique students: " << numUniqueStudents << endl;
    cout << "Number of common students: " << numCommonStudents << endl;
    
    return 0;
}
