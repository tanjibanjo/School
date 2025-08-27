//************************************************************************
// Author: Lane Pollock
// Date: 2 Dec 2024
// Language: Java
// Assignment: Lab 2: Employee Composite Pattern
// Description: Manager class that implements employee interface
//************************************************************************


package lab2;

public class Manager implements Employee{
	//instance variables
	private String name,
		   		   department;
	private long   empID;
	
	//constructors
	public Manager() {
		this.name = "Unknown";
		this.department = "Unkown";
		this.empID = -1;
	}
	
	public Manager(long empID, String name, String department) {
		this.name = name;
		this.department = department;
		this.empID = empID;
	}

	//getters/setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public long getEmpID() {
		return empID;
	}

	public void setEmpID(long empID) {
		this.empID = empID;
	}
	
	//implement interface methods
	@Override
	public void showEmployeeDetails() {
		System.out.println("Manager ID: " + empID + " | Name: " + 
							name + " | Department: " + department);
	}

}
