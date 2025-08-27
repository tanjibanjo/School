//new main to demo more polymorphism with classes made last module

package lecture1;

import java.time.LocalDate;
import java.util.ArrayList;

public class PublicationDriver {

	public static void main(String[] args) {
		//array list of publications
		ArrayList<Publication> myPublications = new ArrayList<Publication>(); 
		//we can add BOTH textbooks and magazines to the same list by making it of the parent class type***
		
		
		//date
		LocalDate myDate = LocalDate.of(2024, 10, 31);
		
		//adding textbooks
		myPublications.add(new Textbook("Learn Java", "Bart Simpson", 759, "8th Edition", "Computer Science"));
		myPublications.add(new Textbook("Learn C++", "Fred Flinstone", 759, "7th Edition", "Compuer Science"));
		
		//magazines
		myPublications.add(new Magazine("TIME Magazine", "Time Life Publisher", 83, "Monthly", myDate));
		myPublications.add(new Magazine("Alamo Colleges Magazine", "Alamo Publisher", 70, "Yearly", myDate));
		
		//iterate through and display
		myPublications.forEach((pub) -> System.out.println(pub.printInformation() ) );
	}

}
