//this program demos lambda, used for simple concise methods
//java

package lecture4;

import java.util.ArrayList;

public class LambdaDemo {
	public static void main(String [] args) {
		//variables
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//populate list
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		
		//iterate through list
		numbers.forEach( (n) -> System.out.println(n)); 
	}

}
