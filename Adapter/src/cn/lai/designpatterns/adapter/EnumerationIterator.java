package cn.lai.designpatterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {

    Enumeration e;

    public EnumerationIterator(Enumeration e) {
        this.e = e;
    }

    @Override
    public boolean hasNext() {
        return e.hasMoreElements();
    }

    @Override
    public Object next() {
        return e.nextElement();
    }

    /**
     * 在这里，枚举类没有办法支持remove操作，枚举是一个只读的接口
     */
    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
