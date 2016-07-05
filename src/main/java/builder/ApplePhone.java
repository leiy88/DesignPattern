package builder;

import java.util.ArrayList;
import java.util.List;

public class ApplePhone {
	List<String> parts = new ArrayList<String>();

    public void createCPU() {
        parts.add("CUP: Qualcomm");
    }

    public void createScreen() {
        parts.add("SCREEN: JDI");
    }

    public void createBattery() {
        parts.add("BATTERY: DeSai");
    }

    public void show(){
        System.out.print("产品部件信息：");
        for(String part : parts){
            System.out.print(part + "\t");
        }
    }
}
