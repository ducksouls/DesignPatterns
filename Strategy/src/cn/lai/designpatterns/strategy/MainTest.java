package cn.lai.designpatterns.strategy;

import sun.util.locale.provider.JRELocaleProviderAdapter;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/11 11:29
 */
public class MainTest {
    public static void main(String[] args) {
        Duck redFaceDuck = new RedFaceDuck();
        redFaceDuck.performFly();
        redFaceDuck.performQuack();
        System.out.println("--------------");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        System.out.println("--------------");
        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        System.out.println("--------------");
    }
}
