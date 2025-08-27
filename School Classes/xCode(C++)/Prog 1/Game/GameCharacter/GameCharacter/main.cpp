//
//  main.cpp
//  GameCharacter
//
//  Created by Lane Pollock on 4/26/24.
//
#include "GameCharacter.hpp"
#include <iostream>

int main()
{
    //local variables
    GameCharacter char1("Sir Longdick", 75, "Wizard");
    GameCharacter char2("Liam Schmiam", 90, "Fighter");
    GameCharacter char3("Tanji Banjohnson", 100, "Rogue");
    
    //print characters
    cout << char1.printCharacter();
    cout << char2.printCharacter();
    cout << char3.printCharacter();
    
    //add to health
    char1.increaseHealth(8);
    char2.increaseHealth(10);
    char3.increaseHealth(20);
    
    //reprint
    cout << char1.printCharacter();
    cout << char2.printCharacter();
    cout << char3.printCharacter();
    
    //decrease health
    char1.decreaseHealth(10);
    char2.decreaseHealth(27);
    char3.decreaseHealth(47);
    
    //reprint
    cout << char1.printCharacter();
    cout << char2.printCharacter();
    cout << char3.printCharacter();
    
    return 0;
}
