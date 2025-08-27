//************************************************************************
// Author: Lane Pollock
// Date: 3 Oct 2024
// Language: Java
// Assignment: Lab 3.1 - Employee
// Description: Class with attributes for Employee, including an Address
//  and a Benefit
//************************************************************************


package lab1;

public class Employee {
	//instance variables
	private String employeeID, firstName, lastName;
	private Address employeeAddress;
	private Benefit employeeBenefit;
	
	/* CONSTRUCTORS */
	
	//5 parameter
	public Employee(String firstName, String lastName, String employeeID,
					Benefit employeeBenefit, Address employeeAddress) {
		this.firstName = firstName;
		this.lastName = lastName;	
		this.employeeID = employeeID;
		this.employeeBenefit = new Benefit(employeeBenefit);
		this.employeeAddress = new Address(employeeAddress);
	}
	
	/* GETTERS/SETTERS */
	
	public String getEmployeeID() {
		return employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Address getEmployeeAddress() {
		return new Address(employeeAddress);
	}

	public Benefit getEmployeeBenefit() {
		return new Benefit(employeeBenefit);
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = new Address(employeeAddress);
	}

	public void setEmployeeBenefit(Benefit employeeBenefit) {
		this.employeeBenefit = new Benefit(employeeBenefit);
	}
	
	
	
	/* METHODS */
	
	//method to return a string of all employee info
	public String printEmployeeInformation() {
		String str = "";
		//format return
		str += "\n***** Employee Information *****\n";
		str += "# Employee Details #\n";
		str = String.format("%s%s %s (%s)\n", str, firstName, lastName,
							employeeID);
		//now add the info from other classes
		str += employeeAddress.printAddress();
		str += employeeBenefit.printBenefit();
		
		return str;
	}
	
}
