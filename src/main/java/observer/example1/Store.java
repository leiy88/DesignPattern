package observer.example1;

import java.util.ArrayList;
import java.util.List;

public class Store implements Subject {
	private List<Observer> customers;
	private String storeName;
	private String info;
	public Store(){}
	public Store(String storeName) {
		customers = new ArrayList<Observer>();
		this.storeName = storeName;

	}

	@Override
	public void registerObserver(Observer o) {
		customers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		customers.remove(o);

	}

	@Override
	public void notifyObservers(String info) {
		for (Observer o : customers) {
			o.upadte(info);
		}
	}

	public void change(String info) {
		this.info=info;
		System.out.println("具体目标的改变："+this.getStoreName()+this.info);
		this.notifyObservers(this.info);
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
