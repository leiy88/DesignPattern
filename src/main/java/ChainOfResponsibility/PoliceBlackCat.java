package ChainOfResponsibility;

/**
 * Created by baodinglan on 2016/6/13.
 */
public class PoliceBlackCat extends PoliceStation {
    @Override
    public void call() {
        System.out.println("报告黑猫警长");
        if(getHandler() != null) {
            handler.call();
        }
    }
}
