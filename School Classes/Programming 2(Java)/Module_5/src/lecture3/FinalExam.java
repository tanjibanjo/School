//class inherits from GradedActivity to demonstrate inheritance
//class represents a final exam activity subclass of GradedAvtivity

package lecture3;

public class FinalExam extends GradedActivity{
	//instance variables
	private double pointsEach; //points for each question
	private int numberMissed; //number of questions missed
	
	//constructors
	public FinalExam(int questions, int missed) {
		//local variables
		double numericScore; //calculate the numeric score
		
		//set fields
		numberMissed = missed;
		
		//calculate points per question and score
		pointsEach = 100.0 / questions;
		numericScore = 100 - (pointsEach * missed);
		
		setScore(numericScore);
	}
	
	//getters

	public double getPointsEach() {
		return pointsEach;
	}

	public int getNumberMissed() {
		return numberMissed;
	}
	

}
