package builder;

import java.util.ArrayList;
import java.util.List;

public class SamsungPhone {
	List<String> parts = new ArrayList<String>();

    public void createCPU() {
        parts.add("CUP: MTK");
    }

    public void createScreen() {
        parts.add("SCREEN: Samsung");
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
