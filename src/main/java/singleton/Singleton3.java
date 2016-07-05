package singleton;

public class Singleton3 {
	 private static Singleton3 instance;  
	 private Singleton3(){} 
	 public static Singleton3 getInstance() {  
		 if (instance == null) { 
			 //线程不安全
		     instance = new Singleton3();
		 }  
		 return instance;  
	 }  
}
