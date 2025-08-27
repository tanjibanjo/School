//Lane Pollock
//Java
//15 Oct 2024
//Driver to test the DVD class using arrayList

package lecture3;

import java.text.NumberFormat;
import java.util.ArrayList;

public class DVDDriver {

	public static void main(String[] args) {
		// local var
		ArrayList<DVD> myMovies = new ArrayList<DVD>();
		double totalCost = 0.00;
		String report;
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		//add movies to the list
		myMovies.add(new DVD ("The Godfather", "Francis Ford Coppola", 1972, 24.95, true) );
		myMovies.add(new DVD("District 9", "Neil Blomkamp", 2009, 19.95, false));
		myMovies.add(new DVD("Iron Man", "John Favreau", 2008, 19.95, false));
		myMovies.add(new DVD("All About Eve", "Joseph Mankiewicz", 1950, 17.50, false));
		myMovies.add(new DVD("The Matrix", "Andy and Lana Wachowski", 1999, 19.95, true));
		
		//iterate through the list and list movies
		for(DVD myDVD : myMovies) {
			System.out.println(myDVD);
			totalCost += myDVD.getCost();
		}
		
		//display a report on the movie list
		report = "~~~~~~~~~~~~~~~~~~~~~~~\n";
		report += "My DVD Collection\n\n";
		report += "Number of DVDs: " + myMovies.size() + "\n";
		report += "Total Cost: " + fmt.format(totalCost) + "\n";
		report += "Average Cost: " + fmt.format(totalCost/myMovies.size());
		
		System.out.println(report);
		

	}

}
