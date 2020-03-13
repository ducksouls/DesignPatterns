package cn.lai.designpatterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *这是一个适配器...双向适配
 * @author ZNXM-007
 */
public class EnumerationIterator implements Iterator,Enumeration {

    Enumeration e;
    Iterator it;

    public EnumerationIterator(Enumeration e) {
        this.e = e;
    }
    public EnumerationIterator(Iterator it) {
        this.it = it;
    }

    @Override
    public boolean hasNext() {
        return e.hasMoreElements();
    }

    @Override
    public Object next() {
        return  e.nextElement();
    }

    /**
     * 在这里，枚举类没有办法支持remove操作，枚举是一个只读的接口
     */
    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }

    @Override
    public boolean hasMoreElements() {
        return it.hasNext();
    }

    @Override
    public Object nextElement() {
        return it.next();
    }
}
