package strategy;

public class PersonContext {

	private TravelStrategy travelStrategy;

	public PersonContext(TravelStrategy travelStrategy) {
		this.travelStrategy = travelStrategy;
	}
	
	public void travelAlgorithm(){
		travelStrategy.travelAlgorithm();
	}
	
}
