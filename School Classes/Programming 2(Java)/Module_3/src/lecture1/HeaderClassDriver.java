// Lane Pollock
// 19 sep 2024
// module 3 HeaderClass demo using static private and public utilities
// driver for HeaderClass


package lecture1;

public class HeaderClassDriver {

	public static void main(String[] args) {
		// print header
		System.out.println( HeaderClass.printHeader() ); //we have to call function directly from class because it's static!!
		
		//overloaded
		System.out.println( HeaderClass.printHeader("This is an overloaded method.") );
		
		//print footer
		System.out.println( HeaderClass.printFooter() );
		
		//display number of times used
		System.out.println("The class was used " + HeaderClass.getTimesUsed() + " times.\n");
		

	}

}
