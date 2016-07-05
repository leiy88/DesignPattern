package proxy;

import java.util.Random;

public class Car implements Moveable {
	
	public void move() {
		//实现开车
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("行驶中....");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
