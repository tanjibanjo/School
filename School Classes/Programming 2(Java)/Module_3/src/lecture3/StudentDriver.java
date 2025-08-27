//************************************************************************
// Author: Lane Pollock
// Date: 26 Sep 2024
// Language: Java
// Assignment: demo
// Description: program to test the student class
//************************************************************************


package lecture3;

public class StudentDriver {

	public static void main(String[] args) {
		// local variables
		Student student1 = new Student("John", 20);
		Student student2 = new Student(student1);
		
		//display student info
		System.out.println("Student 1: " + student1.name + ", " + student1.age);
		System.out.println("Student 2: " + student2.name + ", " + student2.age);
		
		//change the name of student 2
		student2.name = "Jane";
		
		//display
		System.out.println("Student 1: " + student1.name + ", " + student1.age);
		System.out.println("Student 2: " + student2.name + ", " + student2.age);
		
		System.out.println(student1);
	}

}
