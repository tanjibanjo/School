package lecture4;

import java.io.*;

public class TestScoreReaderDriver {

	public static void main(String[] args) throws IOException{
		// local variables
		double average;
		int studentNumber = 1;
		TestScoreReader scoreReader = new TestScoreReader("grades.csv");
		
		//iterate through the grades for each student and avg
		while(scoreReader.readNextLine()) {
			average = scoreReader.getAverage();
			
			//display
			System.out.println("Average for student number " + studentNumber + " is: " + average);
			
			studentNumber++;
		}
		
		//close the file
		scoreReader.close();
		System.out.println("No more scores.");

	}

}
