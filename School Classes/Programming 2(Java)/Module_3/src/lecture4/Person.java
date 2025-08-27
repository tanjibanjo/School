//Lane pollock
//24 Sep 2024
//JAVA
//This program demonstrates toString() method

package lecture4;

public class Person {
	private String firstName, lastName;
	private int age;
	private Address homeAddress;
	private Address workAddress;
	
	//constructors
	public Person() {
		this.firstName = "Unknown";
		this.lastName = "Unknown";
		this.age = 0;
		this.homeAddress = new Address();
		this.workAddress = new Address();
	}
	
	public Person(String firstName, String lastName, int age, Address homeAddress, Address workAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.homeAddress = new Address(homeAddress);
		this.workAddress = new Address(workAddress);
	}
	
	//getters/setters
	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = new Address(homeAddress); //use copy constructors!
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = new Address(workAddress); //use copy constructor!
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}
	//use copy constructor to return copies of the class instead of a reference to!
	//only supposed to change the original by use of setters
	public Address getHomeAddress() {
		return new Address(homeAddress);
	}

	public Address getWorkAddress() {
		return new Address(workAddress);
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "\nhomeAddress="
				+ homeAddress + "\nworkAddress=" + workAddress + "]";
	}
	
	//override toString()


}
