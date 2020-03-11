package cn.lai.designpatterns.strategy;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/11 11:20
 */
public class NoSound implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我发不出声音...");
    }
}
