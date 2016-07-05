package singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 登记式单例模式，一般是通过一个专门的类对各单例模式的此单一实例进行管理和维护。通过Map方式可以方便的实现
 * */
public class Singleton8 {
	private static Map singleTonMap = new HashMap();
	
    public static Object getInstance(String className) {
    // 判断singleTonMap中是否有此单例，有则取得后返回，无则添加单例后返回
        if (!singleTonMap.containsKey(className)) {
             try {
                 singleTonMap.put(className, Class.forName(className).newInstance());
             } catch (Exception e) {
                 e.printStackTrace();
             }
        }
        return singleTonMap.get(className);
    }
}
