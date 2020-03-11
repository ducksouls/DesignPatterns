package cn.lai.designpatterns.strategy;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/11 11:13
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞在天上...");
    }
}
