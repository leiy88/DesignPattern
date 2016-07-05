package builder.refactor;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
	protected List<String> parts = new ArrayList<String>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.print("产品部件信息：");
        for(String part : parts){
            System.out.print(part + "\t");
        }
    }
}
