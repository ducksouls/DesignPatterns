package cn.lai.designpatterns.state.dota;

/**
 * @Description: 减速状态...
 * @author: ZNXM-007
 * @date 2020/3/9 14:26
 */
public class SpeedDownRun implements RunState {
    @Override
    public void run(HeroContext hc) throws InterruptedException {
        System.out.println("-------jugg 被减速了----------");
        hc.setState(HeroContext.SPEED_DOWN);
//        Thread.sleep(2000);
        System.out.println("---减速4s结束,正常了---");
        hc.setState(HeroContext.COMMON);

    }
}
