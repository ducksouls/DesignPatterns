package cn.lai.designpatterns.state.dota;

/**
 * @Description: 跑动状态的接口
 * @author: ZNXM-007
 * @date 2020/3/9 14:24
 */
public interface RunState {
    void run(HeroContext hc) throws InterruptedException;
}
