package cn.lai.designpatterns.strategy;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/11 11:31
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        fb = new FlyWithWings();
        qb = new QuackSound();
        System.out.println("我是绿头鸭...");
    }

    @Override
    public void performQuack() {
        qb.quack();
    }

    @Override
    public void performFly() {
        fb.fly();
    }
}
