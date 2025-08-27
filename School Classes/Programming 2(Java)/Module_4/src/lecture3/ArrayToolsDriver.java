package lecture3;

import java.util.Scanner;

public class ArrayToolsDriver {
	
	public static void main(String[] args) {
		//declare local variables
		int[] tests = { 87, 75, 98, 100, 82 };
		int[] values = {5,7,2,8,9,1};
		int[] numbers = {101,142,147,189,199,207,222,
						 234,289,296,310,319,388,394,
						 417,429,447,521,536,600};
		int results, searchValue;
		String again;
		
		Scanner in = new Scanner(System.in);
		
		//search array for value 100
		results = ArrayTools.sequentialSearch(tests, 100);
		
		//display results
		if(results == -1) //value not found
			System.out.println("You did not earn a 100 on a test.");
		else //value found
			System.out.println("You earned 100 on test " + (results+1) );
		
		//display the unsorted array first
		System.out.println("Unsorted array:");
		//iterate through array
		for(int value : values) 
			System.out.print(value + " ");
	
		System.out.println();
		
		//sort the values with selectionSort
		ArrayTools.selectionSort(values);
		
		System.out.println("Sorted array:");
		
		//iterate through array
		for(int value : values) 
			System.out.print(value + " ");
		
		System.out.println();
		
		
		do {
			//get a value to search for
			System.out.print("Enter a value to search: ");
			
			searchValue = in.nextInt();
			in.nextLine();
			
			//search for next value
			results = ArrayTools.binarySearch(numbers, searchValue);
			
			//display results
			if(results == -1) //not found
				System.out.println(searchValue + " was not found.");
			else //found
				System.out.println(searchValue + " was found at position " + results);
			
			//search again?
			System.out.print("Do you want to search again? [y/n]");
			again = in.next();
			
		} while(again.charAt(0) == 'y' || again.charAt(0) == 'Y');
		
		in.close();
		
	} //end main

}
