package cn.lai.designpatterns.state;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/6 17:16
 */
public class WinnerState implements State {
    GumBallMachineContext context;
    public WinnerState(GumBallMachineContext context) {
        this.context = context;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你已经充钱了...不用再充了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你都到这里了,还想退钱...");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("再拉也只能出一个");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("你居然中奖了,给你两个糖");
        context.releaseBall();
        if (context.getCount() == 0) {
            context.setState(context.getSoldOutState());
        } else {
            context.releaseBall();
            if (context.getCount() > 0) {
                context.setState(context.getNoQuarterState());
            } else {
                System.out.println("卖完咯");
                context.setState(context.getSoldOutState());
            }
        }






    }
}
