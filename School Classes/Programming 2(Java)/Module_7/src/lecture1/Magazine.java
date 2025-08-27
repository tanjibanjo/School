//class derived from Publication 
//java inheritance demo

package lecture1;

import java.time.LocalDate;

public class Magazine extends Publication implements WriteRecordToFile{
	//instance variables
	private String subscriptionType;
	private LocalDate subscriptionDate;
	
	public Magazine(String title, String author, int number, String subscriptionType, LocalDate subscriptionDate) {
		super(title, author, number);
		this.subscriptionType = subscriptionType;
		this.subscriptionDate = subscriptionDate;
	}
	
	//getters / setters

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
	
	//methods
	public String printInformation() {
		return super.printInformation() + "Subscrition Type: "
				+ this.getSubscriptionType() +
				"\nSubscription Date: " + this.getSubscriptionDate() + "\n";
	}
	

}
