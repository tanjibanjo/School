//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: Lab 3.1 - Employee
// Description: Driver class for the employee that prompts for info and
//  displays name, id, address, and benefits
//************************************************************************


package lab1;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) {
		//local variables
		String userID, firstName, lastName;
		//new instances
		Scanner in = new Scanner(System.in);
		Benefit userBenefit = new Benefit("United Healthcare", "Health", 
											1845.00);
		Address userAddress = new Address("San Antonio", "Texas", 
											"123 45th Street", "78228");
		Employee userEmployee;
		
		//prompt for userID, and name
		System.out.print("Enter ID: ");
		userID = in.nextLine();
		System.out.print("First Name: ");
		firstName = in.nextLine();
		System.out.print("Last Name: ");
		lastName = in.nextLine();
		
		//close scanner
		in.close();
		
		//instantiate Employee
		userEmployee = new Employee(firstName, lastName, userID, 
									userBenefit, userAddress);
		
		//use class method to print
		System.out.print(userEmployee.printEmployeeInformation() );
	}

}
