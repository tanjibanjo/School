// Lane Pollock
// Java
// Class that tests the validity of a number


package lecture1;

public class NumberUtility {
	//static utility accepts customer number as String and tests format validity
	public static boolean isValid(String custNumber) {
		//local variables
		boolean goodSoFar = true; //flag
		int index = 0; //LCV
		
		//is string length correct?
		if(custNumber.length() != 7)
			goodSoFar = false;
		
		//test first three char for letters
		while(goodSoFar && index < 3) {
			if(!Character.isLetter(custNumber.charAt(index) ) )
				goodSoFar = false;
			
			index++; //increment 
		} // end while
		
		//test last four for digits
		while(goodSoFar && index < 7) {
			if(!Character.isDigit(custNumber.charAt(index) ) )
				goodSoFar = false;
			
			index++; //3-6
		} //end while
		
		//return results
		return goodSoFar;
	} //end of isValidMethod
	
	//static utility to print header
	public static void printHeader() {
		System.out.println("***********************");
		System.out.println("     Number Utility");
		System.out.println("***********************");

	}

}
