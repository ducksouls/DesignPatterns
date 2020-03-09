package cn.lai.designpatterns.state.dota;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/9 14:14
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Hero hero = new Hero();
//        hero.startRun();
//        hero.setState(Hero.SPEED_UP);
//        Thread.sleep(5000);
//        hero.setState(Hero.SPEED_DOWN);
//        Thread.sleep(5000);
//        hero.setState(Hero.SWIM);
//        Thread.sleep(5000);
//        hero.stopRun();

        HeroContext hc = new HeroContext();
        hc.startRun();
        hc.setState(HeroContext.SPEED_UP);
//        Thread.sleep(5000);
        hc.setState(HeroContext.SWIM);
//        Thread.sleep(5000);
        hc.setState(HeroContext.SPEED_DOWN);
//        Thread.sleep(5000);
        hc.stopRun();

    }
}
