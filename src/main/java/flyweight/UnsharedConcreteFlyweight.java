package flyweight;

/**
 * Created by Jary on 2016/6/13.
 */
public class UnsharedConcreteFlyweight extends Flyweight{
    private ConcreteFlyweight concreteFlyweight;
    private String unsharedValue;

    @Override
    public void operation() {
        System.out.println("Concrete---Flyweight : " + concreteFlyweight.getString() + "   unsharedValue:" + unsharedValue);
    }

    public UnsharedConcreteFlyweight(ConcreteFlyweight concreteFlyweight, String unsharedValue) {
        this.concreteFlyweight = concreteFlyweight;
        this.unsharedValue = unsharedValue;
    }

    public ConcreteFlyweight getConcreteFlyweight() {
        return concreteFlyweight;
    }

    public void setConcreteFlyweight(ConcreteFlyweight concreteFlyweight) {
        this.concreteFlyweight = concreteFlyweight;
    }

    public String getUnsharedValue() {
        return unsharedValue;
    }

    public void setUnsharedValue(String unsharedValue) {
        this.unsharedValue = unsharedValue;
    }


}
