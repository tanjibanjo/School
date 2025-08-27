//************************************************************************
// Author: Lane Pollock
// Date: 14 Nov 2024
// Language: Java
// Assignment: Lab 1: Medical Provider
// Description: Nurse class that extends MedicalProvider abstract class
//************************************************************************


package lab1;

public class Nurse extends MedicalProvider{
	//instance variables
	private String type;
	private double hourlyWage,
				   hoursWorked;
	
	//constructors
	public Nurse() {
		super();
		this.type = "Unknown";
		this.hourlyWage = 0;
		this.hoursWorked = 0;
	}
	
	public Nurse(String firstName, String lastName, 
			String employeeID, OfficeLocation employeeOfficeLocation,
			String type, double hourlyWage, double hoursWorked) {
		super(firstName, lastName, employeeID, employeeOfficeLocation);
		this.type = type;
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}
	
	public Nurse(Nurse copy) {
		super(copy.getFirstName(), copy.getLastName(), 
			  copy.getEmployeeID(), copy.getEmployeeOfficeLocation());
		
		this.type = copy.type;
		this.hourlyWage = copy.hourlyWage;
		this.hoursWorked = copy.hoursWorked;
	}

	
	//getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	//implement abstract methods
	//method calculates pay based on hours worked and handles overtime
	@Override
	public double payEmployee() {
		//normal 40 hour week
		if(hoursWorked <= 40)
			return hoursWorked * hourlyWage;
		else //greater than 40
			return (40 * hourlyWage) + ((hoursWorked - 40) * 
										(hourlyWage * 1.5));
	}
	
	//toString for printing info
	@Override 
	public String toString() {
		String str =
				"Nurse " + super.toString() + "\nType: " +
				type + "\nHours Worked: " + hoursWorked + 
				"\nHourly Wage: " + hourlyWage + "\nWeekly Pay: $";
		
		return String.format("%s%,.2f", str, payEmployee());
	}

}
