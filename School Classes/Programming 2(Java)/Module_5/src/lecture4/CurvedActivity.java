//override demo with inheritance from GradedActivity class
//java

package lecture4;

public class CurvedActivity extends GradedActivity {
	//local variables
	double rawScore;
	double percentage;
	
	//constructor
	public CurvedActivity(double percentage) {
		this.percentage = percentage;
		this.rawScore = 0.0;
	}
	
	//override the setScore method from the superClass
	//this version accepts the unadjusted score and multiplies by the curve
	// then sends back to the superclass
	@Override 
	public void setScore(double score) {
		rawScore = score;
		super.setScore(rawScore * percentage);
	}

	//getters

	public double getRawScore() {
		return rawScore;
	}

	public double getPercentage() {
		return percentage;
	}
	

}
