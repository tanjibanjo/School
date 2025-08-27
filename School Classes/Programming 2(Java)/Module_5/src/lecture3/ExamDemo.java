//program to demo the inheritance of GradedActivity and FinalExam
//

package lecture3;

import java.util.Scanner;

public class ExamDemo {

	public static void main(String[] args) {
		//local variables
		double testScore;
		int examQuestions, questionsMissed;
		//objects
		GradedActivity grade = new GradedActivity();
		FinalExam myFinal;
		Scanner in = new Scanner(System.in);
		
		//***********************
		// Process GradedActivity
		//***********************
		
		//get test score from user
		System.out.print("Enter a numeric test score for the activity: ");
		testScore = in.nextDouble();
		
		//set the grade's score
		grade.setScore(testScore);
		
		//display the letter grade using grade's method
		System.out.println("The grade for the activity is " + grade.getGrade());
		System.out.println();
		
		//**********************
		// Process FinalExam
		//**********************
		
		System.out.print("Let's calculate exam. Enter number of questions: ");
		examQuestions = in.nextInt();
		System.out.print("Enter number missed: ");
		questionsMissed = in.nextInt();
		
		//initialize the final with constructor
		myFinal = new FinalExam(examQuestions, questionsMissed);
		
		System.out.println("The grade for the final is " + myFinal.getGrade());
		System.out.println("Each question was worth " + myFinal.getPointsEach()
							+ " and you missed " + myFinal.getNumberMissed());
		
		in.close();

	}

}
