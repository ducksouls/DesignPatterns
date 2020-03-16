package cn.lai.designpatterns.composite;

import java.util.Iterator;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/16 8:48
 */
public class MenuItem extends AbstractMenuComponent {

    String name;
    String description;
    boolean isVegetarian;
    double price;

    public MenuItem(String name, String description, boolean isVegetarian, double price) {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void print() {
        System.out.print(this.getName());
        if(this.isVegetarian) {
            System.out.print("---V");
        }
        System.out.print(",   "+ getPrice());
        System.out.println(",   ---"+ getDescription());
        System.out.println("........................");
        System.out.println();
    }

    /**
     * 用户违规操作时才会调用这个方法
     * @return
     */
    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
