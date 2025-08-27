//interface for printing a publication to a text file


package lecture1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public interface WriteRecordToFile {
	//declare interface variables
	String fileName = "book.txt";
	
	default void writeRecordToFile(String myString) {
		try {
			//create a file writer - set second argument to true to append, not overwrite
			FileWriter fw = new FileWriter(fileName, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			//write argument to file
			bw.write(myString);
			
			//add newline to file
			bw.newLine();
			
			//close the writers
			fw.close();
			bw.close();
		}
		catch (IOException e){
			System.out.println(e.getMessage() + "Error Occurred.");
		}
	}

}
