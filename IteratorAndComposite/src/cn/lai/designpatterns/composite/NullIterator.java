package cn.lai.designpatterns.composite;

import java.util.Iterator;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/16 9:44
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
