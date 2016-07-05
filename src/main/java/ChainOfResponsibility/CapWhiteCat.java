package ChainOfResponsibility;

/**
 * Created by baodinglan on 2016/6/13.
 */
public class CapWhiteCat extends PoliceStation {
    @Override
    public void call() {
        if(!isSuccess) {
            System.out.println("派白猫班长解救");
            if(getHandler() != null) {
                handler.call();
            }
        }
    }
}
