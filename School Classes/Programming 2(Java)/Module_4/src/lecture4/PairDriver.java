package lecture4;

public class PairDriver {

	public static void main(String[] args) {
		//local variables
		Pair<String, Integer> pair = new Pair<>("Hello", 5);
		
		//list the values
		System.out.println("First: " + pair.getFirst());
		System.out.println("Second: " + pair.getSecond() );

	}

}
