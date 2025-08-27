//generic pair class

package wrappingItUp;
//this generic allows to create a pair for hash tables
@SuppressWarnings("hiding")
public class Pair<String, T> {
	private String id;
	private T data;
	
	public Pair(String first, T second) {
		this.id = first;
		this.data = second;
	}
	
	public String getID() {
		return this.id;
	}
	
	public T getData() {
		return data;
	}

}
