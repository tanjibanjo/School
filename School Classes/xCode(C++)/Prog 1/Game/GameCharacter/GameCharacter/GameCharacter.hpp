//
//  GameCharacter.hpp
//  GameCharacter
//
//  Created by Lane Pollock on 4/26/24.
//

#ifndef GameCharacter_hpp
#define GameCharacter_hpp

#include <iostream>

#endif /* GameCharacter_hpp */
using namespace std;

class GameCharacter
{
private:
    string name;
    int health;
    string type;
    
public:
    //getters
    string getName() const;
    int getHealth() const;
    string getType() const;
    
    //setters
    void setName(string);
    void setHealth(int);
    void setType(string);
    
    //constructors
    GameCharacter(string, int, string);
    
    //instance methods
    string printCharacter();
    void increaseHealth(int);
    void decreaseHealth(int);
};
