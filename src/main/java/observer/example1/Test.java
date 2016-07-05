package observer.example1;

public class Test {
	public static void main(String[] args) {
		//具体目标
		Store store=new Store("阿迪达斯");
		//具体观察者
		Customer customer1=new Customer("小明明");
		Customer customer2=new Customer("小丽丽");
		//目标注册观察者
		store.registerObserver(customer1);
		store.registerObserver(customer2);
		//目标变动
		store.change("商品降价啦！！！");
		
	}
}
