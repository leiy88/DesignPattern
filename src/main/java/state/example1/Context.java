package state.example1;

public class Context {
	private State currentState;
	public State getCurrentState(){
		return currentState;
	}
	public void setCurrentState(State currentState){
		this.currentState=currentState;
	}
	public void canDo(){
		currentState.canDo(this);
	}
}
