package bridge.improve;

/**
 * Created by Administrator on 2016/5/29.
 */
public class Dida extends Booking {
    @Override
    public void getPrice() {
        road.getPrice();
        System.out.println("Dida price");
    }
}
