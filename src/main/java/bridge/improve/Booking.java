package bridge.improve;

/**
 * Created by Administrator on 2016/5/29.
 */
public abstract class Booking {

    protected Road road;

    public abstract void getPrice();

    public Road getRoad() {
        return road;
    }

    public void setRoad(Road road) {
        this.road = road;
    }
}
