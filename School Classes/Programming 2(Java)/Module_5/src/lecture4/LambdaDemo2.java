//another lambda demo

package lecture4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaDemo2 {

	public static void main(String[] args) {
		//this uses Runnable interface
		Runnable r = () -> System.out.println("Hello, world!");
		r.run();
		
		//using lambda with a list
		List<String> names = Arrays.asList("Bob", "Alice", "Charlie");
		Collections.sort(names, (a, b) -> a.compareTo(b) );
		
		names.forEach((item) -> {
			System.out.println("Name in list: " + item);
		} );

	}

}
