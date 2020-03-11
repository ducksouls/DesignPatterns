package cn.lai.designpatterns.strategy;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/11 11:35
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        fb = new FlyByThrowing();
        qb = new SqueakSound();
        System.out.println("我是模型鸭...");
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
