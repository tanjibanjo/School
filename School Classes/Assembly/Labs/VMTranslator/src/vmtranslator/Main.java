//lane pollock
//project 7 for assembly
//build a vm - I'm using java in this case
//main 

package vmtranslator;

//imports
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	//local var
	private static CodeWriter codeWriter; 
	
	//main
	public static void main(String[] args) {
		//File inFile = new File(args[0]);
		File inFile = new File("PointerTest.vm");
		
		codeWriter = new CodeWriter(inFile); //create new writer with the input file given
		if(inFile.isDirectory() ) { //if the file is a directory, search then translate
			iterateFiles(inFile.listFiles());
		}
		else {
			translate(inFile); //just translate
		}
		
		codeWriter.close(); //close the writer
	}
	
	//functions!!
	private static void iterateFiles(File[] files) {
		for (File file : files) {
			if(file.isDirectory()) {
				iterateFiles(file.listFiles()); //recursive call
			}
			else {
				if(file.getName().endsWith(".vm")) { //check for if vm file
					translate(file); //send file to translator
				}
			}
		}
	}
	
	private static void translate(File file) {
		File outFile = new File(file.getName().split(".vm")[0] + ".asm"); //name of file
		
		//try to instantiate a new scanner with the file passed in
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(file);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Parser parser = new Parser(inputScanner);
		codeWriter.setFileName(outFile.getName()); //set the file name
		
		//main loop
		while(parser.hasMoreCommands()) {
			parser.advance();
			switch(parser.commandType()) {
			case PUSH:
			case POP:
				codeWriter.pushPop(parser.commandType(), parser.firstArg(), parser.secondArg());
				break;
			case ARITHMETIC:
				codeWriter.writeArithmetic(parser.firstArg());
				break;
			}
		}
		
		
		
	}
	
	

}
