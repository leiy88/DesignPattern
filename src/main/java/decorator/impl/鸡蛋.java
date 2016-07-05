package decorator.impl;


import decorator.配料;
import decorator.饼;

/**
 * Created by yyfan on 2016/6/3 0003.
 */
public class 鸡蛋 extends 配料 {

    public 鸡蛋(饼 bing) {
        super(bing);
    }

    @Override
    public String getName() {
        return super.getName() + " 加鸡蛋";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2;
    }
}
