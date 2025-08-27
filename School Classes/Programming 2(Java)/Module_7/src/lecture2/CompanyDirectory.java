package lecture2;

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

}
