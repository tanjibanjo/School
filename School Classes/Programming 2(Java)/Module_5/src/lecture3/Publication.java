//this class is a base class for general publications - parent class
//java

package lecture3;

public class Publication {
	//instance variables
	private String title, author;
	private int numberOfPages;
	
	//constructors
	protected Publication (String title, String author, int number) {
		this.title = title;
		this.author = author;
		this.numberOfPages = number;
	}
	
	//getters and setters
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	//methods
	protected String printInformation() {
		return "Title: " + this.getTitle()
			   + "\nAuthor: " + this.getAuthor()
			   + "\nNumber of Pages: " + this.getNumberOfPages()
			   + "\n";
	}
	

}
