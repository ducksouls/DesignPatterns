package cn.lai.designpatterns.strategy;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/11 11:19
 */
public class SqueakSound implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱吱...");
    }
}
