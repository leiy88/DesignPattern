package command;

/**
 * Created by zhengpeng on 2016/6/20.
 */

/**
 * 客人类
 */
public class GuestInvoker {
    private IOrderCommand orderCommand;

    public void setOrderCommand(IOrderCommand orderCommand) {
        this.orderCommand = orderCommand;
    }

    public void doExecute() {
        orderCommand.doExecute();
    }

}
