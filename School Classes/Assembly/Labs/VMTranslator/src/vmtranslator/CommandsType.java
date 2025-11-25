//lane pollock
//project 7 for assembly
//build a vm - I'm using java in this case
//this is to hold an enum of different types of commands that are going to be encountered


package vmtranslator;

public enum CommandsType {
	ARITHMETIC,
	PUSH,
	POP,
	LABEL,
	GOTO,
	IF,
	FUNCTION,
	RETURN,
	CALL
}