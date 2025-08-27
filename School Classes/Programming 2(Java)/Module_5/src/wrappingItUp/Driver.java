package wrappingItUp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Driver {

	public static void main(String[] args) {
		//local var
		//create a date for the magazine
		LocalDate myDate = LocalDate.of(2024, 8, 30);
		ArrayList<Pair<String, Publication> > myPairList = new ArrayList<>();
		//create a couple authors
		Author firstAuthor = new Author("Kevin", "Roark", "kroark@alamo.edu", "210-555-1212");
		Author secondAuthor = new Author("Sam", "Read", "sam@alamo.edu", "210-555-5555");
		
		System.out.println("Testing Application...");
		
		//create a textbook - inherits from publication
		TextBook firstBook = new TextBook("Intro to Java", firstAuthor, 350, "First Edition", "Computer Science", "123456789");
		System.out.println("Example of TextBook:");
		System.out.println(firstBook);
		
		//create a magazine
		Magazine firstMagazine = new Magazine("Today's Tech", secondAuthor, "987654321", 95, "Monthly", myDate);
		System.out.println("Example of Magazine:");
		System.out.println(firstMagazine);
		
		//now lets create our pairs - it knows whether we use textboook or magazine
		Pair<String, Publication> myPubOne = new Pair<>(firstBook.getISBN(), firstBook);
		Pair<String, Publication> myPubTwo = new Pair<>(firstMagazine.getISBN(), firstMagazine);
		System.out.println("Printing Pairs:");
		System.out.println("ID: " + myPubOne.getID() + "\n" + myPubOne.getData().toString());
		System.out.println("ID: " + myPubTwo.getID() + "\n" + myPubTwo.getData().toString());
		
		//create hashmap
		HashMap<String, Publication> pubHashMap = new HashMap<>();
		pubHashMap.put(firstBook.getISBN(), firstBook);
		pubHashMap.put(firstMagazine.getISBN(), firstMagazine);
		
		//loop through map
		System.out.println("Iterating through the HashMap");
        for (Map.Entry<String, Publication> entry : pubHashMap.entrySet()) {
            System.out.println("ISBN: " + entry.getKey());
            System.out.println(entry.getValue());
        }
        //now to demostrate that a hashmap needs to have a unique ID
        //Notice how the pair version did not get added
        System.out.println("Iterating through the HashMap - notice the duplicate does not get added");
        //here we will try to add an item that already exists - using the Pair version
        pubHashMap.put(myPubOne.getID(), myPubOne.getData());
        // now lets loop through the HashMap
        for (Map.Entry<String, Publication> entry : pubHashMap.entrySet()) {
            System.out.println("ISBN: " + entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("Comparing the Objects");
        if (firstBook.equals(firstMagazine)) {
            System.out.println("The Textbook and Magazine are equal");
        } else {
            System.out.println("The Textbook and Magazine NOT equal");
        }
        if (firstBook.equals(myPubOne.getData())) {
            System.out.println("The Textbook Object and Pair Object are equal");
        } else {
            System.out.println("The Textbook Object and Pair Object NOT equal");
        }
        //Now lets add to our ArrayList
        myPairList.add(myPubOne);
        myPairList.add(myPubTwo);
        //notice how we can now have duplicates
        myPairList.add(myPubOne);
        //now we can iterate through the ArrayList
        System.out.println();
        System.out.println("Using the Pair in an ArrayList using a Lambda Expression");
        myPairList.forEach( (n) -> {
                    System.out.println(n.getData().hashCode());
                    System.out.println(n.getData());
        });

	}

}
