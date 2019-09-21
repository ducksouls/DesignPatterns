package cn.lai.designpatterns.factory.simplefactory;

import cn.lai.designpatterns.factory.CheesePizza;
import cn.lai.designpatterns.factory.PeperoniPizza;
import cn.lai.designpatterns.factory.Pizza;

public class SimplePizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese"))
            pizza = new CheesePizza();
        if (type.equals("peperoni"))
            pizza = new PeperoniPizza();
        return pizza;
    }
}
