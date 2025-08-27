//************************************************************************
// Author: Lane Pollock
// Date: 22 Oct 2024
// Language: Java
// Assignment: Lab 4.3
// Description: TextFileProcessor static class to make changes to a text 
//	file when passed a file name
//************************************************************************


package lab3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcessor {
	
	//method that takes in a file name, then reads the file and returns
	//number of words
	public static int wordCount(String fileName) throws IOException{
		//local variables
		String str = "";
		int count = 0;
		File file = new File(fileName); //new instance of file
		Scanner inFile = new Scanner(file); //new scanner that reads file
		
		//now read the file and store to str
		while(inFile.hasNextLine() ) //while there is a line
			str = inFile.nextLine();
		
		//close the scanner after use
		inFile.close();
		
		//get count by splitting words by space
		count = str.split(" ").length;
		
		//return count
		return count;
	}
	
	//method that counts how many times 'we' is used and returns count
	public static int weCount(String fileName) throws IOException{
		//local variables
		String str = "";
		int count = 0;
		String[] words;
		File file = new File(fileName);
		Scanner inFile = new Scanner(file);
		
		//read the file and store
		while(inFile.hasNextLine() )
			str = inFile.nextLine();
		
		inFile.close(); //close reader
		
		//split string then loop to count 'we'
		words = str.split(" ");
		
		//loop and check for we or We
		for(String word : words) {
			if(word.equals("we") || word.equals("We") )
				count++;
		}
		
		return count;
	}
	
	//method that reads file, then capitalizes people in every instance
	// and returns the string
	public static void capitalizePeople(String fileName) 
			throws IOException{
		//local variables
		String str = "";
		String[] words;
		File file = new File(fileName);
		Scanner inFile = new Scanner(file);
		int iterations, wordCount;
		
		//read the file and store
		while(inFile.hasNextLine() )
			str = inFile.nextLine();
		
		inFile.close(); //close reader
		
		//get word count from file
		wordCount = wordCount(fileName);
		
		//replace all instances of people with People
		str = str.replaceAll("people", "People");
		
		//seperate str to print specific number of words per line
		words = str.split(" ");
		
		//how many complete 15 word lines
		iterations = wordCount / 15; 
		
		//this loop is to print lines of 15 words, while validating
		//that it will not go out of bounds on the last line
		
		//to keep track of where we are in the str
		for(int i = 0; i < wordCount; i++) {
			if(i + 15 < wordCount) {//if enough for full line
				//to print a 15 word group
				for(int j = i; j < i + 15; j++) {
					if(j < i + 14) //not last word
						System.out.print(words[j] + " ");
					else if (j == i + 14) //last word in line
						System.out.print(words[j]);
				} //end inner for
				
				System.out.println();

				//increment by 14 to account for the words we printed
				//i will increment in loop one more time to equal 15
				i += 14; 
				
			} //end if
			else { //not enough for full line
				for(int k = i; k < i + (wordCount - 
										(15 * iterations) ); k++)
					System.out.print(words[k] + " ");
				i = wordCount; //ends loop
			}

		}//end outer for
		
	}

	
} //end class

