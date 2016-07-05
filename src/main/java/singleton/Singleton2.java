package singleton;

public class Singleton2 {
	private static Singleton2 instance = null;  
    static {
    instance = new Singleton2();
    //初始化复杂的时候，资源浪费
    }  
    private Singleton2 (){}  
    public static Singleton2 getInstance() {  
    return instance;  
    }  

}
