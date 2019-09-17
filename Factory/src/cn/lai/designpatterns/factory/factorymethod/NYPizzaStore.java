package cn.lai.designpatterns.factory.factorymethod;

import cn.lai.designpatterns.factory.NYChesePizza;
import cn.lai.designpatterns.factory.NYVeggiePizza;
import cn.lai.designpatterns.factory.Pizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("chese".equals(type)) {
            pizza = new NYChesePizza();
        }
        if ("veggie".equals(type)) {
            pizza = new NYVeggiePizza();
        }
        return pizza;
    }
}
