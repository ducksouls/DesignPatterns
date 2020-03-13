package cn.lai.designpatterns.adapter;

/**
 * 绿头鸭
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("i am flying");
    }
}
