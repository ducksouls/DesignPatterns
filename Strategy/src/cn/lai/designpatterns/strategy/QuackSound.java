package cn.lai.designpatterns.strategy;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/11 11:18
 */
public class QuackSound implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("gagaga...");
    }
}
