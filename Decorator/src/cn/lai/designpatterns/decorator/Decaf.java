package cn.lai.designpatterns.decorator;

public class Decaf extends Beverage {

    public Decaf() {
        //这是继承自Beverage
        description = "我是一杯decaf。。。";
    }

    @Override
    public double cost() {
        return 100;
    }
}
