//************************************************************************
// Author: Lane Pollock
// Date: 26 Sep 2024
// Language: Java
// Assignment: demo with aggregation
// Description: Textbook class that holds fields of a textbook
//************************************************************************


package lecture3;

public class Textbook {
	//instance variables
	private String title, author, publisher;
	
	//constructors
	public Textbook(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	//copy constructor
	public Textbook(Textbook obj2) {
		this.title = obj2.title;
		this.author = obj2.author;
		this.publisher = obj2.publisher;
	}
	
	//setter
	public void set(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	//override the toString method
	@Override
	public String toString() {
		String str = "\tTitle: " + title +
					"\n\tAuthor: " + author + 
					"\n\tPublisher: " + publisher;
		return str;
	}

}
