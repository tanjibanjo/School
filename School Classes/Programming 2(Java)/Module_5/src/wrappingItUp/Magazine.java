//class derived from publication

package wrappingItUp;

import java.time.LocalDate;
import java.util.Objects;

public class Magazine extends Publication{
	//instance variables
	private String subscriptionType;
	private LocalDate subscriptionDate;
	
	//constructors
	public Magazine() {
		super();
		this.subscriptionDate = LocalDate.of(1900, 1, 1);
		this.subscriptionType = "No Title";
	}
	
	public Magazine(String title, Author author, String ISBN, int numberOfPages, String subscriptionType, LocalDate subscriptionDate) {
		super(title, ISBN, numberOfPages, new Author(author));
		this.subscriptionDate = subscriptionDate;
		this.subscriptionType = subscriptionType;
	}
	
	public Magazine(Magazine b) {
		super(b.getTitle(),b.getISBN(), b.getNumberOfPages(),new Author(b.getPubAuthor() ) );
		this.subscriptionDate = b.subscriptionDate;
		this.subscriptionType = b.subscriptionType;
	}
	
	//g/s

	public String getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public LocalDate getSubscriptionDate() {
		return subscriptionDate;
	}

	public void setSubscriptionDate(LocalDate subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}
	
	//overrides
	@Override 
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("Subscription Type: " + this.subscriptionType);
		sb.append("Subscription Date: " + this.subscriptionDate + "\n");
		
		return sb.toString();
	}
	
	@Override 
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Magazine mag = (Magazine)o;
		return Objects.equals(subscriptionType, mag.subscriptionType) &&
				Objects.equals(subscriptionDate, mag.subscriptionDate) &&
				Objects.equals(this.getPubAuthor(), mag.getPubAuthor()) &&
				Objects.equals(this.getTitle(), mag.getTitle()) &&
				Objects.equals(this.getISBN(), mag.getISBN()) &&
				Objects.equals(this.getNumberOfPages(), mag.getNumberOfPages());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), subscriptionType, subscriptionDate);
	}
	

}
