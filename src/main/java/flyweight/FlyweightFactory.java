package flyweight;

import java.util.HashMap;

/**
 * Created by Jary on 2016/6/6.
 */
public class FlyweightFactory {
    private HashMap flyweights = new HashMap();

    public FlyweightFactory() {
    }

    public Flyweight getFlyWeight(Object obj) {
        Flyweight flyweight = (Flyweight) flyweights.get(obj);
        if (flyweight == null) {
            //产生新的ConcreteFlyweight
            flyweight = new ConcreteFlyweight((String) obj);
            flyweights.put(obj, flyweight);
        }
        return flyweight;
    }

    public Flyweight getFlyWeight(Object obj,String status) {
        ConcreteFlyweight flyweight = (ConcreteFlyweight) flyweights.get(obj);
        if (flyweight == null) {
            //产生新的ConcreteFlyweight
            flyweight = new ConcreteFlyweight((String) obj);
            flyweights.put(obj, flyweight);
        }
        return new UnsharedConcreteFlyweight(flyweight, status);
    }

    public int getFlyweightSize() {
        return flyweights.size();
    }

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight fly1 = factory.getFlyWeight("Google");
        Flyweight fly2 = factory.getFlyWeight("Baidu");
        Flyweight fly3 = factory.getFlyWeight("Dida");
        Flyweight fly4 = factory.getFlyWeight("Google");
        Flyweight fly5 = factory.getFlyWeight("Google");
        Flyweight fly6 = factory.getFlyWeight("Google");

        Flyweight fly7 = factory.getFlyWeight("Google","beijing");

        fly1.operation();
        fly2.operation();
        fly3.operation();
        fly4.operation();
        fly5.operation();
        fly6.operation();
        fly7.operation();

        int objSize = factory.getFlyweightSize();
        System.out.println("objSize = " + objSize);
    }
}
