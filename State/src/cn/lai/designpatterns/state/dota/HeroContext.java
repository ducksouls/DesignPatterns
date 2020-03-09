package cn.lai.designpatterns.state.dota;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/9 14:24
 */
public class HeroContext {
    public static final RunState COMMON = new CommonRun();
    public static final RunState SPEED_UP = new SpeedUpRun();
    public static final RunState SPEED_DOWN = new SpeedDownRun();
    public static final RunState SWIM = new Swim();

    private RunState state = COMMON;
    private Thread runThread;

    /**
     * 判断是否正在跑
     */
    private boolean isRunning() {
        return runThread != null && !runThread.isInterrupted();
    }

    /**
     * 开始跑动,由子线程打印信息
     */
    public void startRun() {
        if(this.isRunning()) {return;}
        final HeroContext hero = this;
            runThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while(!runThread.isInterrupted()) {
                        try {
                            state.run(hero);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            state = COMMON;
            System.out.println("------------jugg开始跑了---------");
            runThread.start();

    }

    /**
     * 停止跑位
     */
    public void stopRun() {
        if(this.isRunning()){
            this.runThread.interrupt();
        }
        System.out.println("-------------jugg停止跑动--------------");
    }

    public void run() throws InterruptedException {
        state.run(this);
    }

    public RunState getState() {
        return state;
    }

    public void setState(RunState rs) {
        state = rs;
    }
}
