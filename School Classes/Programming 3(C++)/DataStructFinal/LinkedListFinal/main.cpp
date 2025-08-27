//
//  main.cpp
//  LinkedListFinal
//
//  Created by Lane Pollock on 5/13/25.
//

#include "StudentNode.hpp"
#include "LinkedList.hpp"
#include <iostream>
#include <string>
using namespace std;

int main() {
    //local variables
    int* userChoice = new int(-1);
    string* nameToPass = new string;
    LinkedList* studentList = new LinkedList; //create list
    
    //print menu
    studentList->printMenu();
    
    //get user choice then switch
    while(userChoice != 0){
        cin >> *userChoice;
        
        switch(*userChoice){
            case 0:
                cout << "Goodbye.\n";
                break;
            case 1:
                cout << "Enter name to insert: ";
                getline(cin, *nameToPass);
                studentList->insert(*nameToPass);
                break;
            case 2:
                cout << "Enter name to search: ";
                getline(cin, *nameToPass);
                studentList->search(*nameToPass);
                break;
            case 3:
                cout << "Enter name to remove: ";
                getline(cin, *nameToPass);
                studentList->remove(*nameToPass);
                break;
            case 4:
                studentList->printNames();
                break;
            case 5:
                studentList->printCount();
                break;
            default:
                cout << "Invalid entry.\n";
        }
    }
    
    //clear memory
    delete userChoice;
    delete nameToPass;
    delete studentList;
    
    return 0;
}
