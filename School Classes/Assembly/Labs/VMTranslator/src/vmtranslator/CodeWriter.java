//lane pollock
//project 7 for assembly
//build a vm - I'm using java in this case
//class to translate and print the commands to the new asm file


package vmtranslator;

//imports
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CodeWriter {
	//fields
	private PrintWriter pr;
	private String fileName;
	
	private int labelCount = 0;
	
	//constructor
	public CodeWriter(File file) {
		pr = null;
		//take the file and change the tag to .asm
		File outFile = new File(file.getAbsolutePath().split(".vm")[0] + ".asm");
		
		//try to use the outFile to open up print writer
		try {
			pr = new PrintWriter(new FileWriter(outFile));
			fileName = file.getName();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	} //end constructor
	
	//setter
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	//********************************************************************************
	//LOGIC AND MAIN METHODS
	public void writeArithmetic(String command) {
		//add a comment
		pr.printf("// %s\n",  command);
		
		//switch on the command
		switch(command) {
		case "add":
			popStackToD();
			decStackPtr();
			loadStackPtrA();
			pr.println("M=D+M");
			incStackPtr();
			break;

		case "sub":
			popStackToD();
			decStackPtr();
			loadStackPtrA();
			pr.println("M=M-D");
			incStackPtr();
			break;
		case "neg":
			decStackPtr();
			loadStackPtrA();
			pr.println("M=-M");
			incStackPtr();
			break;
		case "eq":
			writeCompare("JEQ");
			break;
		case "gt":
			writeCompare("JGT");
			break;
		case "lt":
			writeCompare("JLT");
			break;
		case "and":
			popStackToD();
			decStackPtr();
			loadStackPtrA();
			pr.println("M=D&M");
			incStackPtr();
			break;
		case "or":
			popStackToD();
			decStackPtr();
			loadStackPtrA();
			pr.println("M=D|M");
			incStackPtr();
			break;
		case "not":
			decStackPtr();
			loadStackPtrA();
			pr.println("M=!M");
			incStackPtr();
			break;
		}
			
	}
	
	public void pushPop(CommandsType command, String segment, int index) {
		//switch on command type
		switch(command) {
		case PUSH:
			pr.printf("// push %s %d\n",  segment, index); //add a comment
			//npw switch on what segment is passed
			switch(segment) {
			case "constant":
                // store value in D
                pr.println("@"+index);
                pr.println("D=A");
                break;
            case "local":
                loadSegment("LCL", index);
                pr.println("D=M");
                break;
            case "argument":
                loadSegment("ARG", index);
                pr.println("D=M");
                break;
            case "this":
                loadSegment("THIS", index);
                pr.println("D=M");
                break;
            case "that":
                loadSegment("THAT", index);
                pr.println("D=M");
                break;
            case "pointer":
                pr.println("@R"+ String.valueOf(3 + index));
                pr.println("D=M");
                break;
            case "temp":
                pr.println("@R"+ String.valueOf(5 + index));
                pr.println("D=M");
                break; 
            case "static":
                pr.println("@"+fileName.split("\\.")[0]+String.valueOf(index));
                pr.println("D=M");
                break;
			}
			pushDToStack();
			break;
			
		case POP:
			pr.printf("// pop %s %d\n", segment, index); //comment
            switch (segment) {
                case "constant":
                    pr.println("@"+index);
                    break;
                case "local":
                    loadSegment("LCL", index);
                    break;
                case "argument":
                    loadSegment("ARG", index);
                    break;
                case "this":
                    loadSegment("THIS", index);
                    break;
                case "that":
                    loadSegment("THAT", index);
                    break;
                case "pointer":
                    pr.println("@R"+ String.valueOf(3 + index));
                    break;
                case "temp":
                    pr.println("@R"+ String.valueOf(5 + index));
                    break;
                case "static":
                    pr.println("@"+fileName.split("\\.")[0]+String.valueOf(index));
                    break;
            }
            pr.println("D=A");
            pr.println("@R13");
            pr.println("M=D");
            popStackToD();
            pr.println("@R13");
            pr.println("A=M");
            pr.println("M=D");
            break;
		} // end switch on commands
		
		
	}
	
	//********************************************************************************
	//TRANSLATION AND FUNCTIONALITY METHODS
	
	public void close() {
		pr.close();
	}
	
	private void incStackPtr() {
		pr.println("@SP");
		pr.println("M=M+1");
	}
	
	private void decStackPtr() {
		pr.println("@SP");
		pr.println("M=M-1");
	}
	
	private void popStackToD() {
		decStackPtr();
		pr.println("A=M");
		pr.println("D=M");
	}
	
	private void pushDToStack() {
		loadStackPtrA();
		pr.println("M=D");
		incStackPtr();
		
	}
	
	private void loadStackPtrA() {
		pr.println("@SP");
		pr.println("A=M");
	}
	
	//loads a segment 
	private void loadSegment(String segment, int index) {
		pr.println("@" + segment);
		pr.println("D=M");
		pr.println("@" + String.valueOf(index));
		pr.println("A=D+A");
	}
	
	//compare logic
	private void writeCompare(String jumpCommand) {
		popStackToD();
		decStackPtr();
		loadStackPtrA();
		pr.println("D=M-D");
		pr.println("@LABEL" + labelCount);
		pr.println("D;" + jumpCommand);
		loadStackPtrA();
		pr.println("M=0");
		pr.println("@ENDLABEL" + labelCount);
		pr.println("0;JMP");
		pr.println("(LABEL" + labelCount + ")");
		loadStackPtrA();
		pr.println("M=-1");
		pr.println("(ENDLABEL" + labelCount + ")");
		incStackPtr();
		labelCount++;
	}
	
	//arithmetic logic
	

}
