package cn.lai.designpatterns.strategy;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/11 11:21
 */
public abstract class Duck {
    protected FlyBehavior fb;
    protected QuackBehavior qb;

    public abstract void performQuack();
    public abstract  void performFly();
}
