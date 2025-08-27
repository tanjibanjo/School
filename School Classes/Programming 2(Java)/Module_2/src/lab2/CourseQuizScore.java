//************************************************************************
// Author: Lane Pollock
// Date: 13 Sep 2024
// Language: Java
// Assignment: Lab 2.2 - Grade
// Description: CourseQuizScore class containing quizzes, average, and 
//	letter grade methods
//************************************************************************


package lab2;

public class CourseQuizScore {
	//instance variables
	private double quiz1, quiz2, quiz3;
	
	//constructors
	//default
	public CourseQuizScore() {
		quiz1 = -1;
		quiz2 = -1;
		quiz3 = -1;
	}
	
	//parameterized
	public CourseQuizScore(double quiz1, double quiz2, double quiz3) {
		setQuiz1(quiz1); //use set methods for validation built in
		setQuiz2(quiz2);
		setQuiz3(quiz3);
	}
	
	//getters
	public double getQuiz1() {
		return quiz1;
	}
	
	public double getQuiz2() {
		return quiz2;
	}
	
	public double getQuiz3() {
		return quiz3;
	}
	
	//setters
	public void setQuiz1(double quiz1) {
		//input between 50-100
		if ( (quiz1 > 49) && (quiz1 < 101) ) 
			this.quiz1 = quiz1;
		//input less than 50
		else if (quiz1 < 50) { 
			this.quiz1 = 50;
			System.out.println("Quiz 1 defaulted to 50");
		}
		//input more than 100
		else { 
			this.quiz1 = 100; 
			System.out.println("Quiz 1 defaulted to 100");
		}
			
	}
	
	public void setQuiz2(double quiz2) {
		//input between 50-100
		if ( (quiz2 > 49) && (quiz2 < 101) ) 
			this.quiz2 = quiz2;
		//input less than 50
		else if (quiz2 < 50) { 
			this.quiz2 = 50;
			System.out.println("Quiz 2 defaulted to 50");
		}
		//input more than 100
		else { 
			this.quiz2 = 100; 
			System.out.println("Quiz 2 defaulted to 100");
		}
	}
	
	public void setQuiz3(double quiz3) {
		//input between 50-100
		if ( (quiz3 > 49) && (quiz3 < 101) ) 
			this.quiz3 = quiz3;
		//input less than 50
		else if (quiz3 < 50) { 
			this.quiz3 = 50;
			System.out.println("Quiz 3 defaulted to 50");
		}
		//input more than 100
		else { 
			this.quiz3 = 100; 
			System.out.println("Quiz 3 defaulted to 100");
		}
	}
	
	//methods
	//method to return average of the quizzes
	public double calcAverage() {
		//local variables
		double average; 
		
		average = (quiz1 + quiz2 + quiz3) / 3;
		return average;
	}
	
	//method to return letter grade based on average
	public char showGrade() {
		//local variables
		int averageInt;
		char grade;
		
		//cast average to integer for switch
		averageInt = (int)calcAverage() / 10; 
		
		//switch on average int for letter assignment
		switch(averageInt) {
			case 10: //90-100
			case 9:
				grade = 'A';
				break;
			case 8: //80-89
				grade = 'B';
				break;
			case 7: //70-79
				grade = 'C';
				break;
			case 6: //60-69
				grade = 'D';
				break;
			case 5: //50-59
				grade = 'F';
				break;
			default: //invalid - average should not be <50
				grade = 'X';
				break;
		}//end of switch
		
		return grade;
		
	}

}
