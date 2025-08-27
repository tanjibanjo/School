// Lane Pollock
// Putting together all the concepts in module 1
// java

package lecture4;

//scanner and number format
import java.util.Scanner;
import java.text.NumberFormat;

public class PuttingItAllTogether {

	public static void main(String[] args) {
		//local var to store video game details
		String videoGame, publisher;
		double price;
		int yearReleased;
		
		//create a scanner object to read input stream
		Scanner keyboard = new Scanner(System.in);
		
		//prompt user for name of game
		System.out.println("Please enter name of game: ");
		videoGame = keyboard.nextLine();
		
		//prompt for year of release
		System.out.println("Enter the year of release: ");
		yearReleased = keyboard.nextInt();
		
		//prompt for price
		System.out.println("Please enter the price: $");
		price = keyboard.nextDouble();
		
		//prompt for publisher
		System.out.println("Enter the publisher: ");
		publisher = keyboard.nextLine();
		
		//create a currency formatter to format into a currency string
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		
		//display
		System.out.println("***** Video Game Details *****");
		System.out.println("Game : " + videoGame);
		System.out.println("Publisher: " + publisher);
		System.out.println("Price: $" + price);
		System.out.println("Price: $" + currencyFormatter.format(price)); //will have 2 $ because currency formatting adds
		System.out.println("Year: " + yearReleased);
		System.out.println("*****  End Game Details  *****");
		
		//close scanner
		keyboard.close();
		
		

	}

}
