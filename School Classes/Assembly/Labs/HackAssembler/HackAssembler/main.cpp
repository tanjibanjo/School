//Lane Pollock
//5 Nov 2025
//Hack Assembler to take .asm files and translate into .hack -machine language (txt files)
//C++

#include "Utility.hpp"
#include "Translator.hpp"
#include "Parser.hpp"

using namespace std;

int main(int argc, char* argv[]) {
    //variables
    /*
    string* inputFileName;
    string* outputFileName;
    int lineNumber, newAddress;
    unsigned long numberSource;
    ofstream fout;
    
    //use the parameters for file names
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
    }
    
    //create the output
    fout.open(*outputFileName);
    
    //if did not open for some reason
    if(fout.fail()) {
        cout << "Failed to open output file.\n";
        exit(1);
    }
        
    
    
    //clean up memory
    delete inputFileName;
    delete outputFileName;
    
    //close output stream
    fout.close();
    */
    
    //UNIT TESTING

    
    
    return 0;
}
