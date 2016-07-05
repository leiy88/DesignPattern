package ChainOfResponsibility;

/**
 * Created by baodinglan on 2016/6/12.
 */
public class ChainOfResponsibility {
    public static void main(String args[]){
        callPoliceBlackCat();
        sendCapDoveFind();
        sendCapWhiteCatRescue();
    }

    private static void callPoliceBlackCat() {
        System.out.println("报告黑猫警长");
    }

    private static void sendCapDoveFind() {
        System.out.println("派白鸽上尉侦查");
    }

    private static void sendCapWhiteCatRescue() {
        System.out.println("派白猫班长解救");
        sendPoliceRescue();
    }

    private static void sendPoliceRescue() {
        System.out.println("派部下解救");
    }
}
