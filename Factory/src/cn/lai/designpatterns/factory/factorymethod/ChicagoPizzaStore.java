package cn.lai.designpatterns.factory.factorymethod;

import cn.lai.designpatterns.factory.ChicagoChesePizza;
import cn.lai.designpatterns.factory.ChicagoVeggiePizza;
import cn.lai.designpatterns.factory.NYChesePizza;
import cn.lai.designpatterns.factory.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("chese".equals(type)) {
             pizza = new ChicagoChesePizza();
        }
        if ("veggie".equals(type)) {
             pizza = new ChicagoVeggiePizza();
        }
        return pizza;
    }
}
