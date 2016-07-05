package unsafe;

/**
 * Created by yyfan on 2016/6/3 0003.
 */
public abstract class 根 {
    private String name;

    public 根(String name) {
        this.name = name;
    }

    public 根() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void add(根 g);

    public abstract void romove(根 g);

    public abstract void display(int depth);
}
