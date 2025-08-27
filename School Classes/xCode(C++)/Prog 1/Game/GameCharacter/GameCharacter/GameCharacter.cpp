//
//  GameCharacter.cpp
//  GameCharacter
//
//  Created by Lane Pollock on 4/26/24.
//

#include "GameCharacter.hpp"
using namespace std;

//function definitions

//getters
string GameCharacter::getName() const
{
    return name;
}

string GameCharacter::getType() const
{
    return type;
}

int GameCharacter::getHealth() const
{
    return health;
}

//setters
void GameCharacter::setName(string pName)
{
    name = pName;
}

void GameCharacter::setHealth(int pHealth)
{
    health = pHealth;
}

void GameCharacter::setType(string pType)
{
    type = pType;
}

//constructors
GameCharacter::GameCharacter(string pName, int pHealth, string pType)
{
    name = pName;
    health = pHealth;
    type = pType;
}

//method instances
string GameCharacter::printCharacter()
{
    //local variables
    string sHealth = to_string(health);
    
    return name + " " + type + " " + sHealth + "\n";
}

void GameCharacter::increaseHealth(int addHealth)
{
    health += addHealth;
}

void GameCharacter::decreaseHealth(int decreaseHealth)
{
    health -= decreaseHealth;
}
