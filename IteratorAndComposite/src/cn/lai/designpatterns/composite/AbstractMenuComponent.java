package cn.lai.designpatterns.composite;


import java.util.Iterator;

/**
 * @Description: 抽象出一个抽象节点类(组件),通常为抽象类,在这个例子中是否抽象都无所谓
 *              只需要给每个组件添加一个组件的超类
 * @author: ZNXM-007
 * @date 2020/3/16 8:39
 */
public abstract class AbstractMenuComponent {

    /**
     * 外部迭代
     * @return
     */
    public Iterator createIterator() {
        throw new UnsupportedOperationException();
    }

    public void add(AbstractMenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(AbstractMenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public AbstractMenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    /**
     * 以下方法默认操作都是抛出异常,因为在这里把叶子节点和节点都统一看待
     * 而叶子节点不能调用以下方法的(print除外)
     */

    public void print() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }
}
