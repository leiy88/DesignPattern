package singleton;

public class Singleton6 {
	private static class SingletonHolder { 
		private static final Singleton6 INSTANCE = new Singleton6();  
	}  
	
	private Singleton6(){}  
	
	public static final Singleton6 getInstance() {  
		return SingletonHolder.INSTANCE; 
	}

}


//静态内部类只有当被调用的时候才开始首次被加载，类只被加载一次
//线程安全，延时加载