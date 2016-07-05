package proxy;

public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		
		System.out.println("\n********继承方式**********");
		Moveable m = new Car2();
		m.move();
		
		System.out.println("\n********聚合方式**********");
		Moveable m2 = new CarTimeProxy(car);
		m2.move();
	}

}
