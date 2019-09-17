package cn.lai.designpatterns.decorator;

public class Milk extends Condiment {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "加上了牛奶";
    }
}
