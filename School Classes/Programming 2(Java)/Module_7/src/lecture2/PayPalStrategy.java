//Concrete class to implement the payment strategy interface for paypal

package lecture2;

public class PayPalStrategy implements PaymentStrategy{
	//stance variables
	private String email;
	private String password;
	
	//constructors
	public PayPalStrategy(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	//implement interface methods
	public void pay(double amount) {
		System.out.println("Paying " + amount + " with PayPal.");
	}

}
