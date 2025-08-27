//Person class 

package lecture4;

public class Person {
	//instance variables
	private String firstName, lastName;
	private int age;
	
	//constructors
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName =  lastName;
		this.age = age;
	}
	
	public Person() {
		this("unknown", "unknown", -1);
	}
		
	//setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
		
	public void setLastName(String name) {
		lastName = name;
	}
		
	public void setAge(int age) {
		this.age = age;
	}
	
	//getters
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	
	//methods
	//method to create and return a String with the object's data
	public String printInfo() {
		//local variables
		String myReturn = "";
		
		//three different ways to access variables within the class below!
		//be consistent whichever method is used
		
		//add name and data to string
		myReturn += "Name :" + this.getFirstName() + " " +
				 	 lastName + "\n";
		
		//add age data to String
		myReturn += "Age: " + getAge();
		
		return myReturn;
		
	}

}
