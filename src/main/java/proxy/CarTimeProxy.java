package proxy;

public class CarTimeProxy implements Moveable {

	public CarTimeProxy(Car car) {
		super();
		this.car = car;
	}

	private Car car;
	
	/**
	 * 记录行驶时间
	 * 聚合方式
	 */
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("开始行驶....");
		
		car.move();
		
		long endtime = System.currentTimeMillis();
		System.out.println("结束行驶....  行驶时间" + (endtime - starttime) + "毫秒");
	}

}
