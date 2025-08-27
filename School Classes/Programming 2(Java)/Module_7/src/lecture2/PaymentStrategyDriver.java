//driver to demonstrate the paymentStrategy interface and its concrete classes

package lecture2;

public class PaymentStrategyDriver {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		//set payment strat dynamically
		cart.setPaymentStrategy(new CreditCardStrategy("1234 5678 9012", "10/26", "111"));
		cart.checkout(100.0);
		
		cart.setPaymentStrategy(new PayPalStrategy("example@gmaul.com", "password"));
		cart.checkout(50.0);

	}

}
