package bridge.improve;

/**
 * Created by Administrator on 2016/5/29.
 */
public class Street extends Road {
    @Override
    public void getPrice() {
        getBooking().booking();
        System.out.println("Street price");
    }
}
