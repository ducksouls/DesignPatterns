package cn.lai.designpatterns.composite;


import java.util.Iterator;
import java.util.Stack;

/**
 * @Description: 迭代器的具体实现
 * @author: ZNXM-007
 * @date 2020/3/16 9:48
 */
public class CompositeIterator implements Iterator {
    //用栈来记录遍历的情况,类似遍历树
    //栈中存放的都是迭代器(ITerator)

    private Stack stack = new Stack();

    CompositeIterator(Iterator it) {
        //把Menu或者MenuItem创建的iterator压栈
        stack.push(it);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        } else {
            Iterator iterator = (Iterator)stack.peek();
            //判断stack中的iterator是否还能继续遍历
            if (!iterator.hasNext()) {
                //pop掉遍历完的menu
                stack.pop();
                //再在上一级中判断是否还有没有遍历的节点
                return this.hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
//        好像这个判断没有很必要的样子
        if (hasNext()) {
            Iterator iterator = (Iterator)stack.peek();
            AbstractMenuComponent next = (AbstractMenuComponent)iterator.next();
            if (next instanceof Menu) {
                //只有menu才会被压栈
                stack.push(next.createIterator());
            }
            return next;
       }
        return null;
    }
}
