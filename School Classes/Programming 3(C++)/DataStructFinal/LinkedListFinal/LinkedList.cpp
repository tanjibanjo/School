// Lane Pollock
// 13 May 2025
// Final - Linked List
// LinkedList implementation file

#include "LinkedList.hpp"

//constructor
LinkedList::LinkedList(){
    head = new StudentNode;
    head = nullptr;
    length = 0;
}

//destructor
LinkedList::~LinkedList(){
    while(head){
        StudentNode* nodeToDelete = head;
        head = head->next;
        delete nodeToDelete;
    }
}

//function to insert a new student to the list, passing their name
void LinkedList::insert(const string& name){
    //create a new node to insert
    StudentNode* newNode = new StudentNode(name);
    //if no head, insert at head
    if(!head) {
        head = newNode;
        length++;
        cout << name << " inserted into list.\n";
    }
    else {
        //traverse the list and insert at right spot
        StudentNode* current = head;
        while(current->next)
            current = current->next;
        current->next = newNode;
        length++;
        cout << name << " inserted into list.\n";
    }
}

//function checks if the student's name exists in the list and prints an appropriate message
void LinkedList::search(const string &name){
    if(!head){
        cout << "Empty list.\n";
        return;
    }
    int index = 0;
    //if head is the student
    if(head->studentName == name){
        cout << name << " found at index " << index << endl;
        return;
    }
    else{ //traverse the rest of the list
        StudentNode* current = head;
        while(current->next){
            current = current->next; //move node along
            index++;
            //check for name
            if(current->studentName == name){
                cout << name << " found at index " << index << endl;
                return;
            }
        }
    }
    //if code gets this far, name not found
    cout << "Name not found.\n";
}

//function deletes a student from the list using name
void LinkedList::remove(const string &name){
    if(!head) {
        cout << "List is empty.\n";
        return;
    }
    //if head is the student
    if(head->studentName == name){
        StudentNode* nodeToDelete = head;
        head = head->next;
        delete nodeToDelete;
        length--; //update length
        cout << name << " removed.\n";
        return;
    }
    //traverse the list to find element
    StudentNode* current = head;
    while((current->next != nullptr) && (current->next->studentName != name)) //moves along the node if the next is not the student
        current = current->next;
    if(current->next != nullptr){
        StudentNode* nodeToDelete = current->next;
        current->next = nodeToDelete->next; //reroute the next around node to delete
        delete nodeToDelete;
        length--; //update length
        cout << name << " removed.\n";
    }
    else
        cout << name << " not found.\n";
}

//function displays all students
void LinkedList::printNames(){
    if(!head){
        cout << "Empty list.\n";
        return;
    }
    StudentNode* current = head;
    while(current != nullptr){
        cout << current->studentName << " ";
        current = current->next;
    }
    cout << endl;
}

//function prints the amount of students
void LinkedList::printCount(){
    cout << "Total number of students: " << length;
}

//function prints the available actions to perform on the list
void LinkedList::printMenu(){
    cout << "Student List Actions:\n"
         << "1 - Add Student\n"
         << "2 - Search For Student\n"
         << "3 - Remove Student\n"
         << "4 - Print Student Names\n"
         << "5 - Print Count of Students\n"
         << "0 - Exit\n.";
}
