package cn.lai.designpatterns.factory.simplefactory;

import cn.lai.designpatterns.factory.Pizza;

/**
 * 简单工厂，通常用静态方法来实现
 */
public class PizzaStore {
    
    public void orderPizza(String type) {
        Pizza pizza = null;
        pizza = SimplePizzaFactory.createPizza(type);

    }
}
