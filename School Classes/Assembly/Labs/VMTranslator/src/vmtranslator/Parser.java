package vmtranslator;

//imports
import java.util.Scanner;

public class Parser {
	//fields
	private Scanner scan;
	private String curCommand;
	
	//constructor
	public Parser(Scanner scanner) {
		this.scan = scanner;
	}
	
	//function returns if the scanner has a next line, use for advancing
	public boolean hasMoreCommands() {
		return scan.hasNextLine();
	}
	
	//advance function
	public void advance() {
		if(hasMoreCommands()) {
			curCommand = scan.nextLine();
			
			//strip comment
			int commentIndex = curCommand.indexOf("/");
            if (commentIndex >= 0) {
            	curCommand = curCommand.substring(0, commentIndex);
            }
            
         // trim just to be sure
            curCommand = curCommand.trim();

            //recursive call to start the loop again
            if (curCommand.isEmpty()) {
                advance();
            }

		}
	}
	
	//function to take the string command and return the enum version
	public CommandsType commandType() {
		String command = curCommand.split(" ")[0];
		switch(command) {
		case "push":
			return CommandsType.PUSH;
		case "pop":
			return CommandsType.POP;
		default:
			return CommandsType.ARITHMETIC;
		}
	}
	
	//function that will set up the first argument based on the commandType()
	public String firstArg() {
		if(commandType() == CommandsType.RETURN) {
			return null;
		}
		
		if(commandType() == CommandsType.ARITHMETIC) {
			return curCommand;
		}
		
		//if it makes this far
		return curCommand.split(" ")[1]; //taking the second item in split
	}
	
	public int secondArg() {
		if (commandType() == CommandsType.PUSH
                || commandType() == CommandsType.POP
                || commandType() == CommandsType.FUNCTION
                || commandType() == CommandsType.CALL) {
            return Integer.valueOf(curCommand.split(" ")[2]);
        }
		
		return 0;
	}

}
