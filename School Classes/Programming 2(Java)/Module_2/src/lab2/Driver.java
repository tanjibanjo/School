//************************************************************************
// Author: Lane Pollock
// Date: 13 Sep 2024
// Language: Java
// Assignment: Lab 2.2 - Grade
// Description: Create a class that holds three grades. Then use driver
//    to prompt user for values and return average and letter grade.
//************************************************************************

package lab2;

import java.util.Scanner;

public class Driver {
	public static void main(String [] args) {
		//local variables
		String name;
		double quiz1, quiz2, quiz3, average;
		char letterGrade;
		Scanner in = new Scanner(System.in);
		//make instance of scores
		CourseQuizScore myScores; 
		
		//prompt user for grades
		System.out.print("Welcome, Enter Name: ");
		name = in.nextLine();
		System.out.print("Enter in Grade for Quiz 1: ");
		quiz1 = in.nextDouble();
		System.out.print("Quiz 2: ");
		quiz2 = in.nextDouble();
		System.out.print("Quiz 3: ");
		quiz3 = in.nextDouble();
		
		//close scanner 
		in.close();
		
		//use constructor to enter quiz values
		myScores = new CourseQuizScore(quiz1, quiz2, quiz3);
		
		//if quiz scores were invalid, update
		if( (quiz1 > 100) || (quiz1 < 50) )
			quiz1 = myScores.getQuiz1();
		if( (quiz2 > 100) || (quiz2 < 50) )
			quiz2 = myScores.getQuiz2();
		if( (quiz3 > 100) || (quiz3 < 50) )
			quiz3 = myScores.getQuiz1();
		
		//calculate average and letter grade
		average = myScores.calcAverage();
		letterGrade = myScores.showGrade();
		
		
		//output grade info
		System.out.printf("\nStudent Name: %s\nQuiz Grades:\n\tQuiz 1: "
						+ "%.2f\n\tQuiz 2: %.2f\n\tQuiz 3: %.2f\nAverage"
						+ " Grade: %.3f\nLetter Grade: %c",
						 name, quiz1, quiz2, quiz3, average, letterGrade);	
	}

}
