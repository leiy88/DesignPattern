package bridge.improve;

/**
 * Created by Administrator on 2016/5/29.
 */
public class Didi extends Booking {
    @Override
    public void getPrice() {
        road.getPrice();
        System.out.println("Didi price");
    }
}
