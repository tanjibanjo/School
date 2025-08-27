//************************************************************************
// Author: Lane Pollock
// Date: 2 Dec 2024
// Language: Java
// Assignment: Lab 2: Employee Composite Pattern
// Description: Class that acts as a directory, holding employees in list
//  and providing functions to add, remove, or count
//************************************************************************


package lab2;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee{
	//instance variables
	private List<Employee> employeeList = new ArrayList<Employee>();
	
	//implement interface
	@Override
	public void showEmployeeDetails() {
		for(Employee emp : employeeList)
			emp.showEmployeeDetails();
	}
	
	//methods
	public void addEmployee(Employee emp) {
		employeeList.add(emp);
	}
	
	public void removeEmployee(Employee emp) {
		employeeList.remove(emp);
	}
	
	public int countEmployees() {
		return employeeList.size();
	}

}
