//publication class to serve as a base class for publications - parent
//java

package wrappingItUp;

import java.util.Objects;

public class Publication {
	//instance variables
	String title, ISBN;
	int numberOfPages;
	Author pubAuthor;
	
	//setters and getters
	public String getTitle() {
		return title;
	}
	
	protected void setTitle(String title) {
		this.title = title;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	protected Author getPubAuthor() {
		return new Author(pubAuthor);
	}
	
	protected void setPubAuthor(Author pubAuthor) {
		this.pubAuthor = new Author(pubAuthor);
	}
	
	//constructors
	protected Publication() {
		this.title = "Not set";
		this.pubAuthor = new Author();
		this.numberOfPages = -1;
		this.ISBN = "XXXXXXXXXXX";
	}
	

	protected Publication(String title, String iSBN, int numberOfPages, Author pubAuthor) {
		this.title = title;
		this.ISBN = iSBN;
		this.numberOfPages = numberOfPages;
		this.pubAuthor = new Author(pubAuthor);
	}
	

	protected Publication(Publication b) {
		this.title = b.title;
		this.pubAuthor = new Author(b.pubAuthor);
		this.numberOfPages = b.numberOfPages;
		this.ISBN = b.ISBN;
	}
	
	//Overrides
	
	@Override 
	public String toString() {
		String str;
		
		str = "Title: " + this.title 
			+ "\nISBN: " + this.ISBN
			+ "\nNumber of Pages: " + this.numberOfPages
			+ "\n" + pubAuthor;
		
		return str;
	}
	
	@Override 
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || o.getClass() != getClass() ) return false;
		
		Publication publication = (Publication)o;
		return numberOfPages == publication.numberOfPages &&
				Objects.equals(title, publication.title) &&
				Objects.equals(ISBN, publication.ISBN) &&
				Objects.equals(pubAuthor, publication.pubAuthor); //we can use == with #pages because it is not an object like the Strings
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(title, pubAuthor, numberOfPages, ISBN);
	}

}
