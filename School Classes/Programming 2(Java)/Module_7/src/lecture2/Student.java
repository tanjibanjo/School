package lecture2;

public class Student implements Comparable<Student>{
	//instance variables
	private String name;
	private int    age;
	
	//const
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//implement compareTo
	@Override
	public int compareTo(Student other) {
		//compare based on age
		return Integer.compare(this.age, other.age);
	}
	
	@Override
	public String toString() {
		return "Student{" +
				"name: " + name + " || " + "age: " + age + "}";
	}

}
