//this demo represents more inheritance practice
//java
//class represents graded activity such as quiz or test

package lecture3;

public class GradedActivity {
	//instance variables
	private double score;
	
	//constructors
	public GradedActivity(double score) {
		this.score = score;
	}
	
	public GradedActivity() {
		this.score = 0.0;
	}
	
	//getters
	public double getScore() {
		return score;
	}
	
	//setter
	public void setScore(double score) {
		this.score = score;
	}
	
	//class methods
	
	//method returns a letter grade determined from score
	public char getGrade() {
		//90-100
		if(score >= 90)
			return 'A';
		else if(score >= 80)
			return 'B';
		else if(score >= 70)
			return 'C';
		else if(score >= 60) 
			return 'D';
		else
			return 'F';
	}
	
}
