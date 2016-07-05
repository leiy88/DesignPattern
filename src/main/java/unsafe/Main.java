package unsafe;


import unsafe.impl.叶子;
import unsafe.impl.枝干;

/**
 * Created by yyfan on 2016/6/3 0003.
 */
public class Main {

    public static void main(String[] args) {
        根 root = new 枝干("嘀嗒拼车");
        根 hrdp = new 枝干("人力部门");
        根 r1 = new 叶子("张仲鑫");
        根 r2 = new 叶子("婷玉");
        根 r3 = new 叶子("寰寰");
        hrdp.add(r1);
        hrdp.add(r2);
        hrdp.add(r3);
        根 jsdp = new 枝干("技术部门");
        根 htz = new 枝干("后台组");
        根 zz1 = new 枝干("杨永鑫");
        根 zy = new 叶子("一众痴男怨女");
        zz1.add(zy);
        htz.add(zz1);
        根 ydz = new 枝干("移动组");
        根 zz2 = new 叶子("略略略");
        ydz.add(zz2);
        根 csz = new 枝干("测试组");
        根 zz3 = new 叶子("略略略");
        csz.add(zz3);
        jsdp.add(htz);
        jsdp.add(ydz);
        jsdp.add(csz);
        根 other = new 枝干("其他小部门");
        根 zz4 = new 叶子("略略略");
        other.add(zz4);


        root.add(hrdp);
        root.add(jsdp);
        root.add(other);
        root.display(0);

    }
}
