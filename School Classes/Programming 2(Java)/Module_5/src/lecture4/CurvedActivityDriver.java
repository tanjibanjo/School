//this program demos method overriding and inheritance with gradedActivity class
//java

package lecture4;

import java.util.Scanner;

public class CurvedActivityDriver {

	public static void main(String[] args) {
		// local variables
		double score, curvePercent;
		CurvedActivity curvedExam;
		Scanner in = new Scanner(System.in);
		
		//get unadjusted exam score
		System.out.print("Enter the student's raw exam score: ");
		score = in.nextDouble();
		
		//get curve percentage
		System.out.print("Enter the curve percentage: ");
		curvePercent = in.nextDouble();
		in.close();
		
		//instantiate our activity
		curvedExam = new CurvedActivity(curvePercent); //this constructor sets score to 0.0
		
		//set the score
		curvedExam.setScore(score);
		
		//now display results
		System.out.println("Raw Score: " + curvedExam.getRawScore());
		System.out.println("The curved score is: " + curvedExam.getScore());
		System.out.println("The exam grade is: " + curvedExam.getGrade());

	}

}
