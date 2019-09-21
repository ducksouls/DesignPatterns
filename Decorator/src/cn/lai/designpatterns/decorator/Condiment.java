package cn.lai.designpatterns.decorator;

public abstract class Condiment extends Beverage {

    Beverage beverage;

    public abstract String getDescription();

}
