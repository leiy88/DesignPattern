package proxy;

public class Car2 extends Car {

	/**
	 * 记录行驶时间
	 * 继承方式实现
	 */
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("开始行驶....");
		
		super.move();
		
		long endtime = System.currentTimeMillis();
		System.out.println("结束行驶....  行驶时间" + (endtime - starttime) + "毫秒");
	}

	
}
