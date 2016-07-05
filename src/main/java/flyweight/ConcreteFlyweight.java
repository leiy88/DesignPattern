package flyweight;

/**
 * Created by Jary on 2016/6/6.
 */
public class ConcreteFlyweight extends Flyweight{
    private String string;

    public ConcreteFlyweight(String str){
        string = str;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void operation(){
        System.out.println("Concrete---Flyweight : " + string);
    }
}
