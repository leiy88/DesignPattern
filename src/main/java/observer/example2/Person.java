package observer.example2;

public class Person implements Observer {
	

	@Override
	public void update(Subject s) {
		if(s instanceof WeatherStation){
		 WeatherStation	we=(WeatherStation)s;
		 System.out.println("天气情况："+we.getCondition());
		}else{
			TravelAgency tr=(TravelAgency)s;
			System.out.println("出发时间："+tr.getTime()+" ;目的地："+tr.getPlace());
		}

	}

}
