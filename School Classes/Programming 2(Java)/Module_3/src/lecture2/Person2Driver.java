package lecture2;

public class Person2Driver {

	public static void main(String[] args) {
		// create Persons
		Person2 person1 = new Person2("Kevin", "Roark", 29);
		Person2 person2 = new Person2("Lane", "Pollock", 25);
		Person2 person3 = new Person2("Kevin", "Roark", 29);
		
		//find out if they are equal
		System.out.println("Is person1 equal to person2?");
		if(person1.equals(person2))
			System.out.println("They are equal.");
		else
			System.out.println("They are not equal");
		
		System.out.println("Is person1 equal to person3?");
		if(person1.equals(person3)) 
			System.out.println("They are equal");
		else
			System.out.println("They are not equal.");
		
		//print hash values
		System.out.println("The hash values for the objects are:");
		System.out.println("Person1 : " + person1.hashCode());
		System.out.println("Person2 : " + person2.hashCode());
		System.out.println("Person3 : " + person3.hashCode());


	}

}
