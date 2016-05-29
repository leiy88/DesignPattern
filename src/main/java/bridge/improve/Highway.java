package bridge.improve;

import bridge.Booking;

/**
 * Created by Administrator on 2016/5/29.
 */
public class Highway extends Road {

    @Override
    public void getPrice() {
        getBooking().booking();
        System.out.println("Highway price");
    }
}
