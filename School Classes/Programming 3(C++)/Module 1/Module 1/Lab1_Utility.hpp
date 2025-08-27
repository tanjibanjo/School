// Author: Lane Pollock
// Date: 21 Jan 2024
// Language: C++
// Assignment: Lab 1.1
// Description: Header file for the functions in Lab 1 game program
//************************************************************************

#ifndef Lab1_Utility_hpp
#define Lab1_Utility_hpp

#include <stdio.h>
#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

//struct definitions
//structure for different character types containing their attributes
struct Character {
    string name;
    int health;
    string attack; //string to print a range, but is implemented in <attack>
    int dex;
};

//structure for enemies, containing health and attack
struct Enemy{
    string name;
    int health;
    int attack;
    bool used; //flag to use so that player doesn't keep spawning same enemy back to back

};


//function prototypes
void loadEnemies(Enemy[]); //to load array with 9 enemies
void loadCharacters(Character[]); //to load 3 player chars
void welcome(); //welcome message
int getCharacter(const Character[]); //prompt and get user choice of character
void wait(const Character&); //player action
bool flee(const Character&); //player action
void attack(Character&, Enemy&); //player action
void attack(Enemy&, const Character&); //overload functions
int getEnemy(Enemy[]); //randomly choose an enemy to spawn
void play(Character&, Enemy&, float&); //simulate an encounter

#endif
