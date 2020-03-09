package cn.lai.designpatterns.state;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/6 14:08
 */
public class SoldState implements State {
    GumBallMachineContext context;

    public SoldState(GumBallMachineContext context) {
        this.context = context;
    }

    @Override
    public void insertQuarter() {
        System.out.println("别急嘛,一个一个来,等这单出了,再充钱");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("售出恕不退货...");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("再拉也只能出一个");
        return false;
    }

    @Override
    public void dispense() {
        this.context.releaseBall();
        if(this.context.getCount() > 0 ) {
            //this.context.setCount(this.context.getCount() -1);
            System.out.println("拿完糖赶紧走...");
            this.context.setState(this.context.getNoQuarterState());
        } else {
            System.out.println("Ceeeeeeb,不巧没货了");
            this.context.setState(this.context.getSoldOutState());
        }

    }
}
