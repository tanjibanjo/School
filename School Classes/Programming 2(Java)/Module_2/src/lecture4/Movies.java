//class represents a movie with title release year and director

package lecture4;

public class Movies {
	//instance variables
	private String title, director;
	private int year;
	
	//constructors
	public Movies() {
		this.title = "Not Set";
		this.director = "Not Set";
		this.year = 0;
	}
	
	public Movies(String title, int year, String director) {
		this.title = title;
		this.year = year;
		this.director = director;
	}

	//setters
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setYear(int year) {
		if(year < 1900) {
			this.year = 2000;
			System.out.println("Incorrect data - year set at 2000");
		}
		else //not less than 2000
			this.year = year;
	}
	
	//getters

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public int getYear() {
		return year;
	}
	
	//class methods
	//method to return movie data as a string
	public String printMovieInfo() {
		String myReturn;
		myReturn = "Movie Title: " + title;
		myReturn += "\nMovie Year: " + year;
		myReturn += "\nMovie Director: " + director;
		
		return myReturn;
	}
	
	//method to print movie data from inside method
	public void printMovie() {
		System.out.println("Movie Title: " + title);
		System.out.println("Movie Year: " + year);
		System.out.println("Movie Director: " + director);
	}
	
}
