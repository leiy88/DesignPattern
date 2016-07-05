package decorator;


import decorator.impl.火腿肠;
import decorator.impl.生菜;
import decorator.impl.鸡蛋;
import decorator.impl.鸡蛋饼;

/**
 * Created by yyfan on 2016/6/1 0001.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("鸡蛋饼8元，火腿肠2元，生菜1.5元，鸡蛋2元");
        饼 bing = new 鸡蛋饼();
        System.out.println(bing.getName()+"  价钱："+bing.getPrice());

        火腿肠 htc = new 火腿肠(bing);
        System.out.println(htc.getName()+"  价钱："+htc.getPrice());

        生菜 sc = new 生菜(htc);
        System.out.println(sc.getName()+"  价钱："+sc.getPrice());

        鸡蛋 jd = new 鸡蛋(sc);
        System.out.println(jd.getName()+"  价钱："+jd.getPrice());
    }
}
