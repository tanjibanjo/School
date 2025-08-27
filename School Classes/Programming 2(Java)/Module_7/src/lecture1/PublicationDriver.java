package lecture1;

import java.time.LocalDate;

public class PublicationDriver {

	public static void main(String[] args) {
		//local variables
		LocalDate myDate = LocalDate.of(2022,  8, 30);
		Textbook textbookOne = new Textbook("Learn Java", "Bart Simpson", 759, "Eighth Edition", "Computer Science");
		Textbook textbookTwo = new Textbook("Learn C++", "Fred Flinstone", 832, "7th Edition", "Computer Science");
		Magazine magazineOne = new Magazine("Alamo Colleges Magazine","ACCC", 83, "Monthly", myDate);
		Magazine magazineTwo = new Magazine("Time Magazine", "Time Life Publisher", 83, "Monthly", myDate);
		
		//display textbook info
		System.out.println(textbookOne.printInformation());
		System.out.println(textbookTwo.printInformation());
		
		System.out.println(magazineOne.printInformation());
		System.out.println(magazineTwo.printInformation());
		
		//output textbook info to file
		textbookOne.writeRecordToFile(textbookOne.printInformation());
		textbookTwo.writeRecordToFile(textbookTwo.printInformation());

		
		magazineOne.writeRecordToFile(magazineOne.printInformation());
		magazineTwo.writeRecordToFile(magazineTwo.printInformation());
	}

}
