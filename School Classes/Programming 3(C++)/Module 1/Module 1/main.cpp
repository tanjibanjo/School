// Author: Lane Pollock
// Date: 21 Jan 2024
// Language: C++
// Assignment: Lab 1.1 - Create a unique program that demonstrates the concepts
//  from Programming 1
// Description: This program is a small level encounter. User can choose
//  their character with the goal of progressing through an enemy, using
//  only attack, flee, and wait to their tactical advantage
//************************************************************************

#include "Lab1_Utility.hpp"

int main() {
    //local variables
    Enemy enemies[9]; //array of different enemies
    Character characters[3]; //array of characters to choose from
    Character playerCharacter;
    Enemy encounterEnemy;
    float levelsPassed = 0.0; //float so flees can count as .5
    char *pause; //only used to pause the program
    
    //load arrays
    loadCharacters(characters);
    loadEnemies(enemies);
    
    //print welcome, and then prompt for user to choose character
    welcome();
    //assign playCharacter as reference to the corresponding choice
    playerCharacter = characters[getCharacter(characters)];
    
    //player is alive and has passed less than 5 levels
    while(playerCharacter.health > 0 && levelsPassed < 5){
        //generate enemy for the encounter
        encounterEnemy = enemies[getEnemy(enemies)];
        
        //load into encounter
        play(playerCharacter, encounterEnemy, levelsPassed);
        
        //give player stats
        cout << "Player HP remaining: " << playerCharacter.health << endl << endl;
        
        //pause 
        cout << "\nPress a character and enter to progress: ";
        pause = new char; //allocate memory space
        cin >> *pause; //read into value of pause
        delete pause; //clear memory
        
        //if player is alive and game not won
        if(playerCharacter.health > 0 && levelsPassed < 5)
            cout << "The journey continues.\n";
        //if player is dead, game over
        if(playerCharacter.health <= 0)
            cout << "GAME OVER\n\n";
        //if game has been won
        if(levelsPassed >= 5)
            cout << "You made it to paradise.\n\n";
    }
    
    
    return 0;
}
