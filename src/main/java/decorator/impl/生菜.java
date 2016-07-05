package decorator.impl;


import decorator.配料;
import decorator.饼;

/**
 * Created by yyfan on 2016/6/3 0003.
 */
public class 生菜 extends 配料 {


    public 生菜(饼 bing) {
        super(bing);
    }

    @Override
    public String getName() {
        return super.getName() + " 加生菜";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.5;
    }
}
