package observer.example2;

public class Test {
	public static void main(String[] args) {
		//两个具体目标
		TravelAgency t=new TravelAgency();
		WeatherStation w=new WeatherStation();
		//一个具体观察者
		Person p=new Person();
		//该观察者观察两个目标
		t.registerObserver(p);
		w.registerObserver(p);
		//目标变化
		t.givePlan("2017-10-01","韩国");
		w.tellWeather("阴，北风 3~4级");
	}
}
