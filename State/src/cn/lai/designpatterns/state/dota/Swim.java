package cn.lai.designpatterns.state.dota;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/9 14:27
 */
public class Swim implements RunState {
    @Override
    public void run(HeroContext hc) throws InterruptedException {
        hc.setState(HeroContext.SWIM);
        System.out.println("----jugg 被眩晕了3秒---");
//        Thread.sleep(3000);
        System.out.println("---3秒过去,jugg 正常了---");
        hc.setState(HeroContext.COMMON);
    }
}
