package lecture2;

public class PersonDriver {
	public static void main(String[] args) {
		Person person = new Person("John Doe", 30);
		String str = person.toString();
		
		//output in different ways
		System.out.println(str);
		System.out.println(person.toString());
		System.out.println(person);
	}

}
