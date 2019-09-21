package cn.lai.designpatterns.decorator;

public class Mocha extends Condiment {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() +30;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "加入摩卡";
    }
}
