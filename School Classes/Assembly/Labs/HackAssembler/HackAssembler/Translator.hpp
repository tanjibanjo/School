//
//  Translator.hpp
//  HackAssembler
//
//  Created by Lane Pollock on 11/5/25.
//

#ifndef Translator_hpp
#define Translator_hpp

#include <stdio.h>
#include <iostream>
#include <map>

using namespace std;

class Translator {
private:
    //fields - in this case the maps to hold the translations
    map<string, string> destTable;
    map<string, string> compTable;
    map<string, string> jumpTable;
    
public:
    //constructor
    Translator();
    
    //getters - take the dest Mnemonic and return the binary value in string
    string getDest(const string& destMn);
    string getComp(const string& compMn);
    string getJump(const string& jumpMn);
};

#endif /* Translator_hpp */
