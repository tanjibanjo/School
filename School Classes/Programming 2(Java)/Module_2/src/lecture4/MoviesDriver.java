//driver class for movies class

package lecture4;

import java.util.Scanner;

public class MoviesDriver {

	public static void main(String[] args) {
		// local variables
		String myTitle, myDirector;
		int myYear;
		
		Movies movie1 = new Movies();
		Movies movie2;
		
		//create scanner for reading input
		Scanner in = new Scanner(System.in);
		
		//get values from user
		System.out.println("Enter the name of movie1: ");
		myTitle = in.nextLine();
		
		System.out.println("Enter the director of movie1: ");
		myDirector = in.nextLine();
		
		System.out.println("Enter the year of the movie1: ");
		myYear = in.nextInt();
		
		//clear buffer after reading int
		in.nextLine();
		
		//set values for movie1
		movie1.setTitle(myTitle);
		movie1.setDirector(myDirector);
		movie1.setYear(myYear);
		
		//display movie1 details
		movie1.printMovie();
		
		//get values from user
		System.out.println("Enter the name of movie2: ");
		myTitle = in.nextLine();
				
		System.out.println("Enter the director of movie2: ");
		myDirector = in.nextLine();
		
		System.out.println("Enter the year of the movie2: ");
		myYear = in.nextInt();
				
		//clear buffer after reading int
		in.nextLine();
		
		//update movie2
		movie2 = new Movies(myTitle, myYear, myDirector);
		
		//print movie 2
		System.out.println(movie2.printMovieInfo() );
		
		in.close();

	}

}
