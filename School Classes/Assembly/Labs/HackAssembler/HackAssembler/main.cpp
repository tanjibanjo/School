//Lane Pollock
//5 Nov 2025
//Hack Assembler to take .asm files and translate into .hack -machine language (txt files)
//C++

#include "Translator.hpp"
#include "Parser.hpp"
#include "SymbolTable.hpp"

using namespace std;

int main(int argc, char* argv[]) {
    //variables and object declarations
    
    string* inputFileName;
    string* outputFileName;
    Parser* parser;
    
    Translator translator;
    SymbolTable symbolTable;
    int lineNumberROM, newAddress;
    unsigned long lineNumberSource;
    ofstream fout;
    
    /*use the parameters for file names
    if (argc > 3 || argc < 2) { //too few or too many parameters
        cout << "Parameter Incompatability: " << argv[0] << "<InputFile.asm> <(optional)OutputFile.hack>" << endl;
        exit(1);
    }
    
    else {
        inputFileName = new string(argv[1]); //first arg is program name, so second would be input file name
    
        if (argc == 3) //output is given as well
            outputFileName = new string(argv[2]);
        else //use the input file name and format .hack instead
            outputFileName = new string(inputFileName->substr(0, inputFileName->length() - 4) + ".hack");
    //}
    */
    
    //hard code names of the files for ease but above would work in the clt
    inputFileName = new string("Pong.asm");
    outputFileName = new string(inputFileName->substr(0, inputFileName->length() - 4) + ".hack");
    
    //create the output
    fout.open(*outputFileName);
    
    //if did not open for some reason
    if(fout.fail()) {
        cout << "Failed to open output file.\n";
        exit(1);
    }
        
    
    //***********************************************************************************************
    //first pass - working through the file to check for any labels/symbols
    //if A or C type, just increment the lineNumber so that it is accurate for the symbols
    
    //initlaize Parser
    parser = new Parser(*inputFileName);
    
    //reset line number from source and to rom
    lineNumberROM = 0;
    lineNumberSource = 0;
    
    //pass
    while (true){
        //read next line and perform clean up (increments passed line number)
        parser->advance(lineNumberSource);
        
        //if no more commands
        if(!parser->hasMoreCommands()){
            break;
        }
        
        //if A or C type, increment
        if(parser->getCommand() == 'A' || parser->getCommand() == 'C'){
            lineNumberROM++;
        }
        
        //if L type, check if already is in symbol table and add if not
        if(parser->getCommand() == 'L' && !symbolTable.contains(parser->symbol())){
            symbolTable.addEntry(parser->symbol(), lineNumberROM);
        }
        
    } //end first pass
    
    //re-initialize the parser so it starts at 0
    delete parser;
    parser = new Parser(*inputFileName);
    
    //reset line counter
    lineNumberSource = 0;
    //predefined symbols are 0-15
    newAddress = 16;
    
    //***********************************************************************************************
    //second pass - go through file again line by line and perform translations on the different commands
    
    while(true){
        //advance and clean up
        parser->advance(lineNumberSource);
        
        
        //handle simple A-commands
        if(parser->getCommand() == 'A'){
            //cout << "A received\n";
            fout << 0; //all A type start w 0
            
            //check if the command is a symbol or decimal
            if(parser->symbol().find_first_not_of("0123456789") == string::npos){ //first non decimal does not exist
                //string to decimal to binary and back out to string
                fout << (bitset<15>(stoull(parser->symbol()))).to_string();
            }
            //else check if variable
            else{
                if(!symbolTable.contains(parser->symbol())){
                    symbolTable.addEntry(parser->symbol(), newAddress);
                    newAddress++;
                }
                
                //get the address and convert for writing
                fout << bitset<15>(static_cast<unsigned long>(symbolTable.getAddress(parser->symbol()))).to_string();
            }//end else
            if(parser->hasMoreCommands())
                fout << endl; //next line

        } //end 'A' type
        
        else if(parser->getCommand() == 'C'){
            //cout << "C received\n";
            fout << "111";
            fout << translator.getComp(parser->getCompMn());
            fout << translator.getDest(parser->getDestMn());
            fout << translator.getJump(parser->getJumpMn());
            if(parser->hasMoreCommands())
                fout << endl;
        }
        
        //end loop if no more commands
        if(!parser->hasMoreCommands())
            break;
        
    }
    
    
    
    
    //clean up memory
    delete parser;
    delete inputFileName;
    delete outputFileName;
    
    //close output stream
    fout.close();
    
    return 0;
}
