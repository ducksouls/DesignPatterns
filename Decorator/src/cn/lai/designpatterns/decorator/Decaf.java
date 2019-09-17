package cn.lai.designpatterns.decorator;

public class Decaf extends Beverage {

    public Decaf() {
        description = "我是一杯decaf。。。";//这是继承自Beverage
    }

    @Override
    public double cost() {
        return 100;
    }
}
