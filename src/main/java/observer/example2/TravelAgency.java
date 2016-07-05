package observer.example2;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency implements Subject {

	private List<Observer> personList;
	private String time;
	private String place;
	
	public TravelAgency() {
		personList=new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		personList.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		personList.remove(o);

	}

	@Override
	public void notifyObservers() {
		for (Observer o : personList) {
			o.update(this);
		}

	}
	public void givePlan(String time,String place){
		this.time=time;
		this.place=place;
		this.notifyObservers();
	}

	public String getTime() {
		return time;
	}

	public String getPlace() {
		return place;
	}

}
