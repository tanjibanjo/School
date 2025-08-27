//reads test scores from a file .csv

package lecture4;

import java.util.Scanner;
import java.io.*;

public class TestScoreReader {
	//variables
	private Scanner inputFile;
	private String line;
	
	//constructor opens up files to read from
	public TestScoreReader(String filename) throws IOException{
		File file = new File(filename);
		inputFile = new Scanner(file);
	} 
	
	//method to read next line in file
	public boolean readNextLine() throws IOException{
		//local variables
		boolean lineRead; //flag var
		
		//determine if there is next line
		lineRead = inputFile.hasNext();
		
		if(lineRead)
			line = inputFile.nextLine();
		
		return lineRead;
	}
	
	//method to return average
	public double getAverage() {
		int total = 0;
		double average;
		
		//tokenize the last line read
		String[] tokens = line.split(","); //do not need "new" because we are instantiating it and adding values together
		
		//calculate the total
		for(String str : tokens) {
			total += Integer.parseInt(str);
		}
		
		average = (double)total / tokens.length;
		
		return average;
		
	}
	
	//method closes file
	public void close() throws IOException{
		inputFile.close();
	}
	
}//end class
