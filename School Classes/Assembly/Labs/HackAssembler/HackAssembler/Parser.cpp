//
//  Parser.cpp
//  HackAssembler
//
//  Created by Lane Pollock on 11/5/25.
//

#include "Parser.hpp"

using namespace std;

//implementations

//constructor
Parser::Parser(const string& fileName){
    //attempt to open the file
    fin.open(fileName);
    
    if (fin.fail()){
        cout << fileName << " not found.\n";
        exit(1);
    }
    
    //populate table
    commandTable['@'] = 'A';
    commandTable['A'] = 'C';
    commandTable['D'] = 'C';
    commandTable['M'] = 'C';
    commandTable['0'] = 'C';
    commandTable['1'] = 'C';
    commandTable['-'] = 'C';
    commandTable['!'] = 'C';
    commandTable['('] = 'L';
    
}

//destructor
Parser::~Parser(){
    fin.close();
}

//more commands check
bool Parser::hasMoreCommands(){
    return !fin.eof(); //if at end of file, return false - has no more commands
}

//advance and set the next command as current
void Parser::advance(unsigned long &lineNum){
    string currentLine;
    unsigned long commentPos;
    bool commandFound = false;
    
    //start to read lines
    while (!commandFound && getline(fin, currentLine)){
        //increment the line number in main, to keep track
        lineNum++;
        
        //ignore whitespace with erase_if
        currentLine.erase(remove_if(currentLine.begin(), currentLine.end(), ::isspace), currentLine.end());
        
        //remove the comments
        commentPos = currentLine.find("//");
        if (commentPos != string::npos){ //check if the comment does exist in the line
            currentLine.erase(commentPos, (currentLine.length() - commentPos));
        }
        
        //if line is not empty, there is a command
        commandFound = !currentLine.empty();

        
    }//end while
    command = currentLine;

}

//get the command type
char Parser::getCommand(){
    if (commandTable.find(command[0]) != commandTable.end()){ //if command exists, return the type
        return commandTable[command[0]];
        
    }
    
    //if program makes it this far, it doesn't exist
    cout << "Invalid command in <Parser>.\n";
    exit(1);
}

//returns the symbol or decimal xxx for A and L type commands
string Parser::symbol(){
    
    unsigned long openBracketPos = command.find('(');
    unsigned long closeBracketPos = command.find(')');
    
    //check if the command is A-type
    if (command[0] == '@'){
        //return everything after the @character
        return command.substr(1, command.length() - 1);
    }
    
    // L-instruction: return everything in between the '(' and ')' characters.
    else if (openBracketPos != string::npos && closeBracketPos != string::npos) {
        return command.substr(openBracketPos + 1, closeBracketPos - openBracketPos - 1);
    }
    
    //if error, return blank
    return "";
}

//return dest if exists
string Parser::getDestMn(){
    //check for a '=' to signal the dest in front
    unsigned long equalPos = command.find('=');
    
    if (equalPos != string::npos){
        return command.substr(0, equalPos);
    }
    
    //if no dest, return blank
    return "";
    
}

//return comp if exists
string Parser::getCompMn(){
    //check for equals and for a semicolon to signal comp
    unsigned long equalPos, semiPos;
    
    //try to find them in command line
    equalPos = command.find('=');
    semiPos = command.find(';');
    
    //return the comp if both are valid
    if (equalPos != string::npos){
        //check for dest = comp ; jump
        if (semiPos != string::npos){
            return command.substr(equalPos + 1, semiPos - equalPos - 1);
        }
        //dest = comp
        return command.substr(equalPos + 1, command.length() - equalPos - 1);
    }
    else if (semiPos != string::npos){
        //comp ; jump
        return command.substr(0, semiPos);
    }
    
    //if error, return blank
    return "";
    
}

//lastly, return jump if exists
string Parser::getJumpMn(){
    unsigned long semiPos = command.find(';');
    
    if (semiPos != string::npos){
        return command.substr(semiPos + 1, command.length() - semiPos - 1);
    }
    
    //no jump, blank
    return "";
}

