package strategy;


import strategy.impl.AirPlanelStrategy;
import strategy.impl.BicycleStrategy;
import strategy.impl.TrainStrategy;

public class XiaoMing {

	public static void main(String[] args) {
		//创建旅游场景
		PersonContext personContext;
		//北京市内
		personContext = new PersonContext(new BicycleStrategy());
		personContext.travelAlgorithm();
		//北京->秦皇岛
		personContext = new PersonContext(new TrainStrategy());
		personContext.travelAlgorithm();
		//出国
		personContext = new PersonContext(new AirPlanelStrategy());
		personContext.travelAlgorithm();
	}
	
}
