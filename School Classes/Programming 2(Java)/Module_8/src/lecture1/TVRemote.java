package lecture1;

public class TVRemote {
	public static void main (String[] args) {
		
	TVContextClass context = new TVContextClass();
	State startState = new TVStartState();
	State stopState = new TVStopState();
	
	context.setState(startState);
	context.doAction();
	context.setState(stopState);
	context.doAction();
	
	}

}
