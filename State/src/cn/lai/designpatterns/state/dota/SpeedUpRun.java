package cn.lai.designpatterns.state.dota;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/9 14:26
 */
public class SpeedUpRun implements RunState {
    @Override
    public void run(HeroContext hc) throws InterruptedException {
        hc.setState(HeroContext.SPEED_UP);
        System.out.println("----jugg 加速咯----");
//        Thread.sleep(2000);
        hc.setState(HeroContext.COMMON);
        System.out.println("---加速结束---");
    }
}
