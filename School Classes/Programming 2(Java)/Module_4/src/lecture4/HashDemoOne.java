package lecture4;

import java.util.HashMap;

public class HashDemoOne {
	
	public static void main(String[] args) {
		//local variables
		HashMap<String, Integer> map = new HashMap<>();
		
		//add elements to hashmap
		map.put("Alice", 23);
		map.put("Bob", 27);
		map.put("Charlie", 33);
		
		//print all the keys
		for(String name: map.keySet() )
			System.out.println(name);
		
		//print all values
		for(int age : map.values() )
			System.out.println(age);
		
		System.out.println("The size of the map is: " + map.size());
		
	}

}
