package unsafe.impl;


import unsafe.根;

/**
 * 最终节点
 * Created by yyfan on 2016/6/3 0003.
 */
public class 叶子 extends 根 {
    public 叶子() {

    }

    public 叶子(String name) {
        super(name);
    }

    @Override
    public void add(根 g) {
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(new String(sb) + this.getName());
    }

    @Override
    public void romove(根 g) {

    }
}
