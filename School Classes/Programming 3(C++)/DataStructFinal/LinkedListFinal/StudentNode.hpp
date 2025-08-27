// Lane Pollock
// 13 May 2025
// Final - Linked List
// StudentNode holds a student name and ptr to next

#ifndef StudentNode_hpp
#define StudentNode_hpp

#include <stdio.h>
#include <iostream>
using namespace std;

class StudentNode
{
public:
    string studentName;
    StudentNode* next;
    //constructor
    StudentNode(const string& name = "none");
};

#endif /* StudentNode_hpp */
