package lecture4;

public class PersonDriver {

	public static void main(String[] args) {
		// local variables
		Person myPerson;
		//create 2 addresses
		Address wAddress = new Address("1223 Fredericksburg Ave", "San Antonio", "Texas", "78451");
		Address hAddress = new Address("45 2nd Street", "San Antonio", "Texas", "78228");
		
		//create a person and populate addresses
		myPerson = new Person("Lane", "Pollock", 25, hAddress, wAddress);
		
		//print data
		System.out.println(myPerson);

	}

}
