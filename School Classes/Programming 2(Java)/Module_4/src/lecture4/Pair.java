package lecture4;

public class Pair<T, U> {
	//declare instance variables
	private T first;
	private U second;
	
	//constructors
	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	
	public U getSecond() {
		return second;
	}
}
