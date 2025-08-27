//************************************************************************
// Author: Lane Pollock
// Date: 10 Dec 2024
// Language: Java
// Assignment: Lab 1: Singleton Pattern
// Description: Driver for singleton patterns, demonstrates using their
//  instances to print a header and footer
//************************************************************************


package lab1;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReportHeader reportHeader = ReportHeader.getInstance();
		ReportFooter reportFooter = ReportFooter.getInstance();
		
		reportHeader.printHeader();
		
		System.out.println("Company Message... ...\n");
		
		reportFooter.printFooter();

	}

}
