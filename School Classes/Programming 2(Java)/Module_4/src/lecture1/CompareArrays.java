//Lane pollock
//java
//oct 3 2024
//demo of comparing arrays
//<userArray>.equals(<otherArray>) compares memory location
//Arrays.equals compares contents - but is case sensitive and requires import java.util.arrays

package lecture1;

import java.util.Arrays;

public class CompareArrays {
	public static void main(String[] args) {
		//local variables
		System.out.println("Using Arrays.equals() method.");
		
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {1,2,3,4,5};
		//using Arrays.equals method
		if(Arrays.equals(array1, array2) ) {
			System.out.println("The arrays are equal.");
		}
		else
			System.out.println("The arrays are not equal.\n\n");
		
		//--------------------------------
		
		//comparing arrays without a method (manual)
		//local variables
		System.out.println("Without a method.");
		
		int[] array3 = {2,4,6,8,10};
		int[] array4 = {2,4,6,8,10};
		boolean arraysEqual = true;
		int i = 0; //LCV
		
		//loop
		if(array3.length != array4.length)
			arraysEqual = false;
		while(arraysEqual && i < array3.length) {
			if(array3[i] != array4[i]) //this is where we'd make our changes to ignore case, or cast to int, etc.
				arraysEqual = false;
			i++;
		}
		
		//display
		if(arraysEqual) //true
			System.out.println("The arrays are equal.");
		else
			System.out.println("The arrays are not equal.");
		
		
	}

}
