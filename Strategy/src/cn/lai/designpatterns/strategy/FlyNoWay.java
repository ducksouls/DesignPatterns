package cn.lai.designpatterns.strategy;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/11 11:16
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不会飞...");
    }
}
