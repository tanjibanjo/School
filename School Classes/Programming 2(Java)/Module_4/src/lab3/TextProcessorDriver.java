//************************************************************************
// Author: Lane Pollock
// Date: 22 Oct 2024
// Language: Java
// Assignment: Lab 4.3
// Description: Driver class to test the functionality of TextFile -
//  Processor
//************************************************************************

package lab3;

import java.io.IOException;

public class TextProcessorDriver {

	public static void main(String[] args) throws IOException {
		//local variables
		String fileName = "Mytext.txt";
		
		//calculate and print wordcount
		System.out.print("Number of words in file: ");
		System.out.println(TextFileProcessor.wordCount(fileName));
		
		//calculate and print we count
		System.out.print("Number of times 'we' appears in file: ");
		System.out.println(TextFileProcessor.weCount(fileName));
		
		//replace all 'people' instances with 'People'
		System.out.print("Text with 'people' capitalized:\n\n");
		TextFileProcessor.capitalizePeople(fileName);
		
		

	}

}
