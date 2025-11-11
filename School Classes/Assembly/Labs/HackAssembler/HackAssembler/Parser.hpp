//
//  Parser.hpp
//  HackAssembler
//
//  Created by Lane Pollock on 11/5/25.
//

#ifndef Parser_hpp
#define Parser_hpp

#include <stdio.h>
#include <iostream>
#include <fstream>
#include <algorithm>
#include <string>
#include <map>

using namespace std;

class Parser {
private:
    //fields
    ifstream fin;
    string command;
    //map to hold the command characters - A, C, or L
    map<char, char> commandTable;
    
public:
    //constructor - will attempt to open file
    Parser(const string& fileName);
    
    //destructor - closes fin
    ~Parser();
    
    //checks if there are more commands in the input
    bool hasMoreCommands();
    
    //reads next command and makes it the current command - only fires if hasMoreCommands is true
    void advance(unsigned long& lineNum);
    
    //returns type of current command
    char getCommand();
    
    //return the symbol or decimal in an A-type or L-type command
    string symbol();
    
    //return the dest mnemonic in current C-command
    string getDestMn();
    
    //return the comp mnemonic
    string getCompMn();
    
    //return the jump mnemonic
    string getJumpMn();
    
    void setCommand(string command);
    
    
};

#endif /* Parser_hpp */
