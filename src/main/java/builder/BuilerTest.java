package builder;

public class BuilerTest {
	private static ApplePhone iphone = new ApplePhone();
	private static SamsungPhone samPhone = new SamsungPhone();

    public static void main(String args[]){
        iphone.createCPU();
        iphone.createScreen();
        iphone.createBattery();
        iphone.show();

        samPhone.createCPU();
        samPhone.createScreen();
        samPhone.createBattery();
        samPhone.show();
    }
}
