//
//  Translator.cpp
//  HackAssembler
//
//  Created by Lane Pollock on 11/5/25.
//

#include "Translator.hpp"


using namespace std;

Translator::Translator(){
    //populate the translation tables
    compTable["0"] = "0101010";
    compTable["1"] = "0111111";
    compTable["-1"] = "0111010";
    compTable["D"] = "0001100";
    compTable["A"] = "0110000";
    compTable["!D"] = "0001101";
    compTable["!A"] = "0110001";
    compTable["-D"] = "0001111";
    compTable["-A"] = "0110011";
    compTable["D+1"] = "0011111";
    compTable["A+1"] = "0110111";
    compTable["D-1"] = "0001110";
    compTable["A-1"] = "0110010";
    compTable["D+A"] = "0000010";
    compTable["D-A"] = "0010011";
    compTable["A-D"] = "0000111";
    compTable["D&A"] = "0000000";
    compTable["D|A"] = "0010101";
    compTable["M"] = "1110000";
    compTable["!M"] = "1110001";
    compTable["-M"] = "1110011";
    compTable["M+1"] = "1110111";
    compTable["M-1"] = "1110010";
    compTable["D+M"] = "1000010";
    compTable["D-M"] = "1010011";
    compTable["M-D"] = "1000111";
    compTable["D&M"] = "1000000";
    compTable["D|M"] = "1010101";
    
    destTable[""] = "000";
    destTable["M"] = "001";
    destTable["D"] = "010";
    destTable["MD"] = "011";
    destTable["A"] = "100";
    destTable["AM"] = "101";
    destTable["AD"] = "110";
    destTable["AMD"] = "111";
    
    jumpTable[""] = "000";
    jumpTable["JGT"] = "001";
    jumpTable["JEQ"] = "010";
    jumpTable["JGE"] = "011";
    jumpTable["JLT"] = "100";
    jumpTable["JNE"] = "101";
    jumpTable["JLE"] = "110";
    jumpTable["JMP"] = "111";
}

//implement the functions to return strings of the corresponding 
string Translator::getComp(const string &compMn){
    if (compTable.find(compMn) != compTable.end()){
        return compTable[compMn];
    }
    else {
        cout << "Error in translator <GetComp>.\n";
        exit(1);
    }
}

string Translator::getDest(const string &destMn){
    if (destTable.find(destMn) != destTable.end()){
        return destTable[destMn];
    }
    else {
        cout << "Error in translator <GetDest>.\n";
        exit(1);
    }
}

string Translator::getJump(const string &jumpMn){
    if (jumpTable.find(jumpMn) != jumpTable.end()){
        return jumpTable[jumpMn];
    }
    else{
        cout << "Error in translator <GetJump>.\n";
        exit(1);
    }
}
