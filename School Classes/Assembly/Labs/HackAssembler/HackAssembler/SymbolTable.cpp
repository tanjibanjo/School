//
//  SymbolTable.cpp
//  HackAssembler
//
//  Created by Lane Pollock on 11/5/25.
//

#include "SymbolTable.hpp"

//implementations
SymbolTable::SymbolTable(){
    //populate the map with all the predefined symbols
    addressTable["SP"] = 0;
    addressTable["LCL"] = 1;
    addressTable["ARG"] = 2;
    addressTable["THIS"] = 3;
    addressTable["THAT"] = 4;
    addressTable["R0"] = 0;
    addressTable["R1"] = 1;
    addressTable["R2"] = 2;
    addressTable["R3"] = 3;
    addressTable["R4"] = 4;
    addressTable["R5"] = 5;
    addressTable["R6"] = 6;
    addressTable["R7"] = 7;
    addressTable["R8"] = 8;
    addressTable["R9"] = 9;
    addressTable["R10"] = 10;
    addressTable["R11"] = 11;
    addressTable["R12"] = 12;
    addressTable["R13"] = 13;
    addressTable["R14"] = 14;
    addressTable["R15"] = 15;
    addressTable["SCREEN"] = 16384;
    addressTable["KBD"] = 24576;
}

//add pair to the table
void SymbolTable::addEntry(const string &symbol, int address){
    if (addressTable.find(symbol) == addressTable.end())
        addressTable[symbol] = address;
}

//check if the symbol is in the map
bool SymbolTable::contains(const string &symbol){
    return (addressTable.find(symbol) != addressTable.end()); //returns true if does not equal end(exists)
}

//get the address of a given symbol
int SymbolTable::getAddress(const string &symbol){
    if (addressTable.contains(symbol))
        return addressTable[symbol];
    
    //if not exists
    return 0;
}
