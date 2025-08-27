//************************************************************************
// Author: Lane Pollock
// Date: 10 Dec 2024
// Language: Java
// Assignment: Lab 1: Singleton Pattern
// Description: ReportFooter class to demonstrate Singleton pattern,
//  class prints a footer
//************************************************************************


package lab1;

public class ReportFooter {
	//instance variables
	private static volatile ReportFooter instance;
	private String footer;
	
	//private constructor
	private ReportFooter() {
		this.footer = "The leading company in development with:\n" 
				+ "\tJava    C++    Python    HTML/CSS\n";
	}
	
	//public static method to get instance
	//method creates instance if not already created
	public static ReportFooter getInstance() {
		//check if null
		if(instance == null) {
			synchronized(ReportFooter.class) {
				if(instance == null)
					instance = new ReportFooter();
			}
		}
		return instance;
	}
	
	//getter
	public String getFooter() {
		return this.footer;
	}
	
	//method to print footer
	public void printFooter() {
		System.out.println(this.footer);
	}

}
