package command;

/**
 * Created by zhengpeng on 2016/6/20.
 */

/**
 * 热菜的订单
 */
public class ReCaiOrderCommand implements IOrderCommand{
    private ReCaiChuShi reCaiChuShi=new ReCaiChuShi();
    @Override
    public void doExecute() {
        reCaiChuShi.MakeCook();
    }
}
