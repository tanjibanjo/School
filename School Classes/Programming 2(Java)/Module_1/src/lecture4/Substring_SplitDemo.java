//Lane Pollock
//5 Sep 2024
//string class demo from lecture - 
//JAVA

package lecture4;

public class Substring_SplitDemo {
	public static void main(String[] args) {
		//local variables
		String str1 = "The quick brown fox";
		String str2 = " jumped over the lazy dog";
		String str3 = "The quick brown fox";
		
		//output char at position3 
		System.out.println("The character at position 3 is: " + str1.charAt(2) );
		
		//using compare returns a positive, negative number or 0
		//returns the difference in the integer sums of the letter equivalent
		System.out.println("Compare str1 to str2: " + str1.compareTo(str2) );
		System.out.println("Compare str1 to str3: "+ str1.compareTo(str3) );
		
		//equals
		System.out.println("str1 equals str2: " + str1.equals(str2) );
		System.out.println("str1 equals str3: " + str1.equals(str3) );
		
		//using concat method
		System.out.println(str1.concat(str2) );
		System.out.println(str1 + str2);
		str3 = str3 + str3;
		System.out.println(str3);
		
		//finding index
		System.out.println("The word 'quick' starts at index: " + str1.indexOf("quick"));
		System.out.println("The last instance of 'quick' is at index: " + str3.lastIndexOf("quick") );
		
		//length
		System.out.println("The length of str1 is: " + str1.length());
		
		//upper case conversion
		str3 = str1.toUpperCase();
		System.out.println("str3 upper case: " + str3);
		
		//lower case
		System.out.println("str3 lower case: "+ str3.toLowerCase());
		
		//split method with space delimiter
		str3 = str1 + str2;
		String[] words = str3.split(" ");
		System.out.println("The list of words: ");
		for(String word : words)
			System.out.println("\t" + word);
		
		//using with a comma delimeter
		String str4 = "apple,strawberry,peach,pear,orange,plum";
		String[] fruits = str4.split(",");
		System.out.println("fruits list: ");
		for(String fruit : fruits)
			System.out.println("\t" + fruit);
		
		
	}

}
