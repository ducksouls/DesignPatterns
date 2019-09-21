package cn.lai.designpatterns.decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "家混？？？---好吧，我就是一种混合咖啡";//这是继承自Beverage
    }

    @Override
    public double cost() {
        return 150;
    }
}
