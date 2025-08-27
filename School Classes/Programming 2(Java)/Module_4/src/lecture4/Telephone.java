package lecture4;

public class Telephone {
	//instance variables
	public final static int FORMATTED_LENGTH = 13;
	public final static int UNFORMATTED_LENGTH = 10;
	
	//method to verify if a phone number is formatted in the style (XXX)XXX-XXXX
	//returns t/f
	public static boolean isFormatted(String str) {
		
		//determine whether str is properly formatted
		if(str.length() == FORMATTED_LENGTH &&
		   str.charAt(0) == '(' &&
		   str.charAt(4) == ')' &&
		   str.charAt(8) == '-')
			return true;
		else 
			return false;
	}
	
	//method that takes a formatted phone number and unformats it
	public static String unformat(String str) {
		//string builder
		StringBuilder sb = new StringBuilder(str);
		
		//identify whether str is formatted and unformat if so
		if(isFormatted(str) ) {
			//delete the first parentheses
			sb.deleteCharAt(0);
			
			//now next parentheses
			sb.deleteCharAt(3); //it moved to the left one when we deleted the first parentheses
			
			//hyphen, which is now at 6
			sb.deleteCharAt(6);
			
			//this^ would be better if we started at the last element, 8 instead and then we could just use the original locations 
		}
		//return the string
		return sb.toString();
	}
	
	//method to add the formatting to an unformatted str passed in
	public static String format(String str) {
		StringBuilder sb = new StringBuilder(str);
		
		//if the phone number is correct length, format
		if(sb.length() == UNFORMATTED_LENGTH) {
			sb.insert(0, "(");
			sb.insert(4, ")");
			sb.insert(8, "-");
		}
		
		return sb.toString();
	}

}
