//
//  SymbolTable.hpp
//  HackAssembler
//
//  Created by Lane Pollock on 11/5/25.
//

#ifndef SymbolTable_hpp
#define SymbolTable_hpp

#include <stdio.h>
#include <iostream>
#include <map>

using namespace std;

class SymbolTable
{
private:
    map<string, int> addressTable;
    
public:
    //constructor
    SymbolTable();
    
    //add pair to table
    void addEntry(const string& symbol, int address);
    
    //return t/f is symbol is in table
    bool contains(const string& symbol);
    
    //returns address of the given symbol
    int getAddress(const string& symbol);
    
};

#endif /* SymbolTable_hpp */
