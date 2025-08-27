//Lane Pollock
//3  Oct 2024
//java
//for loop demo for both standard and enhanced

package lecture1;

import java.text.NumberFormat;
import java.util.Scanner;

public class EnhancedForLoop {
	public static void main(String[] args) {
		//local variables
		final int NUM_EMP = 3;
		
		int[] hours = new int[NUM_EMP];
		double payrate = 0.0;
		int sumHours = 0;
		
		Scanner in = new Scanner(System.in);
		
		//prompt the user for input
		System.out.println("Enter the hours worked by " + NUM_EMP + " employees.");
		//using a standard for loop
		for(int i = 0; i < NUM_EMP; i++) {
			System.out.print("Employee " + (i+1) + ": ");
			hours[i] = in.nextInt();
		}
		
		//get hourly rate from user
		System.out.print("Enter the hourly rate for the employees: ");
		payrate = in.nextDouble();
		
		//close scanner
		in.close();
		
		//display using enhanced for loop (aka for each loop)
		for(int hour : hours) {
			System.out.println(hour);
			sumHours += hour;
		}
		
		//set up currency formatter
		NumberFormat df = NumberFormat.getCurrencyInstance();
		
		//diplay stats
		System.out.println("The total hours for employees is: " + sumHours);
		System.out.println("The total payroll for the week is: " + df.format(sumHours * payrate) );
		
	}

}
