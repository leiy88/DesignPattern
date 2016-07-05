package singleton;

public class Singleton5 {
	private static Singleton5 instance = null;
	private Singleton5(){}
	public static Singleton5 getInstance(){
		if(instance==null){//检查实例是否存在，如果不存在进入下面的synchronized代码块 
			synchronized(Singleton5.class){ 
				if(instance==null){//拿到锁后再次判断实例是否存在，如果不存在才创建实例
					 instance = new Singleton5();
				}
			}
		}
		return instance;
	}

}
//双重检查锁定