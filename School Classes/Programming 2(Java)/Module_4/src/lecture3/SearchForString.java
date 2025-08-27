//Lane Pollock
//java
//demo of searching through string array for a specific string

package lecture3;

import java.util.Scanner;

public class SearchForString {

	public static void main(String[] args) {
		// local variables
		String searchString;
		int index;
		String[] stringArray = {"apple", "banana", "orange", "grape", "mango"};
		
		Scanner in = new Scanner(System.in);
		
		//get string to search for from user
		System.out.print("Enter a fruit to search for: ");
		searchString = in.nextLine();
		
		//call method and store returned index
		index = findStringIgnoreCase(stringArray, searchString);
		
		//display results
		if(index >= 0) //found
			System.out.println("String \"" + searchString + "\" found at index " + index);
		else 
			System.out.println("String not found.");
		
		
		in.close();
	} //end main
	
	//search for a string in passed array, ignoring case, and return index
	public static int findStringIgnoreCase(String[] pArray, String searchString) {
		//iterate through array
		for(int i = 0; i < pArray.length; i++) {
			if(pArray[i].equalsIgnoreCase(searchString) ) //if match is found
				return i;
		}
		//if match is not found
		return -1;
	}

}
