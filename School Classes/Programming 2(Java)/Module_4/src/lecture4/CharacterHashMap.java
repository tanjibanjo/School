package lecture4;

import java.util.HashMap;
import java.util.Map;

public class CharacterHashMap {

	public static void main(String[] args) {
		//create a hashmap to store data
		Map<String, Character<Integer> > gameCharacters = new HashMap<>();
		
		//lets make some character objects to use in the map
		Character<Integer> mario = new Character<>("Mario", 5);
		Character<Integer> luigi = new Character<>("Luigi", 7);
		
		//now store our characters in the map
		gameCharacters.put(mario.getName(), mario);
		gameCharacters.put(luigi.getName(), luigi);
		
		//display from map
		System.out.println(gameCharacters.get("Mario").getName() );
		System.out.println(gameCharacters.get("Mario").getLevel() );
		System.out.println(gameCharacters.get("Luigi").getName() );
		System.out.println(gameCharacters.get("Luigi").getLevel() );

	}

}
