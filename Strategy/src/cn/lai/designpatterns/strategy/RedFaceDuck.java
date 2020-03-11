package cn.lai.designpatterns.strategy;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/11 11:24
 */
public class RedFaceDuck extends Duck {

    public RedFaceDuck(){
        fb = new FlyNoWay();
        qb = new QuackSound();
        System.out.println("我是红面鸭...");
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
