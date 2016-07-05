package Iterator;

/**
 * Created by zhengpeng on 2016/6/17.
 */
public interface Aggregate {
    public void add(Object object);

    public void remove(Object object);

    public Iterator iterator();
}
