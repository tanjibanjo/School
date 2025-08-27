// Lane Pollock
// 19 sep 2024
// module 3 HeaderClass demo using private and public utilities
// program to print header and footer - STATIC

package lecture1;

public class HeaderClass {
	//instance variables
	public static int numberTimesUsed = 0;
	
	//static utility to print header - string parameter to display
	public static String printHeader(String pText) {
		//local variables
		String myReturn = ""; //initialize so we can add to it
		
		//build the header by adding to it
		myReturn += printLine();
		myReturn += pText + "\n";
		myReturn += printLine();
		numberTimesUsed++; //increment number times used
		
		return myReturn;
	}
	
	//overloaded version with no argument
	public static String printHeader() {
		//local variables
		String myReturn = "";
		
		//build header
		myReturn += printLine();
		myReturn += "Welcome to my program\n";
		myReturn += printLine();
		
		numberTimesUsed++; //increment number of times used
		
		return myReturn;
	}
	
	//static utility to print footer
	public static String printFooter() {
		//local variables
		String myReturn = "";
		
		//build footer
		myReturn += printLine('*');
		myReturn += "\nEnd of Program\n";
		myReturn += printLine('*');
		
		//increment 
		numberTimesUsed++;
		
		return myReturn;
	}
	
	
	//getter to return number of times used
	public static int getTimesUsed() {
		return numberTimesUsed;
	}
	
	
	//private methods used by class
	
	//method to print line of characters
	private static String printLine() {
		return "###############################\n";
	}
	
	//private method to print line that takes a custom char
	private static String printLine(char pChar) {
		//local variables
		String myReturn = "";
		
		//build loop for line
		for(int i = 0; i < 25; i++)
			myReturn += pChar;
		
		return myReturn;
	}
	
	
	

}
