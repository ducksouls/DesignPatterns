package cn.lai.designpatterns.strategy;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/11 11:17
 */
public class FlyByThrowing implements FlyBehavior  {
    @Override
    public void fly() {
        System.out.println("被扔飞的...");
    }
}
