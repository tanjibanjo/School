//test the student comparable interface

package lecture2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDriver {

	public static void main(String[] args) {
		//local variables
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Kevin", 20));
		students.add(new Student("Scott", 18));
		students.add(new Student("Everrett", 22));
		
		System.out.println("Before sorting:");
		for(Student student : students)
			System.out.println(student);
		
		Collections.sort(students);
		
		System.out.println("After sorting:");
		for(Student student : students)
			System.out.println(student);

	}

}
