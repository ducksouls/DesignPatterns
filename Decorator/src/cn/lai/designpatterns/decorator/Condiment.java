package cn.lai.designpatterns.decorator;

/**
 * 装饰器
 */
public abstract class Condiment extends Beverage {

    Beverage beverage;

    @Override
    public abstract String getDescription();

}
