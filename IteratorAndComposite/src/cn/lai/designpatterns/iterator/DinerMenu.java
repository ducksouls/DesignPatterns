package cn.lai.designpatterns.iterator;


/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/14 8:55
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItem = 0;
    MenuItem[] menuItems;

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems)
                ;

    }

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("蛋炒饭", "蛋炒饭", false, 12.5);
        addItem("西红柿炒鸡蛋", "西红柿炒鸡蛋", false, 22.5);
        addItem("炒生菜", "炒生菜", true, 10);
        addItem("牛杂汤", "牛杂汤", false, 45.5);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItem >= MAX_ITEMS) {
            System.err.println("菜单满了");
        } else {
            menuItems[numberOfItem] = menuItem;
            numberOfItem = numberOfItem + 1;
        }
    }
}
