package command;

/**
 * Created by zhengpeng on 2016/6/20.
 */

/**
 * 凉菜的订单
 */
public class LiangCaiOrderCommand implements IOrderCommand {
    private LiangCaiChuShi liangCaiChuShi = new LiangCaiChuShi();

    @Override
    public void doExecute() {
        liangCaiChuShi.makeCook();
    }

}
