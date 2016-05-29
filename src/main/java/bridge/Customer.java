package bridge;

/**
 * Created by Administrator on 2016/5/29.
 */
public class Customer {

    private Booking booking;

    public void getPrice(){
        booking.booking();
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
//        customer.setBooking(new Dida());
        customer.setBooking(new DidaOnHighway());
        customer.getPrice();
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
