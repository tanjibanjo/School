//this program holds a state and implements its action

package lecture1;

public class TVContextClass implements State{
	//instance variables
	private State tvState;
	
	public void setState(State state) {
		this.tvState = state;
	}
	
	public State getState() {
		return this.tvState;
	}
	
	@Override 
	public void doAction() {
		this.tvState.doAction();
	}

}
