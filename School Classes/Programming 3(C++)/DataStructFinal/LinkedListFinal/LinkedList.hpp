// Lane Pollock
// 13 May 2025
// Final - Linked List
// LinkedList Header file

#ifndef LinkedList_hpp
#define LinkedList_hpp

#include <stdio.h>
#include "StudentNode.hpp"
using namespace std;

class LinkedList
{
private:
    StudentNode* head; //ptr to head of list
    int length; //will hold total no. of students
    
public:
    //constructor
    LinkedList(); // sets head to nullptr
    //destructor
    ~LinkedList();
    //insert a student name to list
    void insert(const string&);
    //search for a student by name
    void search(const string&);
    //remove a student from the list
    void remove(const string&);
    //print the names of all students in list
    void printNames();
    //display count of students
    void printCount();
    //print the options for actions that can be performed
    void printMenu();
};

#endif /* LinkedList_hpp */
