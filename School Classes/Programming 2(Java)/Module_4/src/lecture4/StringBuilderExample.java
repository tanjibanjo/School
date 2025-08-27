package lecture4;

public class StringBuilderExample {

	public static void main(String[] args) {
		// local variables
		StringBuilder sb = new StringBuilder();
		//this is a sb with capacity 16^
		
		//append
		sb.append("Hello, ");
		sb.append("world.");
		
		//print using toString
		System.out.println("Appended StringBuilder: " + sb.toString());
		
		//insert a value in the middle
		sb.insert(7,  "beautiful "); //offset and string to insert
		System.out.println("Inserted StringBuilder: " + sb);
		
		//replace part of a sb
		//with replace, go one index further for end point! Why? Because.
		sb.replace(7,  16, "amazing");
		System.out.println("Replaced StringBuilder: " + sb);
		
		//delete part of SB
		sb.delete(7, 15);
		System.out.println("Deleted Stringb: " + sb);
		
		//reverse string
		sb.reverse();
		System.out.println("Reversed: " + sb);
		
		//length
		System.out.println("Length: " + sb.length());

	}

}
