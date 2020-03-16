package cn.lai.designpatterns.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/16 8:54
 */
public class Menu extends AbstractMenuComponent {

    private ArrayList<AbstractMenuComponent> menuList = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;

    }

    @Override
    public Iterator createIterator() {
        //把ArrayList的Iterator返回,这是底层实现迭代的方法
        this.print();
        return menuList.iterator();
    }

    @Override
    public void add(AbstractMenuComponent component) {
        menuList.add(component);
    }

    @Override
    public void remove(AbstractMenuComponent component) {
        menuList.remove(component);
    }

    @Override
    public AbstractMenuComponent getChild(int i) {
        return menuList.get(i);
    }


    /**
     * 内部迭代
     */
    public void print1() {
        System.out.println();
        System.out.print(getName());
        System.out.println(",   " + getDescription());
        System.out.println("........................");
        Iterator<AbstractMenuComponent> iterator = menuList.iterator();
        while (iterator.hasNext()) {
            AbstractMenuComponent next = iterator.next();
            if( next instanceof  Menu) {
               ((Menu) next).print1();
            }else  {
                next.print();
            }

        }
    }

    /**
     * 外部迭代
     * 无法从根节点开始
     */
    @Override
    public void print() {
        System.out.println();
        System.out.print(getName());
        System.out.println(",   " + getDescription());
        System.out.println("........................");
    }



    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }
}
