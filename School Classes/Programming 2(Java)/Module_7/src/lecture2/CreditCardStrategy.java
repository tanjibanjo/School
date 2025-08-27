//concrete class that implements PaymentStrategy interface

package lecture2;

public class CreditCardStrategy implements PaymentStrategy{
	//instance variables
	private String cardNumber;
	private String expiryDate;
	private String cvv;
	
	//constructor
	public CreditCardStrategy(String cardNumber, String expiryDate, String cvv) {
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}
	
	//implement interface methods
	public void pay(double amount) {
		System.out.println("Paying " + amount + " with credit card.");
	}

}
