package ChainOfResponsibility;

/**
 * Created by baodinglan on 2016/6/13.
 */
public class CapDove extends PoliceStation {
    @Override
    public void call() {
        if(!isDetected){
            System.out.println("派白鸽上尉侦查");
            isDetected = true;
            if(getHandler() != null) {
                handler.call();
            }
        }else{
            if(getHandler() != null) {
                handler.call();
            }
        }
    }
}
