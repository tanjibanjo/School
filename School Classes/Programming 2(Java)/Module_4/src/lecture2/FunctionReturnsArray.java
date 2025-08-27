//Lane Pollock
//java
//program to demonstrate using an array as a return type to a method

package lecture2;

public class FunctionReturnsArray {
	
	public static void main(String[] args) {
		//declare local variables
		int[] numbers = {1,2,3,4,5};
		int[] doubleNumbers = doubleArray(numbers);
		
		//loop through the array displaying doubled numbers
		for(int number : doubleNumbers)
			System.out.println(number);
	} // end main
	
	//method to double the numbers in the array and return new array
	public static int[] doubleArray(int[] array) { //this is static so it can work with/ see main- which is also static!
		//local variables
		int[] doubleArray = new int[array.length];
		
		//loop through array doubling numbers and place in new array
		for(int i = 0; i < array.length; i++) {
			doubleArray[i] = array[i] * 2;
		}
		return doubleArray;
	}

}
