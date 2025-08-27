package lecture4;

import java.util.Scanner;

public class TelephoneDriver {
	public static void main(String[] args) {
		//local variables
		Scanner in = new Scanner(System.in);
		String phoneNumber;
		
		//get unformatted number
		System.out.println("Enter an unformatted phone number: ");
		phoneNumber = in.nextLine();
		
		//format
		System.out.println("Formatted number: " + Telephone.format(phoneNumber));
		
		//now lets get a formatted number
		System.out.println("Enter in a formatted number: ");
		phoneNumber = in.nextLine();
		
		//unformat
		System.out.println("Unformatted: " + Telephone.unformat(phoneNumber));
		
		in.close();
	}

}
