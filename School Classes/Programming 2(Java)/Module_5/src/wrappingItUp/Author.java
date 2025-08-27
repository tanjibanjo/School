//class to represent an author and their attributes
//will be used for aggregation - every publication has an author

package wrappingItUp;

import java.util.Objects;

public class Author {
	//instance variables
	private String email, firstName, lastName, phone;
	
	//constructors
	//default
	public Author() {
		this.firstName = "Unknown";
		this.lastName = "Unknown";
		this.email = "Unknown";
		this.phone = "Unknown";
	}
	//4 par
	public Author(String firstName, String lastName, String email, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	//copy
	public Author(Author b) {
		this.firstName = b.firstName;
		this.lastName = b.lastName;
		this.email = b.email;
		this.phone = b.phone;
	}
	
	//getters / setters
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//let's override our parent functions
	
	//toString 
	@Override
	public String toString() {
		//local var
		StringBuilder sbReturn = new StringBuilder(); //new string builder instance 
		sbReturn.append("Author: \n");
		sbReturn.append("First Name: " + firstName + "\n");
		sbReturn.append("\tLast Name: )" + lastName + "\n");
		sbReturn.append("\tEmail: " + email + "\n");
		sbReturn.append("\tPhone Number: " + phone + "\n");
		
		return sbReturn.toString(); 
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true; //if they are the same object - same memory location
		if(o == null || getClass() != o.getClass() ) return false; //if does not exist or match same class type
		//type cast o to Author so we can check data points
		Author author = (Author)o;
		return Objects.equals(firstName, author.firstName) &&
				Objects.equals(lastName, author.lastName) &&
				Objects.equals(email, author.email) &&
				Objects.equals(phone, author.phone); //compares every field instead of memory
		//we could also use the built in equals method like -
		// lastName.equals(author.lastName) 
		//both work but this demonstrates the Objects.equals^
	}
	
	//we have to Override hashCode whenever we do equals
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, email, phone);
		//it is important to make sure to use all the fields we compare in the equals method here as well
	}
	

}
