package lecture1;

import java.util.Scanner;

public class NumberUtilityDriver {

	public static void main(String[] args) {
		//local variables
		String customer;
		
		//input object
		Scanner keyboard = new Scanner(System.in);
		
		//print header
		NumberUtility.printHeader();
		
		//prompt for customer number
		System.out.println("Enter the customer code in format: LLLNNNN");
		System.out.println("L = letter\nN = number");
		
		//get customer
		customer = keyboard.nextLine();
		
		//validate input
		if(NumberUtility.isValid(customer) )
			System.out.println("This is a valid customer.");
		else //not valid
		{
			System.out.println("That is not the proper format.");
			System.out.println("Example: ABC1234");
		}
		
		//close scanner 
		keyboard.close();
	}

}
