package state.example2;

public class Context {
	private State currentState;
	public State getCurrentState(){
		return currentState;
	}
	public void setCurrentState(State currentState){
		this.currentState=currentState;
	}
	public void next(){
		currentState.next(this);
	}
}
