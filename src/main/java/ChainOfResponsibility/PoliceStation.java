package ChainOfResponsibility;

/**
 * Created by baodinglan on 2016/6/13.
 */
public abstract class PoliceStation {

    protected PoliceStation handler;
    public PoliceStation getHandler() {
        return handler;
    }
    /**
     * 赋值方法，设置后继的责任对象
     */
    public void setHandler(PoliceStation handler) {
        this.handler = handler;
    }

    protected Boolean isDetected = false;
    protected Boolean isSuccess = false;

    public abstract void call();
}
