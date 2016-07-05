package observer.example2;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
	private List<Observer> personList;
	private String condition;;

	public WeatherStation() {
		personList = new ArrayList<Observer>();
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

	public void tellWeather(String condition) {
		this.condition=condition;
		this.notifyObservers();
	}

	public String getCondition() {
		return condition;
	}

}
