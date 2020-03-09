package cn.lai.designpatterns.state;

import java.util.Random;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/6 14:09
 */
public class HasQuarterState implements State {
    GumBallMachineContext context;
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumBallMachineContext context) {
        this.context = context;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你已经充了钱了,不用再充了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("买卖不成仁义在...钱还给你");
        context.setState(context.getNoQuarterState());
    }

    @Override
    public boolean turnCrank() {
        System.out.println("拉了摇杆,马上就给你糖...");
        int winner = randomWinner.nextInt(10);

        if((winner == 0) && (context.getCount() > 1)) {
            System.out.println("中奖");
            context.setState(context.getWinnerState());
        } else {
            System.out.println("没中奖");
            context.setState(context.getSoldState());
        }
        return true;
    }

    @Override
    public void dispense() {
        //这可以是个空方法,在这个状态中并没有什么作用
    }
}
