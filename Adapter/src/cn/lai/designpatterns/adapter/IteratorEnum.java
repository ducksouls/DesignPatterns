package cn.lai.designpatterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/13 15:22
 */
public class IteratorEnum implements Enumeration {
    Iterator it ;

    public IteratorEnum(Iterator it) {
        this.it = it;
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
