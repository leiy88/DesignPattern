package bridge.improve;

/**
 * Created by Administrator on 2016/5/29.
 */
public class Street implements Road {
    @Override
    public void getPrice() {
        System.out.println("Street price");
    }
}
