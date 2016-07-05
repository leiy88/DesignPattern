package decorator;

/**
 * Created by yyfan on 2016/6/3 0003.
 */
public class 配料 implements 饼 {
    private 饼 bing;

    public 配料(饼 bing) {
        this.bing = bing;

    }

    public String getName() {
        return bing.getName();
    }

    public double getPrice() {
        return bing.getPrice();
    }
}
