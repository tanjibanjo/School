//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: copy array demo
// Description: program uses various methods to copy an array 
//************************************************************************


package lecture1;

public class CopyArrays {

	public static void main(String[] args) {
		//using for loop
		//variables
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] coppiedArr1 = new int[arr1.length];
		
		for(int i = 0; i < arr1.length; i++) {
			coppiedArr1[i] = arr1[i];
		}
		
		//display the two arrays
		displayArrays(arr1, coppiedArr1);
		
		System.out.println("Is a shallow copy: " + arr1.equals(coppiedArr1) );
		
		System.out.println();
		System.out.println();
		//-----------------------------------------
		//using arraycopy method
		//variables
		int[] arr2 = {6, 7, 8, 9, 10};
		int[] coppiedArr2 = new int[arr2.length];
		
		System.arraycopy(arr2, 0, coppiedArr2, 0, arr2.length); //copy method
		
		//display the two arrays
		displayArrays(arr2, coppiedArr2);
		
		System.out.println("Is a shallow copy: " + arr2.equals(coppiedArr2) );
		
		System.out.println();
		System.out.println();
		//--------------------------------------------
		//using clone method!
		//variables
		int[] arr3 = {11, 12, 13, 14, 15};
		int[] coppiedArr3 = arr3.clone(); //this is it right here
		
		//display the two arrays
		displayArrays(arr3, coppiedArr3);
				
		System.out.println("Is a shallow copy: " + arr3.equals(coppiedArr3) );
				
		System.out.println();
		System.out.println();
		//--------------------------------------------
		//using = method
		//variables
				int[] arr4 = {16, 17, 18, 19, 20};
				int[] coppiedArr4 = arr4;
			
				//display the two arrays
				displayArrays(arr4, coppiedArr4);
				
				System.out.println("Is a shallow copy: " + arr4.equals(coppiedArr4) );
				
				System.out.println();
				System.out.println();
				//-----------------------------------------
		
		
	}//end main
	
	//method to output two arrays
	static public void displayArrays(int[] arr1, int[] arr2) {
		for(int i : arr1) 
			System.out.printf("  %2d  ", i);
		System.out.println();
		
		for(int i : arr2) 
			System.out.printf("  %2d  ", i);
		System.out.println();
	}

}
