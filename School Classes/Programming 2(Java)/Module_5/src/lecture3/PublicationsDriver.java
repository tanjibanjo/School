//this class is a driver to test and demonstrate out textbook, and magazine classes as subclasses of parent publication

package lecture3;

import java.time.LocalDate;

public class PublicationsDriver {

	public static void main(String[] args) {
		//local variables
		Magazine myMagazine;
		
		//create local date for magazine
		LocalDate myDate = LocalDate.of(2022, 8, 30);
		
		//instantiate the magazine object
		myMagazine = new Magazine("TIME Magazine", "Time Life Publisher",
					83, "Monthly", myDate);
		
		System.out.println(myMagazine.printInformation());
		
		System.out.println();
		
		//*******************************
		// TEXTBOOK 
		//*******************************
		//local variables
		Textbook myBook = new Textbook("Learn Java", "Bart Simpson", 759, "8th Edition",
				"Computer Science");
		
		System.out.println(myBook.printInformation());

	}

}
