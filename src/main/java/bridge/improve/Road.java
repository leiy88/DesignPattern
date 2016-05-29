package bridge.improve;

import bridge.Booking;

/**
 * Created by Administrator on 2016/5/29.
 */
public abstract class Road {

    private Booking booking;

    public abstract void getPrice();

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
