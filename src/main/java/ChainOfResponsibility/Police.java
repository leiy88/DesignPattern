package ChainOfResponsibility;

/**
 * Created by baodinglan on 2016/6/13.
 */
public class Police extends PoliceStation {
    @Override
    public void call() {
        if(!isSuccess) {
            System.out.println("派部下解救");
            isSuccess = true;
            if(getHandler() != null) {
                handler.call();
            }
        }
    }
}
