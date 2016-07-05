package Iterator;

import java.util.Vector;

/**
 * Created by zhengpeng on 2016/6/17.
 */
public class ConcreteIterator implements Iterator {
    private Vector vector;
    //当前游标
    int cursor = 0;

    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return vector.get(this.cursor++);
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        if (this.cursor == vector.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean remove() {
        this.vector.remove(cursor);
        return true;
    }
}
