package cn.lai.designpatterns.composite;

import java.util.Iterator;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/16 9:08
 */
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("餐厅菜单", "所有菜品都在这里");
        Menu menuLunch = new Menu("午饭菜单", "所有的午饭");
        Menu menuBreakFirst = new Menu("早饭菜单", "所有的早饭");
        Menu menuDinner = new Menu("晚饭饭菜单", "所有的晚饭");
        Menu menuLunchDesert = new Menu("午饭甜点", "所有的午饭甜点");

        MenuItem menuItem = new MenuItem("炒粉", "早饭", false, 3.00);
        MenuItem menuItem2 = new MenuItem("沙拉", "晚饭", true, 10.00);
        MenuItem menuItem3 = new MenuItem("爆炒猪腰", "午饭", false, 30.00);
        MenuItem menuItem4 = new MenuItem("水果拼盘", "午饭", true, 20.00);
        MenuItem menuItem5 = new MenuItem("小馒头", "午饭", true, 20.00);
        MenuItem menuItem6 = new MenuItem("浓汤", "午饭", true, 20.00);
        MenuItem menuItem7 = new MenuItem("酸奶", "午饭", true, 20.00);
        //无限递归
//        menu.add(menu);
        menu.add(menuLunch);
        menuLunch.add(menuItem3);
        menuLunch.add(menuItem4);
        menuLunch.add(menuLunchDesert);

        menuLunchDesert.add(menuItem5);
        menuLunchDesert.add(menuItem6);
        menuLunchDesert.add(menuItem7);

//        menu.print1();

        System.out.println("#############################");

        Iterator iterator = menu.createIterator();
        CompositeIterator compositeIterator = new CompositeIterator(iterator);
        //这里调用不到根节点
        while(compositeIterator.hasNext()) {
            AbstractMenuComponent next = (AbstractMenuComponent)compositeIterator.next();
            next.print();
        }


    }
}
