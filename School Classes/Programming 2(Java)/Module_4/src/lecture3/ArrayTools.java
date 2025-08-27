//Lane Pollock
//java
//8 oct 2024
//group of tools to sort and search an array

package lecture3;

public class ArrayTools {
	//sort integer array using selectionSort algorithm
	public static void selectionSort(int[] array) {
		int startScan, index, minIndex, minValue;
		
		//looping through the first values putting the next smallest in the next index
		for(startScan = 0; startScan < (array.length - 1); startScan++) {
			minIndex = startScan;
			minValue = array[startScan];
			
			//looping through the remaining values
			for(index = (startScan + 1); index < array.length; index++) {
				//check if the next value is smaller than the previous and save the smallest (value and index)
				if(array[index] < minValue) {
					minValue = array[index];
					minIndex = index;
				}
			}//end inner for loop
			
			//swap the values
			array[minIndex] = array[startScan];
			array[startScan] = minValue;
			
		}//end outer for loop
	}//end selectionSort
	
	//search array using binary search
	public static int binarySearch(int[] array, int value) {
		//declare local variables
		int first,      //first array element
			last,       //last array elements
			middle,     //midpoint
			position;   //position of search value
		boolean found;  //flag
		
		//set initial values
		first = 0;
		last = array.length - 1;
		position = -1;
		found = false;
		
		//while there is more to search
		while(!found && first <= last) {
			middle = (first + last) /2; //midpoint
			
			//if value is at midpoint
			if(array[middle] == value) {
				found = true;
				position = middle;
			}
			//if value is in lower half
			else if(array[middle] > value) {
				last = middle - 1;
			}
			//if value is in upper half
			else
				first = middle + 1;
		}//end while
		
		//return position found or -1 if not found
		return position;
		
	}//end binarySearch
	
	//search array using sequential search
	public static int sequentialSearch(int[] array, int value) {
		//local variables
		int index = 0,
			element = -1;
		boolean found = false; 
		
		//search array
		while(!found && index < array.length) {
			//if element has the value
			if(array[index] == value) {
				found = true; //value found
				element = index; //save subscript
			}
			index++;
		} //end while
		
		//return subscript or -1 if not found
		return element;
	}//end class
	

}
