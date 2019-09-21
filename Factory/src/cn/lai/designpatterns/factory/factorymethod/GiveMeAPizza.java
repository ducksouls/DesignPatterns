package cn.lai.designpatterns.factory.factorymethod;

import cn.lai.designpatterns.factory.Pizza;

/**
 * 超类---> | 种类1（工厂1）---->|具体产品1
 *                             |具体产品2
 *                             |具体产品3
 *         | 种类2（工厂2）
 *  如果需要扩展工厂类可以很方便的实现超类即可
 *
 */
public class GiveMeAPizza {

    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chese = nyPizzaStore.createPizza("chese");
        Pizza veggie = nyPizzaStore.createPizza("veggie");
        Pizza chese1 = chicagoPizzaStore.createPizza("chese");
        Pizza veggie1 = chicagoPizzaStore.createPizza("veggie");

    }
}
