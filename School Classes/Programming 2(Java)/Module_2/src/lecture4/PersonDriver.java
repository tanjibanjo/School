//program to test the personClass

package lecture4;

public class PersonDriver {

	public static void main(String[] args) {
		// local variables
		Person myPerson = new Person("Lane", "Pollock", 25);
		Person person2 = new Person();
		
		//display the objects' information
		System.out.println(myPerson.printInfo() );
		System.out.println(person2.printInfo() );
		
		//set age
		myPerson.setAge(35);
		//print update
		System.out.println("New Age: " + myPerson.getAge());
		
		//reset defaults
		person2.setAge(20);
		person2.setFirstName("Lane");
		person2.setLastName("Pollock");
		
		System.out.println(person2.printInfo() );
		
		
	}

}
