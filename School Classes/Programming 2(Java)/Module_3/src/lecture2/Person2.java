//Lane Pollock
//java
//this program demos overriding hash and equals with a person class

package lecture2;

import java.util.Objects;

public class Person2 {
	//instance variables
	private int age;
	private String firstName, lastName;
	
	//constructor
	Person2(String firstName, String lastName, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	//getters and setters

	public int getAge() {
		return age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//@override functions
	public boolean equals(Object o) {
		if (this == o) //object o is equal in content
			return true;
		if (o == null || getClass() != o.getClass()) //if o is null or is of a dif class
			return false;
		//since we've checked, now we type cast the object to the class
		Person2 person = (Person2) o;
		return age == person.age && Objects.equals(firstName, person.firstName) 
				   && Objects.equals(lastName,  person.lastName);
	}
	
	//hashcode
	public int hashCode() {
		return Objects.hash(firstName, lastName, age);
	}

}
