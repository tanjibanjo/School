// Author: Lane Pollock
// Date: 21 Jan 2024
// Language: C++
// Assignment: Lab 1.1
// Description: Implementation file for the functions in Lab 1 game program
//************************************************************************

#include "Lab1_Utility.hpp"

//function definitions

//function that takes the enemy array, then loads 9 enemies
void loadEnemies(Enemy pEnemies[]){
    //declare enemies of different stats then load
    pEnemies[0] = {"Wolf", 50, 10, 0};
    pEnemies[1] = {"Giant Spider", 90, 30, 0};
    pEnemies[2] = {"Unicorn", 1, -20, 0}; //this one gives back health
    pEnemies[3] = {"Demon", 65, 25, 0};
    pEnemies[4] = {"Orc", 45, 20, 0};
    pEnemies[5] = {"Orc Leader", 80, 40, 0};
    pEnemies[6] = {"Goblin", 35, 15, 0};
    pEnemies[7] = {"Swordsman", 50, 25, 0};
    pEnemies[8] = {"Greedy Villager", 20, 20, 0};
}

//function that takes array and loads 3 characters
void loadCharacters(Character pCharacters[]){
    //declare characters of different types and load
    pCharacters[0] = {"Mage", 50, "20-60", 40};
    pCharacters[1] = {"Rogue", 65, "0-25 x2", 75};
    pCharacters[2] = {"Warrior", 80, "35-50", 50};
}

//function that prints startup message to user
void welcome(){
    //print welcome message
    cout << "Welcome to the game. Control your character through random interactions to win.\n"
    << "You may flee, fight, or wait. The right choice depends on your character and enemy. Good luck!\n\n";
}

//function that prompts user to choose a character and returns the index of chosen character
int getCharacter(const Character pCharacters[]){
    //local variables
    int choice;
    
    for(int i = 0; i < 3; i++){
        cout << pCharacters[i].name << "\n\tHealth: " << pCharacters[i].health << "\n\tAttack: "
        << pCharacters[i].attack << "\n\tDexterity: " << pCharacters[i].dex << endl;
    }
    
    cout << "Please choose a character.[1-3]\n";
    cin >> choice;
    
    //print char
    cout << "You have chosen " << pCharacters[choice - 1].name << endl;
    
    return choice -1; //decrement to index
}

//function for player's 'wait' combat choice
void wait(const Character& pCharacter){
    cout << pCharacter.name << " waits.\n\n";
}

//function for player 'flee' choice
//function will take ref to playerChar, and then return T/F for success based on dexterity
bool flee(const Character& pCharacter){
    //local variables
    int randNum;
    
    //seed the random gen
    srand(time(0));
    
    //generate a number between 0-100
    randNum = (rand() % 101);
    
    if(randNum >= pCharacter.dex){ //if dex is 85, then this will represent an 85% success chance
        cout << "Flee unsuccesfull.\n";
        return false; //flee not successful
    }
    else{
        cout << "Flee successfull.\n";
        return true; //flee successful
    }
}

//functions following are for attack, overloaded based on whom is attacking whom

//this attack is for enemy to player
//takes attack of enemy and applies it to player health
void attack(Character & pCharacter, Enemy& pEnemy){
    //the unicorn gives health, so we can skip this if it is the current enemy
    if(pEnemy.name != "Unicorn"){
        //local variables
        int enemyAttack;
        
        //seed random number gen
        srand(time(0));
        
        //generate an enemy attack, using the generator to create a range of possible numbers
        //if attack is 10, range will be 6-11 || if attack is 30, range is 16-31
        enemyAttack = 1 + (rand() % (pEnemy.attack / 2) ) + (pEnemy.attack / 2);
        
        //apply the attack to player character
        pCharacter.health -= enemyAttack;
        
        //update player
        cout << "Enemy attacks for " << enemyAttack << " damage. Player HP at "
        << ((pCharacter.health < 0) ? 0 : pCharacter.health) << endl;
    }
    else if(pEnemy.name == "Unicorn") {//if enemy is unicorn, apply health boost
        pCharacter.health -= pEnemy.attack;
        
        //update
        cout << "The Unicorn slowly approaches, glowing bright. As you touch its horn, you feel warm.\n"
        << "\tThe next thing you know, you're waking up on the floor but feeling surprisingly good.\n\n";
        
        //decrease unicorn health to 0 to end encounter
        pEnemy.health--;
    }
}

//this is attack from player to enemy
void attack(Enemy& pEnemy, const Character& pCharacter){
    //local variables
    int playerAttack;
    
    //seed random number gen
    srand(time(0));
    
    //depending on character, generate attack based on set range
    if(pCharacter.name == "Mage"){ //20-60
        playerAttack = (rand() % 41) + 20;
    }
    else if(pCharacter.name == "Rogue"){ //0-25 x2
        playerAttack = (rand() % 26) + (rand() % 26);
    }
    else //(pCharacter.name == "Warrior")35-50
        playerAttack = (rand() % 21) + 30;
    
    //apply attack
    pEnemy.health -= playerAttack;
    
    //update player
    cout << "Player attacks for " << playerAttack << " damage. Enemy HP at "
    << ((pEnemy.health < 0) ? 0 : pEnemy.health ) << endl;
    
}


//function generates a random number between 0-8 to be used as index of a random enemy
int getEnemy(Enemy pEnemies[]){
    //local variables
    int index;
    
    //seed rand gen
    srand(time(0));
    
    //generate
    index = (rand() % 9);
    
    while(pEnemies[index].used == true)
        //if enemy has already been faced, choose a different one
        index = (rand() % 9);
    
    //print enemy info
    cout << "\nYour enemy is " << pEnemies[index].name << "\nHP: " << pEnemies[index].health
    << "\nAttack: " << pEnemies[index].attack << endl;
    
    return index;
}

//function takes ref to player and enemy, and simulates the actual encounter
void play(Character& pCharacter, Enemy& pEnemy, float& level){
    //local variables
    int actionChoice;
    bool fleeAttempt = false; //true meaning flee is successful
    
    //terms of encounter
    //player will always go first in this demo
    while(pCharacter.health > 0 && pEnemy.health > 0 && fleeAttempt != true){ //at least one is alive and not fled
        //get choice from character
        
        cout << "\n1 - Attack\n2 - Flee\n3 - Wait\nEnter action: ";
        cin >> actionChoice;
        
        //switch on the action from player
        switch(actionChoice){
            case 1: //attack
                attack(pEnemy, pCharacter);
                break;
            case 2: //flee
                if (flee(pCharacter) == true)
                    fleeAttempt = true;
                break;
            case 3:
                wait(pCharacter);
                break;
            default:
                cout << "Turn was lost.";
                break;
        } //end switch on actionChoice
        
        //enemy turn
        if(fleeAttempt != true && pEnemy.health > 0){ //will skip if fled or dead
            attack(pCharacter, pEnemy);
        }
    }//end while
    
    //return results
    if(pEnemy.health <= 0){
        cout << pEnemy.name << " slain.\n";
        level++; //increment levelsPassed in main
        pEnemy.used = true;
    }
    else if(fleeAttempt == true){
        cout << "Player got away.\n";
        level += 0.5;
        pEnemy.used = true;
    }
    else if(pCharacter.health <= 0){
        cout << pCharacter.name << " slain.\n";
    }
}
