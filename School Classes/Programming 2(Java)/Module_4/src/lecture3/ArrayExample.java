//Lane Pollock
//java
//demo of arrays in java


package lecture3;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// local variables
		int[] numbers = {5,3,7,1,9};
		int index;
		
		//accessing elements
		System.out.println("First element: " + numbers[0]);
		System.out.println("Third element: " + numbers[2]);
		
		//updating element
		numbers[0] = 10;
		System.out.println("New first element: " + numbers[0]);
		
		//find array length
		System.out.println("Array length: " + numbers.length);
		
		//original array
		System.out.println("Original array: " + Arrays.toString(numbers) );
		
		//sort array
		Arrays.sort(numbers);
		
		//print sorted array
		System.out.println("Sorted array: " + Arrays.toString(numbers) );
		
		//search for element
		index = Arrays.binarySearch(numbers, 7);
		
		//if found
		if(index >= 0)
			System.out.println("Element 7 found at index: " + index);
		else
			System.out.println("Element 7 not found");
		
		//fill an array with a value
		Arrays.fill(numbers, 0);
		System.out.println("Array after fill operation: " + Arrays.toString(numbers));

	}

}
