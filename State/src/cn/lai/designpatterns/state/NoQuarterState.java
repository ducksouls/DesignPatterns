package cn.lai.designpatterns.state;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/6 14:09
 */
public class NoQuarterState implements State {

    GumBallMachineContext context;

    public NoQuarterState(GumBallMachineContext context) {
        this.context = context;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你充值了25块钱");
        context.setState(context.getHasQuarterState());
    }

    /**
     * 理论上下面都是空方法的,因为该状态不能直接转换到下面的状态
     * 但可以提示错误的原因
     */
    @Override
    public void ejectQuarter() {
        System.out.println("你没充钱,怎么退钱啊!!!");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("你就算拉了摇杆,没充钱怎么给你东西...");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("你没充钱怎么就想糖吃...");
    }
}
