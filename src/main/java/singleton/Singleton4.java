package singleton;

public class Singleton4 {
	private static Singleton4 instance;  
	private Singleton4(){}  
	public static synchronized Singleton4 getInstance() { 
		//instance != null 效率不高
		if (instance == null) {  
		instance = new Singleton4();  
		}  
		return instance;  
	}

}
