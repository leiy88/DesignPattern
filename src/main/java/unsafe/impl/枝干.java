package unsafe.impl;


import unsafe.根;

import java.util.ArrayList;
import java.util.List;

/**
 * 枝干有增加删除等功能
 * Created by yyfan on 2016/6/3 0003.
 */
public class 枝干 extends 根 {
    private List<根> cList;

    public 枝干() {
        cList = new ArrayList<根>();
    }

    public 枝干(String name) {
        super(name);
        cList = new ArrayList<根>();
    }

    @Override
    public void add(根 g) {
        cList.add(g);
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(new String(sb) + this.getName());
        for (根 g : cList) {
            g.display(depth + 2);
        }
    }

    @Override
    public void romove(根 g) {
        cList.remove(g);
    }
}
