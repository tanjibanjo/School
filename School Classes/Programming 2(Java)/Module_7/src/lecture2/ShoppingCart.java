package lecture2;

public class ShoppingCart {
	//instance variables
	private PaymentStrategy paymentStrategy;
	
	//set paymentStrat
	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	//method to make a payment
	public void checkout(double amount) {
		paymentStrategy.pay(amount);
	}

}
