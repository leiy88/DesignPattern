package command;

/**
 * Created by zhengpeng on 2016/6/20.
 */
public class Client {
    public static void main(String[] args) {
        //通过代码我们可以看到，当我们调用时，执行的时序首先是调用者类，然后是命令类，
        // 最后是接收者类。也就是说一条命令的执行被分成了三步，
        // 它的耦合度要比把所有的操作都封装到一个类中要低的多，而这也正是命令模式的精髓所在：
        // 把命令的调用者与执行者分开，使双方不必关心对方是如何操作的。
        GuestInvoker guest=new GuestInvoker();
        //点凉菜
        guest.setOrderCommand(new LiangCaiOrderCommand());
        guest.doExecute();

        //点热菜
        guest.setOrderCommand(new ReCaiOrderCommand());
        guest.doExecute();


    }
}
