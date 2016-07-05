package decorator.impl;


import decorator.饼;

/**
 * Created by yyfan on 2016/6/3 0003.
 */
public class 鸡蛋饼 implements 饼 {


    public String getName() {
        return "鸡蛋饼";
    }

    /**
     * 鸡蛋饼卖八元
     * @return
     */
    public double getPrice() {
        return 8;
    }
}
