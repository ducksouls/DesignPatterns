package cn.lai.designpatterns.factory.factorymethod;

import cn.lai.designpatterns.factory.Pizza;

/**
 * 工厂方法
 *
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = null;
        return pizza;
    }

    /**
     * 工厂方法，每个继承这个类的子类都需要实现此方法，即创建具体对象交由了子类对象完成
     * @param type
     * @return
     */
   public abstract Pizza createPizza(String type);


}
