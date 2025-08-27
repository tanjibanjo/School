package lecture4;

public class Character<T> {
	//instance variables
	private String name;
	private T level;
	
	//constructor
	public Character(String name, T level) {
		this.name = name;
		this.level = level;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	public T getLevel() {
		return level;
	}

}
